package employee;

public class Manager extends Employee {
String departmentManaged;
public static final int MANAGEMENT_PAYMENT = 5000;

    public Manager(int no, String name, int year, String department, String departmentManaged) {
        super(no, name, year, department);
        this.departmentManaged = departmentManaged;
    }
}
