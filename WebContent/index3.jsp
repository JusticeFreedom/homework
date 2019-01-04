<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>    
    <title>修改书本信息</title>
    <link rel="stylesheet" href="css/index.css" type="text/css" />
  </head>
  
  <body>
    <form action="updateservlet" method="post">
    <table border="1" class="t1">
        <tr>
            <td colspan="2"><h1>修改书本信息</h1></td>
        </tr>
        <tr>
            <td>编号:</td>
            <td><input  type="text" name="bookid" value="${book.bookid}" readonly="readonly"/></td>
        </tr>
        
        <tr>
            <td>书名:</td>
            <td><input  type="text" name="bookname" value="${book.bookname}"/></td>
        </tr>
        <tr>
            <td>作者:</td>
            <td><input  type="text" name="bookauthor" value="${book.bookauthor}"/></td>
        </tr>
         <tr>
            <td>发行日期:</td>
            <td><input  type="text" name="bookdate" value="${book.bookdate}"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input  type="submit" value="提交"/>
                <input  type="button" value="返回" onclick="history.go(-1)"/>
            </td>
        </tr>
    </table>
   </form>
  </body>
</html>