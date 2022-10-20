import java.util.ArrayList;
import java.util.Set;

public class Mechanic<T extends Car> {
    private final String name;
    private final String surname;
    private String company;
    public Set<T> CarsForMaintenance;


    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Set<T> getCarsForMaintenance() {
        return CarsForMaintenance;
    }

    public void setCarsForMaintenance(Set<T> carsForMaintenance) {
        CarsForMaintenance = carsForMaintenance;
    }

    public void doMaintenance(T car) {
        System.out.println("Механик " + this.name + " провел техобслуживание машины " + car.getBrand());
    }

    public void fixCar(T car) {
        System.out.println("Механик " + this.name + " починил машину " + car.getBrand());
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", company='" + company + '\'' +
                ", CarsForMaintenance=" + CarsForMaintenance +
                '}';
    }
}
