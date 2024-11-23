package travelmanagementsystem;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    //step 1 register the driver class
    Conn() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            //Step 2 creating connetion string
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelmanagementsystem", "root", "");
            //step 3 creating the statement
            s = c.createStatement();
            //step 4 executing mysql query
            //step 5 closing the connection(optional)
            
        } catch (Exception e) {

        }

    }
}
