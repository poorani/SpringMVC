<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <title> Student-form  </title>
    <body>
        <form:form action="processForm" modelAttribute="student">
        Firstname : <form:input path="firstName" /> <br>
        Lastname : <form:input path="lastName" /> <br>

        <input type = "submit" value = "Submit" />
        </form:form>
    </body>
</html>