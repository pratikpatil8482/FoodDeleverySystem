package custemer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustemerCrud {
	
	public Connection connection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/fooddb","root","root");
	}
	
	public void saveAdmin(Custemer custemer) throws ClassNotFoundException, SQLException {
		PreparedStatement preparedStatement=connection().prepareStatement("INSERT INTO custemer VALUES(?,?)");
		preparedStatement.setLong(1, custemer.getNo());
		preparedStatement.setString(2, custemer.getPass());
		
		int res=preparedStatement.executeUpdate();
		System.out.println((res>0?"Admin Register Succes":"Admin Not Register"));
	}
	public boolean login(long mo,String pass) throws ClassNotFoundException, SQLException {
		PreparedStatement statement=connection().prepareStatement("SELECT * FROM custemer where mo=? and pass=?");
		statement.setLong(1, mo);
		statement.setString(2, pass);
		ResultSet res=statement.executeQuery();
		long modb=0;String passdb="";
		if(res.next()) {
			modb=(long) res.getObject("mo");
			passdb=(String) res.getObject("pass");
		}
		return modb==mo&& passdb.equals(pass);
	
	}
}