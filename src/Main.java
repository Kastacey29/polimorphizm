import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Automobile bmw = new Automobile("BMW", "Z8", 3.0, TypeOfBody.HATCHBACK);
        Automobile kia = new Automobile("Kia", "Sportage", 2.4, TypeOfBody.HATCHBACK);
        Automobile hyundai = new Automobile("Hyundai", "Avante", 1.6, TypeOfBody.SEDAN);
        Automobile lada = new Automobile("Lada", null, 1.7, TypeOfBody.SEDAN);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        System.out.println(lada);

        Truck volvo1 = new Truck("Volvo", "FH 12", 12.1, LoadCapacity.N1);
        Truck volvo2 = new Truck("Volvo", "FL", 6.7, LoadCapacity.N2);
        Truck mercedes = new Truck("Mercedes-Benz", "1217", 6.0, LoadCapacity.N1);
        Truck isuzu = new Truck("Isuzu", "NQR71", 5.2, LoadCapacity.N3);
        System.out.println(volvo1);
        System.out.println(volvo2);
        System.out.println(mercedes);
        System.out.println(isuzu);
        Bus sokol = new Bus("Сокол", "H-204", 3.9, Capacity.MIDDLE);
        Bus vityaz = new Bus("Витязь", "Р-12", 2.5, Capacity.BIG);
        Bus vaz = new Bus("ВАЗ", "L58B69", 2.7, Capacity.ESPECIALLY_SMALL);
        Bus gaz = new Bus("ГАЗ", "В587Е96", 3.4, Capacity.SMALL);
        System.out.println(sokol);
        System.out.println(vityaz);
        System.out.println(gaz);
        System.out.println(vaz);

        System.out.println(mercedes.getMaxSpeed());
        bmw.doPitStop();
        System.out.println(vaz.getBestTimeOfCircle());

        Driver<Automobile> oleg = new Driver<>("Иванов Олег Васильевич", "B", 5.5);
        Driver<Truck> vlad = new Driver<>("Смирнов Владимир Михайлович", "C", 8.5);
        Driver<Bus> olga = new Driver<>("Сидорова Ольга Петровна", "D", 7.25);
        Set<Driver> drivers=new HashSet<>();
        drivers.add(oleg);
        drivers.add(olga);
        drivers.add(vlad);
        System.out.println(drivers);
        Sponsor ivanov = new Sponsor("IvanIvanov", false, 150000.0);
        Set<Sponsor>sponsors=new HashSet<>();
        sponsors.add(ivanov);
        System.out.println(sponsors);
        Mechanic<Truck> igor = new Mechanic("Igor", "Smirnov", "ServiceOfCars");
        Mechanic<Car> andrew = new Mechanic("Andrew", "Petrov", "FirstService");

        StationOfMaintenance first = new StationOfMaintenance();
        first.addAutomobile(bmw);
        first.service();
        oleg.declare(bmw);
        bmw.getDrivers().add(olga);
        bmw.getSponsors().add(ivanov);
        bmw.getMechanics().add(igor);
        ivanov.sponsorRace();
        System.out.println(olga);
        olga.declare(vaz);
        System.out.println(vlad);
        vlad.declare(mercedes);

        oleg.start(bmw);
        oleg.finish(bmw);
        oleg.refillCar(bmw);

        bmw.printType();
        System.out.println(bmw.typeOfBody.name());
        volvo1.printType();
        sokol.printType();
        System.out.println();
        checkCars(bmw, kia, hyundai, lada,
                volvo1, volvo2, mercedes, isuzu,
                sokol, vityaz, gaz, vaz);

        System.out.println();

        kia.getDrivers().add(oleg);
        Set<Car> cars = new HashSet<>();
        cars.add(lada);
        cars.add(bmw);
        cars.add(hyundai);
        cars.add(kia);
        cars.add(volvo1);
        cars.add(volvo2);
        cars.add(mercedes);
        cars.add(isuzu);
        cars.add(sokol);
        cars.add(vityaz);
        cars.add(vaz);
        cars.add(gaz);


        ivanov.getSupportedCars().add(bmw);
        ivanov.getSupportedCars().add(mercedes);


        igor.CarsForMaintenance = new HashSet<>();
        andrew.CarsForMaintenance = new HashSet<>();
        igor.getCarsForMaintenance().add(volvo1);
        volvo1.getMechanics().add(igor);
        andrew.getCarsForMaintenance().add(vityaz);
        vityaz.getMechanics().add(andrew);
        vityaz.getMechanics().add(igor);


        Set<Mechanic> mechanics = new HashSet<>();
        mechanics.add(igor);
        mechanics.add(andrew);
        mechanics.add(andrew);
        System.out.println(mechanics);
        printInfo(bmw);

    }

    public static void printInfo(Car car) {
        System.out.println("машина " + car);
        System.out.println("Водитель: " + car.getDrivers());
        System.out.println("Cпонсоры: " + car.getSponsors());
        System.out.println("Механики: " + car.getMechanics());
    }

    public static void checkCars(Car... cars) {
        for (int i = 0; i < cars.length; i++) {
            checkCar(cars[i]);
        }
    }

    private static void checkCar(Car car) {
        try {
            if (!car.passDiagnostics()) {
                throw new RuntimeException("Автомобиль " + car.getBrand() + " не прошел диагностику!");
            }

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

}