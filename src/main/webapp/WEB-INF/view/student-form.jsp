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
        Firstname : <form:input path="firstName" /> <br>
        Lastname : <form:input path="lastName" /> <br>
        <form:errors path="lastName" cssClass="error" />

        <input type = "submit" value = "Submit" />
        </form:form>
    </body>
</html>