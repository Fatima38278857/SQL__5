package Proekt;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.sql.SQLException;
import java.util.List;


public  class EmployeeDAOImpl implements EmployeeDAO {


    public void setEmployee(Employee employee) throws SQLException { // СОЗДАТЬ (добавление) сущности Employee в таблицу.

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }

    @Override
    public void deleteEmployee(int id) { // Удаление конкретного объекта Employee из базы по id.

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("DELETE FROM Employee e where e.id = :id");
        query.setParameter("id", id);
        query.executeUpdate();
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }

    @Override
    public void ChangeEmployeebyID(int id, Employee employee) { // Изменение конкретного объекта Employee в базе по id
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery(" UPDATE Employee e SET e.first_nama = : first_name, e.last_name = : last_name, e.gender = :gender, e.age = :age,e.citytwo = :citytwo WHERE e.id = :id");
        query.setParameter("id", id);
        query.setParameter("first_name", employee.getFirst_nama());
        query.setParameter("last_name", employee.getLast_name());
        query.setParameter("gender", employee.getGender());
        query.setParameter("age", employee.getAge());
        query.setParameter("citytwo", employee.getCitytwo());
        query.executeUpdate();
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }
    public void getAllEmployee() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("SELECT e FROM Employee e ORDER BY e.id");
        entityManager.getTransaction().commit();

        List employeeList = query.getResultList();

        entityManager.close();
        entityManagerFactory.close();

        employeeList.stream().forEach(System.out::println);
    }


    }



