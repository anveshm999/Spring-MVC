<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
		<title>Student Registration Form</title>
</head>
	<body>
		
		<form:form action="processForm" modelAttribute = "student"> <!-- model attribute should match the attribute of model define in controller -->
		
		First name: <form:input path="firstName"/> <!-- property of student class -->
		
		<br><br>
		
		Last name: <form:input path="lastName"/> <!-- property of student class -->
		
		<br><br>                                  <!-- when form is loaded spring will call getters of first,last names
														and when form is submitted, it calls setters -->
		
		
		Country:<form:select path="country">
				<form:options items= "${student.countryOptions}" /> <!-- Reading the values from JAVA -->
		
				</form:select>
		
		<br><br>
		
		<input type="submit" value="Submit"/>
		
		</form:form>
		
	</body>
</html>