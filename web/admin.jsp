<%-- 
    Document   : admin
    Created on : Mar 21, 2021, 3:10:08 PM
    Author     : Jayani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.*" %>
<%--<%@page import="javax.servlet.http.Add" %>--%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin page</title>
        <style type="text/css">
            
               
            
            .main{
                padding: 5px;
                margin: 5px;
                border: solid 1px black;
            }
        </style>
    </head>
    <body>
        
            
            
            
            
                
           
            
            
        
        <div>
            <h1>Appointment list</h1>
            <table border="1">
                <tr>
                    <th>Patient Name</th>
                    <th>Patient id</th>
                    <th>Doctor id</th>
                    <th>Patient Contact no</th>
                    <th>Appointment type</th>
                    <th>Appointment date</th>
                    <th>Appointment time</th>
                    
                    <th>Delete</th>
                        
                </tr>
                
                 <%
                     try{
                               
                              Connection con;
                              PreparedStatement pst;
                              ResultSet rs;
        
                              Class.forName("com.mysql.jdbc.Driver");
        
                              con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lab1","root","");
                              String query="select * from details";
                              Statement st=con.createStatement();
                              rs=st.executeQuery(query);
                              
                              while(rs.next()){
                                  String id=rs.getString("id");
                              

                            %>
                            <tr>
                                <td><%=rs.getString("pname") %></td>
                                <td><%=rs.getString("pid") %></td>
                                <td><%=rs.getString("did") %></td>
                                <td><%=rs.getString("pno") %></td>
                                <td><%=rs.getString("type") %></td>
                                <td><%=rs.getString("date") %></td>
                                <td><%=rs.getString("time") %></td>
                                
                                <td><a href="Delete.jsp?id=<%=id%>" >Delete</a></td>
                            </tr>
                            <%
                               }  
}catch(Exception ex){
System.out.println(ex.getMessage());
}
                            %>
            </table>
        </div>
        
    
            
    </body>
</html>

