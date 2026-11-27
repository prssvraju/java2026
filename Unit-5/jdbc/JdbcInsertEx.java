import java.sql.*;
public class JdbcInsertEx {
        public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/5410";
        String user="root";
        String password="";

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,user,password);
            String sqlString="insert into student values(?,?,?)";
            
            // PreparedStatement ps=con.prepareStatement(sqlString);
            // ps.setInt(1,5410);
            // ps.setString(2,"sarvan");
            // ps.setInt(3,90);
            // int res= ps.executeUpdate();
            // System.out.println(res +"Record inserted successfully.");

            
            // DELETE
            String del = "DELETE FROM student WHERE roll = ?";
            PreparedStatement ps = con.prepareStatement(del);
            ps.setInt(1, 5427);
            System.out.println(ps.executeUpdate() + " row deleted");
            




            // UPDATE
            // String upd = "UPDATE student SET name = ? WHERE roll = ?";
            // PreparedStatement ps = con.prepareStatement(upd);
            // ps.setString(1, "Kiran");
            // ps.setInt(2, 5410);
            // System.out.println(ps.executeUpdate() + " row updated");
            


        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}