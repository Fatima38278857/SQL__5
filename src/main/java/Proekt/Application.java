package Proekt;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Application {
    public static void main(String[] args) {
        EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();
        CityDAO cityDao = new CityDAOImpl();

        City city1 = new City( "Москва");
        Employee employee1 = new Employee(8, "Саша", "Левицкий", "M", 33, city1);
        Employee employee2 = new Employee(9, "Саня", "Дунов", "M", 25, city1);
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        cityDao.addToTableCity(city1);


        // cityDao.getAllCity();
    }

}
