package custemer;

import javax.persistence.Entity;
import javax.persistence.Id;

public class Custemer {
	
	private long no;
	private String pass;
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}
