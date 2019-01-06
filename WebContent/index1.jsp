<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>显示书本信息</title>
    <style type="text/css">
            table {
                border: 1px solid pink;
                margin: 0 auto;
            }
            
            td{
                width: 150px;
                border: 1px solid pink;
                text-align: center;
            }
    </style>
</head>
<body>
    <table>
    		<tr>
    			<td colspan="5">图书信息</td>
    		</tr>
        <tr>
            <td>编号</td>
            <td>书名</td>
            <td>作者</td>
            <td>发行日期</td>
            <td>操作</td>
        </tr>
            <c:forEach items="${bookList}" var="item">
            <tr>
                <td>${item.bookid }</td>
                <td>${item.bookname }</td>
                <td>${item.bookauthor }</td>
      					<td>${item.bookdate}</td>
   							 <td><a href="deleteservlet?bookid=${item.bookid}">删除</a>|<a href="updateservlet?bookid=${item.bookid}">修改</a></td>
            </tr>
            </c:forEach>
        <tr>
            <td colspan="5"><a href="Selectservlet">查询书本信息</a>|<a href="index2.jsp">添加书本信息</a></td>
        </tr>
    </table>
</body>
</html>