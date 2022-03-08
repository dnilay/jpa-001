<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>List Employees</title>
	
	

</head>

<body>

	
		
			<table>
				<tr>
					<th>Employee Name</th>
					<th>Salary</th>
					<th>Email</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="employee" items="${employees}">
				
					<tr>
						<td> ${employee.employeeName} </td>
						<td> ${employee.salary} </td>
						<td> ${employee.email} </td>
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	

</body>

</html>








