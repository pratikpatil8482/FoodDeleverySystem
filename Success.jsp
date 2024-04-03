<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Catalog</title>
<style>
body {
	font-family: 'Arial', sans-serif;
	margin: 0;
	padding: 0;
	background-color: #f4f4f4;
}

h3, h4, p {
	margin: 10px 0;
}

.navigation button, .navigation a button {
	margin: 5px;
	padding: 10px 15px;
	background-color: #007bff;
	color: white;
	border: none;
	cursor: pointer;
}

.navigation button:hover, .navigation a button:hover {
	background-color: #0056b3;
}

footer {
	background-color: #333;
	color: white;
	text-align: center;
	padding: 10px;
	position: fixed;
	left: 0;
	bottom: 0;
	width: 100%;
}

table {
	width: 80%;
	margin: 20px auto;
	border-collapse: collapse;
}

td {
	border: 1px solid #ddd;
	text-align: center;
	padding: 10px;
}

img {
	width: auto; /* Adjust based on your preference */
	height: 250px; /* Adjust to maintain aspect ratio */
	margin-top: 10px;
}

a {
	text-decoration: none;
	color: inherit;
}

.mdiv {
	text-align: center;
}

marquee {
	color: grey;
	font-size: 24px;
}

/* Ensuring the img element inside .mdiv respects the width of its parent */
.mdiv img {
	max-width: 100%;
	height: auto;
}

/* Adjust the alignment and styling of the product details */
h3, p {
	text-align: center;
}

.navigation ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
}

.navigation ul li {
	display: inline;
	margin-right: 10px;
}

.navigation ul li a {
	text-decoration: none;
	color: #333; /* Change color as needed */
	padding: 10px;
	border: 1px solid #333; /* Add border to each link */
	border-radius: 5px; /* Add some border radius for rounded corners */
}

.navigation ul li a:hover {
	background-color: #333; /* Change background color on hover */
	color: white; /* Change text color on hover */
}

.navigation ul li button {
	padding: 20px; border : none;
	background-color: transparent; /* Remove background color */
	cursor: pointer;
	border: none;
}

.navigation ul li button:hover {
	color: red; /* Change text color on hover */
}
</style>
</head>
<body>
	<div class="mdiv">
		<div align="left">
			<%
			long name = (Long) request.getAttribute("name");
			%>
			<marquee>
				<h4>
					Welcome Admin ,
					<%=name%>
				</h4>
			</marquee>
		</div>
		<div class="navigation" align="center">
			<ul>
				<li><a href="fetchfromorders">Orders</a></li>
				<li><a href="addfood.jsp">Add Product</a></li>
				<li><a href="updatefood.jsp">Update</a></li>
			</ul>
		</div>
		<br>
		<br>
		<div align="center">
			<img alt="poster"
				src="https://tse1.mm.bing.net/th?id=OIP.kXNNes41mkMVI_-46ATvLgHaE8&pid=Api&rs=1&c=1&qlt=95&w=187&h=124.jpg"
				width="100%">
		</div>

		<h2>Available Product's</h2>
		<div>
			<table width="50%" align="center">
				<tr>
					<td><a href=""> <img
							src="https://tse3.mm.bing.net/th?id=OIP.Mpi_TY8vpgDrQIzaCTCEtAHaF1&pid=Api&P=0&h=180"
							alt="Product" height="300px">
							<h3>Sandwich</h3> <b><p>Price: 200.00</p></b>
							</h3></td>
					<td><a href=""> <img
							src="https://tse3.mm.bing.net/th?id=OIP.BEH8rpIxoiUt_AQDRmSYTAHaFY&pid=Api&P=0&h=180"
							alt="Product" height="300px">
							<h3>Pizza</h3> <b><p>Price: 451.00</p></b>
							</h3></td>
				</tr>
			</table>
		</div>
		<hr>
		<div>
			<table width="50%" align="center">
				<tr>
					<td><a href=""> <img
							src="https://tse3.mm.bing.net/th?id=OIP.Mpi_TY8vpgDrQIzaCTCEtAHaF1&pid=Api&P=0&h=180"
							alt="Product" height="300px">
							<h3>Sandwich</h3> <b><p>Price: 200.00</p></b>
							</h3></td>
					<td><a href=""> <img
							src="https://tse3.mm.bing.net/th?id=OIP.BEH8rpIxoiUt_AQDRmSYTAHaFY&pid=Api&P=0&h=180"
							alt="Product" height="300px">
							<h3>Pizza</h3> <b><p>Price: 451.00</p></b>
							</h3></td>
				</tr>
			</table>
		</div>
		<hr>
	</div>
	<footer>
		<p>&copy; 2023 My Website. All rights reserved.</p>
	</footer>
</body>
</html>
