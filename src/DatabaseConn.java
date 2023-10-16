import java.sql.*;
public class DatabaseConn {

        public static void main(String[] args) {
            String dbUrl = "jdbc:mysql://localhost:3306/mydatabase";
            String username = "your_username";
            String password = "your_password";

            try {
                // Step 1: Register the JDBC driver (optional for newer versions of JDBC drivers)
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Step 2: Establish a connection to the database
                Connection connection = DriverManager.getConnection(dbUrl, username, password);

                // Step 3: Create a statement object to execute SQL queries
                Statement statement = connection.createStatement();

                // Step 4: Execute SQL queries (e.g., SELECT, INSERT, UPDATE, DELETE)
                ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
                while (resultSet.next()) {
                    // Process the result set, e.g., get data from columns
                    String name = resultSet.getString("name");
                    int age = resultSet.getInt("age");
                    System.out.println("Name: " + name + ", Age: " + age);
                }

                // Step 5: Close the resources (statement, connection, etc.)
                resultSet.close();
                statement.close();
                connection.close();
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
    }

