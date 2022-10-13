public abstract class Car implements Competing {
    private String brand;
    private String model;
    private double engineVolume;

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

    public abstract void printType();
    public abstract boolean passDiagnostics();

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
