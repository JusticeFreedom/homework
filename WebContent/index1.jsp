<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>    
    <title>添加书本信息</title>
    <link rel="stylesheet" href="css/index.css" type="text/css" />
  </head>
  <body>
  <form action="Insertservlet" method="post">
    <table border="1" class="t1">
        <tr>
            <td colspan="2"><h1>添加book信息</h1></td>
        </tr>
        <tr>
            <td>书名:</td>
            <td><input  type="text" name="bookname"/></td>
        </tr>
        <tr>
            <td>作者:</td>
            <td><input  type="text" name="bookauthor"/></td>
        </tr>
        <tr>
            <td>发行日期:</td>
            <td><input  type="text" name="bookdate"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input  type="submit" value="提交"/>
                <input  type="reset" value="清空"/>
            </td>
        </tr>
    </table>
   </form>
  </body>
</html>