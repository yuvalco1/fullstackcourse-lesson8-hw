public class Main {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(10, 3);
        System.out.println("Area: " + rec1.getArea());
        System.out.println("Perimeter: " + rec1.getPerimeter());
        System.out.println("Is square: " + rec1.isSquare());
        Rectangle rec2 = new Rectangle(10);
        System.out.println("Area: " + rec2.getArea());
        System.out.println("Perimeter: " + rec2.getPerimeter());
        System.out.println("Is square: " + rec2.isSquare());

        Car car1 = new Car("Toyota", 100000, true, "Yuval");
        System.out.println("Model: " + car1.getModel());
        System.out.println("Price: " + car1.getPrice());
        System.out.println("For sale: " + car1.isForSale());
        System.out.println("Owner: " + car1.getOwner());
        car1.setPrice("Yuval", 90000);
        car1.setPrice("Itai", 90000);
        car1.setForSale("Yuval", false);
        car1.setForSale("Itai", false);
        car1.setForSale("Yuval", true);
        car1.sale("Yuval", "Itai");


        Animal animal1 = new Animal();
        animal1.setAge(5);
        animal1.setName("Bobby");
        System.out.println("Name: " + animal1.getName());

        Dog animal2 = new Dog();
        animal2.setAge(55);
        animal2.setName("kippy");
        animal2.color = "black";
        animal2.sound();

        Employee carl = new Employee("Carl Cracker", 75000, 1987,12,15);
        Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        Employee tony = new Employee("Tony Tester", 40000, 1990, 3, 15);
        Manager yuval = new Manager("Yuval", 100000, 1995, 1,1,10000);
        yuval.setBonus(15000);

        carl.raiseSalary(5);
        harry.raiseSalary(5);
        tony.raiseSalary(5);

        carl.showInfo();
        harry.showInfo();
        tony.showInfo();
        yuval.showInfo();

        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = "+ printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = "+ printer.getPagesPrinted());




    }
}