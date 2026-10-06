<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 10/6/2026
  Time: 9:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Result</title>
</head>
<body>

<h2>Reservation Summary</h2>

<p>
    Customer: ${customerName}
</p>

<p>
    Movie: ${movieName}
</p>

<p>
    Ticket Price: ${ticketPrice}$
</p>

<p>
    Number of Tickets: ${ticketNum}
</p>

<hr>

<p>
    Total Price: ${totalPrice}$
</p>

<p>
    Discount: ${discount}%
</p>

<p>
    Final Price: ${finalPrice}$
</p>

</body>
</html>
