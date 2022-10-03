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


    public Car setCar(String carRights) {
        Car car = null;
        if (carRights.equals("B")) {
            car = new Automobile("Hyundai", "Avante", 1.6);
        }
        if (carRights.equals("C")) {
            car = new Truck("Mercedes-Benz", "1217", 6.0);

        }
        if (carRights.equals("D")) {
            car = new Bus("Витязь", "Р-12", 2.5);

        }
        return car;
    }

    public String getCarRights() {
        return carRights;
    }

    public void setCarRights(String carRights) {
        if (carRights.equals("B") || carRights.equals("C") || carRights.equals("D")) {
            this.carRights = carRights;
        } else {

            this.carRights = "не определено";
        }
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public void start(Driver driver) {
        System.out.println("Водитель начинает движение на " + driver.setCar(driver.carRights));
        driver.setCar(driver.getCarRights()).start();
    }

    public void finish(Driver driver) {
        System.out.println("Водитель финиширует на " + driver.setCar(driver.carRights));
        driver.setCar(driver.carRights).finish();
    }

    public void refillCar(Driver driver) {
        driver.setCar(driver.carRights).doPitStop();
        System.out.println("Водитель заправляет " + driver.setCar(driver.carRights).getBrand());
    }

    public void declare(Driver driver) {
        System.out.println("Водитель " + driver.getFullName() + " управляет автомобилем " + driver.setCar(driver.carRights) + " и" +
                " будет участвовать в заезде");
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
