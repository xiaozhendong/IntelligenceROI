import java.io.*;

/**
 * Created by xiaozhendong on 16-5-1.
 */
public class ObjectStreamTest {
    public static void main(String args[]) throws Exception {
        Employee harry = new Employee("Harry Hack", 5000, 1989, 10, 1);
        Manager carl = new Manager("Carl Cracker", 8000, 1987, 12, 15);
        carl.setSecetary(harry);
        Manager xzd = new Manager("xzd", 10000, 1995, 11, 20);
        xzd.setSecetary(harry);


        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(("employee.dat")))) {
            Manager newcarl = (Manager) in.readObject();
            System.out.println(newcarl.getName());
            System.out.println(newcarl.getSecetary().getName());
        }

    }
}

class Employee implements Serializable{
    private String name;
    private int Salary;
    private int borthyear;
    private int brothMonth;
    private int brothDay;

    public Employee(String name, int Salary, int borthyear, int brothMonth, int brothDay) {
        this.name = name;
        this.Salary = Salary;
        this.borthyear = borthyear;
        this.brothMonth = brothMonth;
        this.brothDay = brothDay;
    }

    public int getSalary() {
        return Salary;
    }

    public String getName() {
        return name;
    }

    public int getBorthyear() {
        return borthyear;
    }

    public int getBrothMonth() {
        return brothMonth;
    }

    public int getBrothDay() {
        return brothDay;
    }


}

class Manager extends Employee {
    private Employee Secetary;
    private String name;
    private int Salary;
    private int borthyear;
    private int brothMonth;
    private int brothDay;

    public Manager(String name, int Salary, int borthyear, int brothMonth, int brothDay) {
        super(name, Salary, borthyear, brothMonth, brothDay);
    }

    public Manager(String name, int Salary, int borthyear, int brothMonth, int brothDay, Employee Secetary) {
        super(name, Salary, borthyear, brothMonth, brothDay);
        this.Secetary = Secetary;
    }

    public Employee getSecetary() {
        return Secetary;
    }

    public void setSecetary(Employee secetary) {

        Secetary = secetary;
    }
}