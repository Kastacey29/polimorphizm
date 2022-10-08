public class Bus extends Car implements Competing {
    Capacity capacity;

    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
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
        if (capacity == null) {
            System.out.println("Данных недостаточно!");
        } else {
            System.out.println("Вместимость: " + capacity);
        }
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + super.getBrand() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", engineVolume=" + super.getEngineVolume() +
                ", capacity=" + this.capacity +
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
