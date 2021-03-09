<%-- 
    Document   : lab-bookappointment
    Created on : Mar 9, 2021, 7:19:27 PM
    Author     : Jayani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book Appointment</title>
        <style type="text/css">
            .divA,.divD{
                padding: 5px;
                margin: 5px;
               
            }
            .main{
                padding: 5px;
                margin: 5px;
                border: solid 1px black;
            }
        </style>
    </head>
    <body>
        <div class="main">
            <div class="divA">
                <h3>Select Appointment Type</h3>
                <label>Select Type:</label>
                <select>
                    <option name="a">ECG</option>
                    <option name="b">Lab Test(blood or urine)</option>
                    <option name="c">Container Pick Up/Specimen Drop Off</option>
                    <option name="d">Lab Test & ECG</option>
                    <option name="e">Lab Test Pediatric</option>
                </select>
            </div>
            <div class="divD">
                <h3>Select Date:</h3>
                <label>Select Date:</label>
                <input type="date" name="bookdate"/>
            </div>
            
        </div>
    </body>
</html>
