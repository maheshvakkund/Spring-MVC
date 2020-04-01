<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
		First name:<form:input path="firstName" />
		<br>
		<br>
	
		Last name:<form:input path="lastName" />
		<br>
		<br>
		<form:select path="country">
			<form:options items="${student.countryOption}" />
		</form:select>
		<br>
		<br>
		
		Favourite Language:
		JAVA<form:radiobutton path="pgmLanguage" value="Java" />
		C#<form:radiobutton path="pgmLanguage" value="C#" />
		PHP<form:radiobutton path="pgmLanguage" value="PHP" />
		Ruby<form:radiobutton path="pgmLanguage" value="Ruby" />
		<br>
		<br>


		<input type="submit" value="submit">
	</form:form>
</body>
</html>