<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 10/6/2026
  Time: 9:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Reservation</title>
</head>
<body>

<form method="post" action="reserve">
    <label>Customer Name
        <input type="text" name="customerName" placeholder="Enter your name" required>
    </label>

    <br>

    <label>Movie Name
        <input type="text" name="movieName" placeholder="Enter movie name" required>
    </label>

    <br>

    <label>Ticket Price
        <input type="number" name="ticketPrice" placeholder="Enter price" min="0" step="50" required>
    </label>

    <br>

    <label>Number of Tickets
        <input type="number" name="ticketNum" placeholder="Enter number of tickets" min="1" required>
    </label>

    <br>

    <button type="submit">Reserve</button>
</form>

</body>
</html>
