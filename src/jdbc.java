import java.sql.*;
public class jdbc {
    public static void main(String[] args) throws Exception
    {
        String url="jdbc:mysql://localhost:3306/demo";
        String uname="root";
        String pass="";
      //  String query="insert into student values(5,'manoj'),(6,'mahi')";
        System.out.println("hello2");
        int userid=8;
        String username="deepali";
        String query ="insert into student values (?,?)";
     Class.forName("com.mysql.cj.jdbc.Driver");
     //connection is interface(not create object directly),so use method getConnection
     Connection con=DriverManager.getConnection(url,uname,pass);
     PreparedStatement st=con.prepareStatement(query);
     /* ----try1----

     ResultSet rs=st.execute(query);
     String userdata=" ";
     while (rs.next())
     {
         userdata = rs.getInt(1) + ":" + rs.getString(2);

         System.out.println(userdata);
     }

        -----try2-----

        int count =st.executeUpdate(query);
        System.out.println(count+ " row/s affected");
  */



     st.setInt(1,userid);
     st.setString(2,username);
     int count =st.executeUpdate();
     System.out.println(count+ " row/s affected");

     st.close();
     con.close();
    }
}
