<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
		<title>Customer Confirmation</title>
</head>
	<body>
	
	The customer name is confirmed : ${customer.firstName} ${customer.lastName} <!-- it internally calls customer.getFirstname -->
	
	<br><br>
	
	free passes: ${customer.freePasses}
	
	<br><br>
	
	postal code: ${customer.postalCode}
	
	</body>
</html>

	