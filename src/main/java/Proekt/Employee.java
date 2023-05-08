package Proekt;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private  int id;
    @Column (name = "first_nama")
    private String first_nama;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "gender")
    private String gender;
    @Column(name = "age")
    private int age;
    @Column(name = "city_id")
    private int citytwo;

    public Employee() {
    }

    public Employee( String first_nama, String last_name, String gender, int age,  int citytwo) {
        this.first_nama = first_nama;
        this.last_name = last_name;
        this.gender = gender;
        this.age = age;
        this.citytwo = citytwo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_nama() {
        return first_nama;
    }

    public void setFirst_nama(String first_nama) {
        this.first_nama = first_nama;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCitytwo() {
        return citytwo;
    }

    public void setCitytwo(int citytwo) {
        this.citytwo = citytwo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", first_nama='" + first_nama + '\'' +
                ", last_name='" + last_name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", citytwo=" + citytwo +
                '}';
    }
}


