<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
    <title> Student-form  </title>
        <style>
        .error{
        color:red
        }
        </style>
    </head>

    <body>
        <form:form action="processForm" modelAttribute="student">
        Firstname : <form:input path="firstName" /> <br><br>
        Lastname : <form:input path="lastName" /> <br><br>
        <form:errors path="lastName" cssClass="error" />
        Age: <form:input path="age" /> <br>
        <form:errors path="age" cssClass="error" />
        Postal Code: <form:input path="postalCode" /> <br>
        <form:errors path="postalCode" cssClass="error" />

        <input type = "submit" value = "Submit" />
        </form:form>
    </body>
</html>