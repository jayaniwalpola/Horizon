<%@page import="java.sql.*" %>
<%
    
    
   
        String id=request.getParameter("id");
        
        
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        
        Class.forName("com.mysql.jdbc.Driver");
        
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lab1","root","");
        
        pst=con.prepareStatement("delete from details where id=?");
        pst.setString(1, id);
       
        pst.executeUpdate();
        
        %>
        
        <script>
            alert("Record Deleted");
            
        </script>
        <%
            RequestDispatcher rd=request.getRequestDispatcher("lab-bookappointment.jsp");
            
%>
        
