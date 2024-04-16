package AddEmployeePage;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AddEmpSQLQueries {
    public static void addEmployee(String position1, String fName, String lName, String gender, String hiringDate, String email, String salary, String  DOB, String deptID, String branchID) throws SQLException, ClassNotFoundException {
        List<String> tasks = new ArrayList<>();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management", "root", "spv@2112");

        String query = "INSERT INTO\n" +
                "employee (position, fName, lName, gender, hiringDate, email, salary, DOB, deptID, branchID)\n" +
                "VALUES ("
                + position1 +", "
                + fName + ", "
                + lName + ", "
                + gender +","
                + hiringDate + ", "
                + email +", "
                + salary + ", "
                + DOB + ", "
                + deptID + ", "
                + branchID +
                ")";
        PreparedStatement preparedStatement = con.prepareStatement(query);

        int rowsAffected = preparedStatement.executeUpdate();

        preparedStatement.close();
        con.close();

        if (rowsAffected > 0)
            JOptionPane.showMessageDialog(null, "Employee Added Successfully.");
        else
            JOptionPane.showMessageDialog(null, "Failed to add Employee.");

    }
}