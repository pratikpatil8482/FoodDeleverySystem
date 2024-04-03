<%@page import="cart.Cart"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f0f0;
        margin: 0;
        padding: 20px;
    }

    table {
        width: 100%;
        border-collapse: collapse;
        margin-top: 20px;
    }

    th, td {
        padding: 10px;
        border: 1px solid #ddd;
        text-align: left;
    }

    th {
        background-color: #f2f2f2;
    }

    tr:nth-child(even) {
        background-color: #f9f9f9;
    }

    tr:hover {
        background-color: #f2f2f2;
    }
</style>
</head>
<body>
<%
    List<Cart> list = (List<Cart>) request.getAttribute("product");
%>

<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Quantity</th>
        <th>Price</th>
    </tr>
    <% for (Cart cart : list) { %>
        <tr>
            <td><%= cart.getId() %></td>
            <td><%= cart.getName() %></td>
            <td><%= cart.getQnt() %></td>
            <td><%= cart.getPrice() %></td>
        </tr>
    <% } %>
</table>
</body>
</html>
