<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
		<title>Customer Registration Form</title>
		
	<style>
		.error {color:red}
	</style>
		
</head>
	<body>
	
	
	<i>Fill out the form. Asterisk(*) means required.</i>
	
	<br><br>
	
	<form:form action="processForm" modelAttribute = "customer"> <!-- model attribute should match the attribute of model define in controller -->
		
		First name: <form:input path="firstName"/> <!-- property of student class -->
		
		<br><br>
		
		Last name (*): <form:input path="lastName"/> <!-- property of student class -->		
		<form:errors path = "lastName" cssClass="error"/>  <!-- validation message
																	cssStyle is the css property mentioned above for .error	 -->
		
		<br><br>  
		
		Free passes : <form:input path="freePasses" />
		<form:errors path="freePasses" cssClass="error" />
		
		<br><br>
		
		Postal code : <form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="error" />
		
		<br><br>
		                           
		
		<input type="submit" value="Submit"/>
		
		</form:form>
		
	</body>
</html>