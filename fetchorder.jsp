<%@page import="orders.Orders"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order List</title>
<style>
    table {
        width: 100%;
        border-collapse: collapse;
        margin-top: 20px;
    }
    
    th, td {
        border: 1px solid #dddddd;
        text-align: left;
        padding: 8px;
    }
    
    th {
        background-color: #f2f2f2;
    }
    
    tr:nth-child(even) {
        background-color: #f2f2f2;
    }
</style>
</head>
<body>
    <% 
        List<Orders> list = (List<Orders>) request.getAttribute("order"); 
        if (list != null && !list.isEmpty()) {
    %>
    <table>
        <thead>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Quantity</th>
                <th>Price</th>
            </tr>
        </thead>
        <tbody>
            <% for (Orders order : list) { %>
            <tr>
                <td><%= order.getId() %></td>
                <td><%= order.getName() %></td>
                <td><%= order.getQnt() %></td>
                <td><%= order.getPrice() %></td>
            </tr>
            <% } %>
        </tbody>
    </table>
    <% } else { %>
    <p>No orders available</p>
    <% } %>
</body>
</html>
