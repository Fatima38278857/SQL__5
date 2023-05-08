package Proekt;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {

    void setEmployee(Employee employee) throws SQLException; // Создание (добавление) сущности Employee в таблицу.
    void ChangeEmployeebyID(int id, Employee employee); // Изменение конкретного объекта Employee в базе по id.

    void deleteEmployee(int id); // Удаление конкретного объекта Employee из базы по id.
     void getAllEmployee(); // Все записи



}

