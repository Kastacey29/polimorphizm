import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class StationOfMaintenance {
    private final Queue<Car> cars = new ArrayDeque<>();

    public void addAutomobile(Automobile automobile) {
        cars.offer(automobile);
    }

    public void addTruck(Truck truck) {
        cars.offer(truck);
    }

    public void service() {
        if (!cars.isEmpty()) {
            Car car = cars.poll();
            boolean isPassDiagnostics = car.passDiagnostics();
            if (!isPassDiagnostics) {
                car.doPitStop();
            }
        }
    }
}
