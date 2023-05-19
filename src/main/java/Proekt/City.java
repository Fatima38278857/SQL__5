package Proekt;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "city_name")
    private String city_name;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
    private List<Employee> employeeList;

    public City() {
    }

    public City( String city_name) {
        this.city_name = city_name;
        this.employeeList = employeeList;

    }



    public int getCity_id() {
        return id;
    }

    public void setCity_id(int city_id) {
        this.id = id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "City{" +
                "ID =" + id +
                ", Город ='" + city_name + '\'' +
                ", employeeList=" + employeeList +
                '}';
    }
}
