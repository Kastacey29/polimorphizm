import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Car implements Competing {
    private String brand;
    private String model;
    private double engineVolume;
    private final Set<Driver> drivers = new HashSet<>(1);
    private final Set<Sponsor> sponsors = new HashSet<>();
    private final Set<Mechanic> mechanics = new HashSet<>();


    public Car(String brand, String model, double engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
    }

    protected abstract void start();

    protected abstract void finish();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "Не определено";
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty()) {
            this.model = "Не определено";
        } else {
            this.model = model;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume < 0) {
            this.engineVolume = 0;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public Set<Mechanic> getMechanics() {
        return mechanics;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && brand.equals(car.brand) && model.equals(car.model) && drivers.equals(car.drivers) && sponsors.equals(car.sponsors) && mechanics.equals(car.mechanics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, drivers, sponsors, mechanics);
    }

    public abstract void printType();

    public abstract boolean passDiagnostics();

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", drivers=" + drivers +
                ", sponsors=" + sponsors +
                ", mechanics=" + mechanics +
                '}';
    }
}
