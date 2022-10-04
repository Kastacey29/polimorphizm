public class Main {
    public static void main(String[] args) {
        Automobile bmw = new Automobile("BMW", "Z8", 3.0);
        Automobile kia = new Automobile("Kia", "Sportage", 2.4);
        Automobile hyundai = new Automobile("Hyundai", "Avante", 1.6);
        Automobile lada = new Automobile("Lada", null, 1.7);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        System.out.println(lada);

        Truck volvo1 = new Truck("Volvo", "FH 12", 12.1);
        Truck volvo2 = new Truck("Volvo", "FL", 6.7);
        Truck mercedes = new Truck("Mercedes-Benz", "1217", 6.0);
        Truck isuzu = new Truck("Isuzu", "NQR71", 5.2);
        System.out.println(volvo1);
        System.out.println(volvo2);
        System.out.println(mercedes);
        System.out.println(isuzu);
        Bus sokol = new Bus("Сокол", "H-204", 3.9);
        Bus vityaz = new Bus("Витязь", "Р-12", 2.5);
        Bus vaz = new Bus("ВАЗ", "L58B69", 2.7);
        Bus gaz = new Bus("ГАЗ", "В587Е96", 3.4);
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
        System.out.println(oleg);
        oleg.declare(bmw);
        System.out.println(olga);
        olga.declare(vaz);
        System.out.println(vlad);
        vlad.declare(mercedes);

        oleg.start(bmw);
        oleg.finish(bmw);
        oleg.refillCar(bmw);


    }


}