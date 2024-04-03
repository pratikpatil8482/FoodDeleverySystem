<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
/* styles.css */

body {
    font-family: 'Arial', sans-serif;
    background-color:skyblue;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    margin: 0;
}

form {
    background-color: #ffffff;
    padding: 20px;
    border-radius: 8px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    width: 300px;
}

form input[type="text"],
form input[type="password"] {
    width: calc(100% - 22px); /* Full width minus padding and border */
    padding: 10px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

button {
    width: 100%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

button:hover {
    background-color: grey;
}

/* Adjusting the button to improve accessibility */
button:focus {
    outline: none;
    box-shadow: 0 0 0 2px rgba(0, 0, 0, 0.1);
}

/* Style adjustments for better visual feedback */
form input[type="text"]:focus,
form input[type="password"]:focus {
    border-color: #4CAF50;
    outline: none;
}

/* Adding some space around the form */
body > form {
    margin: 20px;
}

</style>
<body>
		
		<form action="custemerlogin" >
		
		Mobile No :<input type="text" name="mo">
		Password :<input type="text" name="pass">
		
		<button type="submit">Submit</button>
		</form>

</body>
</html>