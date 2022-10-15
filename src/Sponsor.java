import java.util.ArrayList;
import java.util.List;

public class Sponsor {
    private final String name;
    private final boolean isCompany;
    private double sumSupport;
    private List<Car> supportedCars = new ArrayList<>();

    public Sponsor(String name, boolean isCompany, double sumSupport) {
        if (name == null || name.isEmpty()) {
            this.name = "не определено";
        } else {
            this.name = name;
        }
        this.isCompany = isCompany;
        this.sumSupport = sumSupport;
    }

    public String getName() {
        return name;
    }

    public void sponsorRace() {
        System.out.println("Спонсор " + this.name + " спонсирует: " + getSupportedCars());
    }


    public boolean getIsCompany() {
        return isCompany;
    }

    public List<Car> getSupportedCars() {
        return supportedCars;
    }

    public double getSumSupport() {
        return sumSupport;
    }

    public void setSumSupport(double sumSupport) {
        this.sumSupport = sumSupport;
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "name='" + name + '\'' +
                ", isCompany=" + isCompany +
                ", sumSupport=" + sumSupport +
                ", supportedCars=" + supportedCars +
                '}';
    }
}
