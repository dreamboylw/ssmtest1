<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2017/4/27
  Time: 12:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<table border="1" align="center">--%>
    <%--<tbody>--%>

    <%--<c:forEach items="${users}" var="data" varStatus="s">--%>
        <%--<tr>--%>
            <%--<td><c:out value="${s.index+1}"/></td>--%>
            <%--<td><c:out value="${data.userId}"/></td>--%>
            <%--<td><c:out value="${data.userName}"/></td>--%>
        <%--</tr>--%>
    <%--</c:forEach>--%>
    <%--</tbody>--%>
<%--</table>--%>

${users.userId}

${users.userName}
</body>
</html>
