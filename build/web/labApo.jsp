<%-- 
    Document   : labApo
    Created on : Mar 20, 2021, 10:04:16 PM
    Author     : Jayani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book Appointment</title>
        <style type="text/css">
            
               
            
            .main{
                padding: 5px;
                margin: 5px;
                border: solid 1px black;
            }
        </style>
    </head>
    <body>
        <h1>Book Appointment</h1>
        <div class="main">
            <form method="post" action="Add">   
            <table>
                <tr>
                    <td>Patient Name:</td>
                    <td><input type="text" name="pname"></td>
                </tr>
                <tr>
                    <td>Patient ID:</td>
                    <td><input type="text" name="pid"></td>
                </tr>
                <tr>
                    <td>Doctor ID:</td>
                    <td><input type="text" name="did"></td>
                </tr>
                <tr>
                    <td>Patient Contact No:</td>
                    <td><input type="text" name="pno"></td>
                </tr>
                <tr>
                    <td>Select Appointment Type:</td>
                    <td><select name="type">
                    <option name="a">ECG</option>
                    <option name="b">Lab Test(blood or urine)</option>
                    <option name="c">Container Pick Up/Specimen Drop Off</option>
                    <option name="d">Lab Test & ECG</option>
                    <option name="e">Lab Test Pediatric</option>
                </select></td>
                </tr>
                <tr>
                    <td>Select Date:</td>
                    <td><input type="date" name="date"/></td>
                </tr>
                <tr>
                    <td>Select Time:</td>
                    <td><input type="time"  name="time"></td>
                </tr>
               
                <tr>
                    <td></td>
                    <td><input type="submit" name="submit" value="Book"/></td>
                </tr>
                
                
            </table>
                
            </form>
            
            
            
            
                
           
            
            
        </div>
 
        
    
            
    </body>
</html>

