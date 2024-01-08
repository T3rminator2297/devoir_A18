<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculator Form</title>
</head>
<body>
<form action="calculator" method="post">
    <h1>Calculatrice form</h1>

    <label for="num1">Nombre 1:</label>
    <input type="text" name="num1" required>

    <label for="num2">Nombre 2:</label>
    <input type="text" name="num2" required>

    <label for="operation">Opération:</label>
    <select name="operation">
        <option value="multiply">Multiplier</option>
        <option value="divide">Diviser</option>
    </select>

    <br>
    <input type="submit" value="Calculer">
</form>
</body>
</html>
