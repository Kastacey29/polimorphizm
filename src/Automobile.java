public class Automobile extends Car implements Competing {
    TypeOfBody typeOfBody;

    public Automobile(String brand, String model, double engineVolume, TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.typeOfBody = typeOfBody;
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
        if (typeOfBody == null) {
            System.out.println("Данных недостаточно!");
        } else {
            System.out.println("Тип кузова: " + typeOfBody);
        }
    }

    @Override
    public boolean passDiagnostics() {
        return Math.random()>0.5;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "brand='" + super.getBrand() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", engineVolume=" + super.getEngineVolume() +
                ", tupeOfBody=" + this.typeOfBody +
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
