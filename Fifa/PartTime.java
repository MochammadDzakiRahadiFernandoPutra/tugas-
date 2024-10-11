package fifa;

public class PartTime extends Teacher {
    protected int hoursworked;
    protected int salary;

    public int getHoursworked() {
        return this.hoursworked;
    }

    public void setHoursworked(int hoursworked) {
        this.hoursworked = hoursworked;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    


    public PartTime() {
        super();
        hoursworked = 0;
        salary = 0;
    }

    public PartTime(String name, int age, String subject, int hoursworked) {
        super(name, subject, age);
        this.hoursworked = hoursworked;
    }

    public void println () {
        super.print();
        System.out.println("Hoursworked : "+hoursworked);
        System.out.println("Salary : "+salary);
    }



}