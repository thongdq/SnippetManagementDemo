<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User of Snippet Management</title>
</head>
<body>
    <h2>List of Users</h2>
    <table>
        <tr>
            <td>NAME</td>
            <td>Joining Date</td>
            <td>Salary</td>
            <td>SSN</td><td></td>
        </tr>
        <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.name}</td>
                <td>${user.joiningDate}</td>
                <td>${user.salary}</td>
                <td><a href="<c:url value='/edit-${user.ssn}-user' />">${user.ssn}</a></td>
                <td><a href="<c:url value='/delete-${user.ssn}-user' />">delete</a></td>
            </tr>
        </c:forEach>
        <br/>
        <a href="<c:url value='/new' />">Add New Employee</a>
    </table>
</body>
</html>
