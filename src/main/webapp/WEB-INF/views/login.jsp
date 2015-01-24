<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>

<head>
<title>Login Page</title>
</head>
<body>
	<h3>Welcome BookPal's</h3>
	<c:url var="loginUrl" value="/j_spring_security_check"></c:url>
	<c:url var="signupurl" value="/bookuser/add"></c:url>
	<div>
		<table>
			<tr>
				<td>
					<h3>Login</h3>
					<div>
						<form:form action="${loginUrl}" method="POST"
							commandName="loginProps">
							<table>
								<tr>
									<td><form:label path="i_username">Mobile No:</form:label></td>
									<td><form:input type="text" path="i_username" /></td>
								</tr>
								<tr>
									<td><form:label path="i_password">Password:</form:label></td>
									<td><form:password path="i_password" /></td>
								</tr>
								<tr>
									<td colspan='2'><input name="submit" type="submit"
										value="Login" /></td>
								</tr>
							</table>
						</form:form>
					</div>
				</td>
			</tr>
			<tr>
				<td><div>
						<h3>Join BookPal's</h3>
						<form:form action="${signupurl}" commandName="bookPalUser"
							method="POST">
							<table>
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
									<td><form:label path="username">Mobile No:</form:label></td>
									<td><form:input type='text' path='username' /></td>
								</tr>
								<tr>
									<td><form:label path="password">Password:</form:label></td>
									<td><form:password path='password' /></td>
								</tr>
								<tr>
									<td><form:label path="gender">Gender:</form:label></td>
									<td><form:radiobutton path='gender' value="M" />Male
										&nbsp; <form:radiobutton path='gender' value="F" />Female</td>
								</tr>
								<tr>
									<td><form:label path="yearofbirth">Birth Year:</form:label></td>
									<td><form:select path="yearofbirth">
											<form:option value="0" selected="1">Year</form:option>
											<form:options items="${yearlist}" />
										</form:select></td>
								</tr>
								<tr>
									<td><form:label path="city">City:</form:label></td>
									<td><form:select path='city'>
											<form:option value="0" label="Select" />
											<form:options items="${cityList}" itemValue="city"
 												itemLabel="city" /> 
										</form:select></td> 
								</tr>
								<tr>
									<td><form:label path="landmark">I live near by:</form:label></td>
									<td><form:input path='landmark' /></td>
								</tr>
								<tr>
									<td colspan='2'>
<%-- 									<form:hidden path="role" />  --%>
									<input name="submit" type="submit" value="Sign Up" /></td>
								</tr>
							</table>
						</form:form>
					</div></td>
			</tr>
		</table>
	</div>
</body>
</html>