<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get Data</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f2f4f8;
        display: flex;
        justify-content: center;
        align-items: center;
        min-height: 100vh;
        margin: 0;
    }

    form {
        background-color: white;
        padding: 30px;
        width: 320px;
        border-radius: 12px;
        box-shadow: 0 4px 15px rgba(0, 0, 0, 0.1);
    }

    input[type="text"],
    input[type="password"],
    select {
        width: 100%;
        padding: 10px;
        margin-top: 5px;
        border: 1px solid #ccc;
        border-radius: 6px;
        box-sizing: border-box;
    }

    input[type="radio"] {
        margin-top: 10px;
        accent-color: #4361ee;
    }

    input[type="submit"] {
        width: 100%;
        padding: 12px;
        margin-top: 10px;
        background-color: #4361ee;
        color: white;
        border: none;
        border-radius: 6px;
        cursor: pointer;
        font-size: 16px;
    }

    input[type="submit"]:hover {
        background-color: #3048c5;
    }

    input:focus,
    select:focus {
        outline: none;
        border-color: #4361ee;
    }
</style>

</head>
<body>
    <form action="printData.jsp" method="post">
        User Name <br> <input type="text" name="fullName"><br><br>
        Password <br> <input type="password" name="password"><br><br>
        Age <br> <input type="text" name="age"><br><br>

        Address <br><input type="radio" name="address" value="cairo">
        Cairo
        <input type="radio" name="address" value="alex">
        Alex
        <input type="radio" name="address" value="menofia">
        Menofia

        <br><br>Address
        <br><select name="address">
            <option value="cairo">Cairo</option>
            <option value="alex">Alex</option>
            <option value="menofia">Menofia</option>
        </select>

        <br><br><input type="submit" value="submit">
    </form>
</body>
</html>