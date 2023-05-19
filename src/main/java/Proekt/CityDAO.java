package Proekt;

import java.util.List;

public interface CityDAO {



    void addToTableCity(City city);   // добавить город в таблицу

    void updateCity(int id, City city); //  обновление

    void findCityWithId(int id);      //  найти города по ID

    void getAllCity();  // Все города

    void delOneCity(int id); // Удалить по ID


}

