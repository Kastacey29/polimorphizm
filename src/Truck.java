public class Truck extends Car implements Competing {
    LoadCapacity loadCapacity;

    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void start() {
        System.out.println(super.getBrand() + " стартует!");
    }

    @Override
    public void finish() {
        System.out.println(super.getBrand() + " финиширует!");
    }

    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Данных недостаточно!");
        } else {
            System.out.println("Грузоподъемность: " + loadCapacity);
        }
    }

    @Override
    public boolean passDiagnostics() {
        return Math.random()>0.5;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "brand='" + super.getBrand() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", engineVolume=" + super.getEngineVolume() +
                ", loadCapacity=" + this.loadCapacity +
                '}';
    }

    @Override
    public String getMaxSpeed() {
        return "Максимальная скорость среди грузовых автомобилей - 175 км/ч.";
    }

    @Override
    public String getBestTimeOfCircle() {
        return "Лучшее время в круге среди грузовых автомобилей: 18,15 мин.";
    }

    @Override
    public void doPitStop() {
        System.out.println("Грузовому автомобилю необходима тех. остановка!");
    }
}
