<%-- 
    Document   : certificate
    Created on : Feb 2, 2016, 10:45:22 AM
    Author     : alkathirikhalid www.alkathirikhalid.com
--%>

<html>
  <head>
    <title>Certificate Information</title>

    <link rel="stylesheet" type="text/css" href="stylesheet.css">
  </head>
  <body>

    <table>
      <tr>
        <th colspan="2">Certificate Information</th>
      </tr>
      <tr>
        <td>First Name: </td>
        <td>${requestScope.certificate.firstName}</td>
      </tr>
      <tr>
        <td>Last Name: </td>
        <td>${requestScope.certificate.lastName}</td>
      </tr>
      <tr>
        <td>ID: </td>
        <td>${requestScope.certificate.id}</td>
      </tr>
      <tr>
        <td>Category: </td>
        <td>${requestScope.certificate.category}</td>
      </tr>      
    </table>

    <p>Go back to <a href="index.jsp" class="link">application home</a>.</p>
  </body>
</html>

