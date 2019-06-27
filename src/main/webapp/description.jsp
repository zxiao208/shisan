<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/27 0027
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${not empty description}">
    ${description.description}
</c:if>
<c:if test="${empty description}">
    数据为空，请检查数据！
</c:if>
</body>
</html>
