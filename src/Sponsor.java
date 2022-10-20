import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sponsor {
    private final String name;
    private final boolean isCompany;
    private double sumSupport;
    private Set<Car> supportedCars = new HashSet<>();

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

    public Set<Car> getSupportedCars() {
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
