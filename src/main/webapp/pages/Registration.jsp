<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>New User Registration</h1>  
        <form action="/save" 
            method="post">
 
            <table border="0" cellpadding="10">
                <tr>
                    <td>User Name:</td>
                    <td><input type="text" name="user_name" /></td>
                </tr>
                <tr>
                    <td>User email</td>
                    <td><input type="text" name="user_email" /></td>
                </tr>
                <tr>
                    <td>User phone</td>
                    <td><input type="text" name="user_phone" /></td>
                </tr>
                <tr>
                    <td>password</td>
                    <td><input type="password" name="password" /></td>
                </tr>                            
                <tr>
                    <td colspan="2"><button type="submit">Save</button> </td>
                </tr>
            </table>
        </form>
</body>
</html>