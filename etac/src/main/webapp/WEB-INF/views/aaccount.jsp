<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>ETAC Accounts</title>
</head>
<body>
	<h1>Accounts</h1>

	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


	<table border=1>
		<c:forEach items="${aAccountList}" var="aAccount" varStatus="i">
			<tr>
				<td>${aAccount.id}</td>
				<td>${aAccount.adUserName}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
