<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Print Data</title>

<style>
    * {
        box-sizing: border-box;
    }

    body {
        font-family: Arial, sans-serif;
        background: #f2f4f8;
        margin: 0;
        min-height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        padding: 20px;
        color: #333;
    }

    .card {
        background: white;
        width: 100%;
        max-width: 450px;
        padding: 30px;
        border-radius: 15px;
        box-shadow: 0 5px 20px rgba(0, 0, 0, 0.1);
    }

    h2 {
        text-align: center;
        color: #4361ee;
        margin-top: 0;
        margin-bottom: 25px;
    }

    .data-row {
        display: flex;
        justify-content: space-between;
        align-items: center;
        gap: 15px;
        padding: 14px 12px;
        margin-bottom: 10px;
        background: #f8f9fc;
        border-radius: 8px;
        border-left: 4px solid #4361ee;
    }

    .label {
        font-weight: bold;
        color: #555;
    }

    .value {
        color: #222;
        overflow-wrap: anywhere;
        text-align: right;
    }

    .back-button {
        display: block;
        text-align: center;
        text-decoration: none;
        background: #4361ee;
        color: white;
        padding: 12px;
        border-radius: 8px;
        margin-top: 20px;
        transition: background 0.3s;
    }

    .back-button:hover {
        background: #3048c5;
    }
</style>

</head>
<body>

    <div class="card">
        <h2>Submitted Data</h2>

        <div class="data-row">
            <span class="label">User Name</span>
            <span class="value"><%= request.getParameter("fullName") %></span>
        </div>

        <div class="data-row">
            <span class="label">Password</span>
            <span class="value"><%= request.getParameter("password") %></span>
        </div>

        <div class="data-row">
            <span class="label">Age</span>
            <span class="value"><%= request.getParameter("age") %></span>
        </div>

        <div class="data-row">
            <span class="label">Address</span>
            <span class="value"><%= request.getParameter("address") %></span>
        </div>

        <a href="getData.jsp" class="back-button">Back to Form</a>
    </div>

</body>
</html>