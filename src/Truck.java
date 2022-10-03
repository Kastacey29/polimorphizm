public class Truck extends Car implements Competing {
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
    public String toString() {
        return "Truck{" +
                "brand='" + super.getBrand() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", engineVolume=" + super.getEngineVolume() +
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
