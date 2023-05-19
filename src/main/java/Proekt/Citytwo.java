package Proekt;

public class Citytwo {


    private  String  city_name;

    public Citytwo(String city_name) {
        this.city_name = city_name;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    @Override
    public String toString() {
        return "Citytwo{" +
                "city_name='" + city_name + '\'' +
                '}';
    }
}