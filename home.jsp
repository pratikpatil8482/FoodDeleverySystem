<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="styles.css">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="styles.css">
<style type="text/css">
.mdiv {
	height: 100vh;
	width: 100%;
	position: fixed;
	top: 0px;
	left: 0px;
	background-color: azure;
	display: flex;
	align-items: center;
	justify-content: center;
}

* {
	margin: 0px;
	padding: 0px;
	box-sizing: border-box;
	font-family:  sans-serif;
}

.login {
	height: 500px;
	width: 450px;
	background-image: linear-gradient(#f7f9fa, #b0dcf5);
	box-shadow: 0px 0px 30px skyblue;
	border-radius: 50px;
	padding: 30px;
}
</style>
</head>
<body>


	<div class="mdiv">
	
		<div class="login" align="center">
<marquee ><h1>Welcome To Food Delevery System </h1></marquee>


			<div>
				<img alt="poster"
					src="https://img.freepik.com/free-vector/happy-tiny-people-near-huge-welcome-word-flat-illustration_74855-10808.jpg?size=626&ext=jpg"
					height="600px">

			</div>

			<div>
				<div>

					<img alt=""
						src="https://tse1.mm.bing.net/th?id=OIP.2Ukm6kqR0b5TtSLEXGHa3QHaHa&pid=Api&rs=1&c=1&qlt=95&w=121&h=121"
						height="100px"> <img alt=""
						src="https://tse1.mm.bing.net/th?id=OIP.R2Ww0UQru7VIDWlB9TQ9pQHaHa&pid=Api&rs=1&c=1&qlt=95&w=111&h=111"
						height="100px">

				</div>

				<button>
					<a href="admin.jsp">Admin</a>
				</button>

				<button>
					<a href="custemer.jsp">Custemer</a>
				</button>

			</div>
		</div>


	</div>
</body>
</html>