import java.sql.*;
public class JdbcSelectEx {
    public static void main(String args[])
    {
      String url = "jdbc:mysql://localhost:3306/5446";
      String usrid = "root";
      String pass = "";

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, usrid, pass);
            //System.out.println("Conneted");
            String sqlstatment ="SELECT * FROM student";
            Statement st = con.createStatement();
            ResultSet rs= st.executeQuery(sqlstatment);
           while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();;
        }
    }
    
}
