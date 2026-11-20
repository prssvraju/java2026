
import java.sql.*;
class JdbcSelectEx {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/aids";
        String user="root";
        String password="";

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,user,password);
            Statement stm=con.createStatement();
            ResultSet rs=stm.executeQuery("select * from student"); 
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);  
        }
    }
}
      