import java.util.Objects;

public class Driver<A extends Car> {
    private String fullName;
    private String carRights;
    private double experience;


    public Driver(String fullName, String carRights, double experience) {
        this.fullName = fullName;
        setCarRights(carRights);
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public String getCarRights() {
        return carRights;
    }

    public void setCarRights(String carRights) {
        if (carRights != null && (carRights.equals("B") || carRights.equals("C") || carRights.equals("D"))) {
            this.carRights = carRights;
        } else {
            throw new IllegalArgumentException("Укажите верную категорию прав!");
        }
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public void start(A car) {
        System.out.println("Водитель начинает движение на " + car.getBrand());
        car.start();
    }

    public void finish(A car) {
        System.out.println("Водитель финиширует на " + car.getBrand());
        car.finish();
    }

    public void refillCar(A car) {
        car.doPitStop();
        System.out.println("Водитель заправляет " + car.getBrand());
    }

    public void declare(A car) {
        System.out.println("Водитель " + this.fullName + " управляет автомобилем " + car.getBrand() + " и" +
                " будет участвовать в заезде");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver<?> driver = (Driver<?>) o;
        return Double.compare(driver.experience, experience) == 0 && fullName.equals(driver.fullName) && carRights.equals(driver.carRights);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, carRights, experience);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", carRights='" + carRights + '\'' +
                ", experience=" + experience +
                '}';
    }
}
