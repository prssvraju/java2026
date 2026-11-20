import java.sql.*;
public class JdbcInsertEx {
        public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/aids";
        String user="root";
        String password="";

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,user,password);
            String sqlString="insert into student values(?,?,?)";
            PreparedStatement ps=con.prepareStatement(sqlString);
            ps.setInt(1,2);
            ps.setString(2,"Narsi");
            ps.setString(3,"1203");
            ps.executeUpdate();
            System.out.println("Record inserted successfully.");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}