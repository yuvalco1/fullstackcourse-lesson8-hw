public class Manager extends Employee{
    public double bonus;

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String n, double s, int year, int month, int day, double bonus) {
        super(n, s, year, month, day);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void showInfo(){

        //System.out.println("name=" + this.name + ",salary=" + this.salary + ",hireDay=" + this.hiredate + ",bonus=" + this.bonus);
        super.showInfo();
        System.out.println(",bonus=" + this.bonus);

    }
}
