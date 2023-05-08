package Proekt;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Application {
    public static void main(String[] args)throws SQLException {

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();

      //  employeeDAO.getAllEmployee();

       // employeeDAO.setEmployee(new  Employee("Тархан","Болотов", "M", 32,8));

     //   employeeDAO.deleteEmployee(6);

        employeeDAO.ChangeEmployeebyID(2, new Employee("Марина ", "Динарова", "W", 22, 2));
    }

}
