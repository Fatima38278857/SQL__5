package Proekt;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class CityDAOImpl implements CityDAO {

    @Override
    public void addToTableCity(City city) {



        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(city);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }


    @Override
    public void updateCity(int id, City city) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Query query = entityManager.createQuery("UPDATE City с SET с.city_name = :cityname WHERE с.id = :id");
        query.setParameter("cityname", city.getCity_name());
        query.setParameter("id", id);
        query.executeUpdate();

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }

    @Override
    public void findCityWithId(int id) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        City city = entityManager.find(City.class, id);
        entityManager.getTransaction().commit();

        System.out.println(city.getCity_name());
        city.getEmployeeList().stream().forEach(System.out::println);

        entityManager.close();
        entityManagerFactory.close();
    }

    @Override
    public void getAllCity() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Query query = entityManager.createQuery("select c from City c order by c.id");
        List<City> cityList = query.getResultList();

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

        for (City city : cityList) {
            System.out.println(city.getCity_name());
            city.getEmployeeList().stream().forEach(System.out::println);
        }
    }

    @Override
    public void delOneCity(int id) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        City city = entityManager.find(City.class, id);
        entityManager.remove(city);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
