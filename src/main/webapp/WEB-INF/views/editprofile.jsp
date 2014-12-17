<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>

<head>
<title>Edit Profile</title>
</head>
<body>
	<h3>Welcome BookPal's</h3>
	<c:url var="updateurl" value="/bookuser/update"></c:url>
	<div>
		<table>
			<tr>
				<td><div>
						<h3>Edit details</h3>
						<form:form action="${updateurl}"
							commandName="bookPalUser" method="POST">
							<table>
								<tr>
									<td><form:label path="username">Mobile No:</form:label></td>
									<td><form:input path='username' /></td>
								</tr>
								<tr>
									<td colspan="2"><div>
											<form:label path="firstname">First Name:</form:label>
											<form:input type='text' path='firstname' />
										</div>
										<div>
											<form:label path="lastname">Last Name:</form:label>
											<form:input type='text' path='lastname' />
										</div></td>
								</tr>
								<tr>
									<td><form:label path="gender">Gender:</form:label></td>
									<td><form:radiobutton path='gender' value="M" />Male
										&nbsp; <form:radiobutton path='gender' value="F" />Female</td>
								</tr>
								<tr>
									<td colspan="2">
										<div>
											<form:label path="dayofbirth">Day:</form:label>
											<form:select path="dayofbirth">
												<form:option value="0">Day</form:option>
												<form:options items="${daylist}" />
											</form:select>
										</div>
										<div>
											<form:label path="monthofbirth">Month:</form:label>
											<form:select path="monthofbirth">
												<form:option value="0" selected="1">Month</form:option>
												<form:options items="${monthlist}" />
											</form:select>
										</div>
										<div>
											<form:label path="yearofbirth">Year:</form:label>
											<form:select path="yearofbirth">
												<form:option value="0">Year</form:option>
												<form:options items="${yearlist}" />
											</form:select>
										</div>
									</td>
								</tr>
								<tr>
									<td><form:label path="completeaddress">Address:</form:label></td>
									<td><form:textarea rows="3" cols="5"
											path='completeaddress' /></td>
								</tr>
								<tr>
									<td><form:label path="city">City:</form:label></td>
									<td><form:select path='city'>
											<form:option value="0" label="Select" />
											<form:options items="${cityList}" itemValue="city"
												itemLabel="city" />
										</form:select> <form:hidden path='zipcode' /> <form:hidden path='state' />
										<form:hidden path='country' /> <form:hidden
											path='countrycode' /> <form:hidden path='mobileno' /></td>
								</tr>
								<tr>
									<td><form:label path="landmark">I live near by:</form:label></td>
									<td><form:input path='landmark' /></td>
								</tr>
								<tr>
									<td><form:label path="occupationid">Occupation:</form:label></td>
									<td><form:input path='occupationid' /></td>
								</tr>
								<tr>
									<td colspan='2'><form:hidden path="role" /> <input
										name="submit" type="submit" value="Update" /></td>
								</tr>
							</table>
						</form:form>
					</div></td>
			</tr>
		</table>
	</div>
</body>
</html>