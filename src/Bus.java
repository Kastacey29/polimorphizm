public class Bus extends Car implements Competing {
    public Bus(String brand, String model, double engineVolume) {
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
        return "Bus{" +
                "brand='" + super.getBrand() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", engineVolume=" + super.getEngineVolume() +
                '}';
    }

    @Override
    public String getMaxSpeed() {
        return "Максимальная скорость среди автобусов - 115 км/ч.";
    }

    @Override
    public String getBestTimeOfCircle() {
        return "Лучшее время в круге среди автобусов: 24,72 мин.";
    }

    @Override
    public void doPitStop() {
        System.out.println("Автобусу необходима тех. остановка!");
    }
}
