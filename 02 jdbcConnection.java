1) Connecting mysql with my Eclipse with using JDBC

      import java.sql.Connection;
      import java.sql.DriverManager;
      import java.sql.SQLException;
      public class JdbcExample {
      	public static void main(String[] args) throws ClassNotFoundException, SQLException{
      		//step 1 register the driver - This is the file(installed or downloaded) i given in javapath for my project
      		Class.forName("com.mysql.cj.jdbc.Driver");
      		
      		//step 2 Establish the connection   - here student is my database  - root is my id - venkataramana is my password of mysql 
      		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","venkataramana");
      		System.out.println("Connection created");
      	}
      }

OUTPUT :
      Connection created
