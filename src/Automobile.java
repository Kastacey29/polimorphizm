public class Automobile extends Car implements Competing {
    public Automobile(String brand, String model, double engineVolume) {
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
        return "Automobile{" +
                "brand='" + super.getBrand() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", engineVolume=" + super.getEngineVolume() +
                '}';
    }

    @Override
    public String getMaxSpeed() {
        return "Максимальная скорость среди легковых автомобилей - 215 км/ч.";
    }

    @Override
    public String getBestTimeOfCircle() {
        return "Лучшее время в круге среди легковых автомобилей: 10,25 мин.";
    }

    @Override
    public void doPitStop() {
        System.out.println("Легковому автомобилю необходима тех. остановка!");
    }
}
