import java.time.LocalDate;

public class Employee {
    public String name;
    public double salary;
    public LocalDate hiredate;

    public Employee() {
    }

    public Employee (String n, double s, int year, int month, int day){
        this.name = n;
        this.salary = s;
        this.hiredate = LocalDate.of(year, month, day);
    }

    public void raiseSalary(double byPercent){
        this.salary = this.salary * (1+byPercent/100);
    }

    public void showInfo(){
        System.out.println("name=" + this.name + ",salary=" + this.salary + ",hireDay=" + this.hiredate);


    }
}
