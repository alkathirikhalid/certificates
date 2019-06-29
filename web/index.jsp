<%-- 
    Document   : index
    Created on : Feb 2, 2016, 10:33:51 AM
    Author     : alkathirikhalid www.alkathirikhalid.com
--%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Certification Verification</title>

        <script type="text/javascript" src="javascript.js"></script>
        <link rel="stylesheet" type="text/css" href="stylesheet.css">
    </head>
    <body onload="init()">
        <h1>Certification Verification System</h1>

        <p><strong>The certification are periodically updated every 24h</strong></p>

        <p>In the form below, if you have the certificate ID enter the id, then click Quick Search, to verify a certificate.</p>
        <form action="autocomplete">
            <input name="action" value="lookup" hidden/>
            <strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Certificate ID:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</strong><input type="text" size="40" name="id" pattern="[0-9]{6}" placeholder=" Six Digit Number" required/>
            <input type="submit" value="Quick Search"/>
        </form>

        <p>In the form below, enter a student name. All matching possible names are displayed below
            the form, then click on one of the selections to see student certification details, a student might have multiple certification.</p>
<!--        
        <form name="autofillform" action="autocomplete">
            <table border="0" cellpadding="5"> 
                <tbody>
                    <tr>
                        <td><strong>Student Name:</strong></td>
                        <td>
                            <input type="text"
                                   size="40" pattern="[A-Za-z]" placeholder=" Student Name"
                                   id="complete-field"
                                   onkeyup="doCompletion()">
                        </td>
                    </tr>
                    <tr>
                        <td id="auto-row" colspan="2">
                            <table id="complete-table" class="popupBox" />
                        </td>
                    </tr>
                </tbody>
            </table>
        </form>
-->        
    </body>
</html>
