package employee;

public class Employee {

    int no;

    String name;

    int year;

    String department;

    public static final int Base_Salary = 500;

    public void work(){
        System.out.println("Employee is working");
    }

    public double calculateSalary(){
        return Base_Salary;
    }

    public void printInfo(){
        System.out.println("\nNO:" + no);
        System.out.println("name:" + name);
        System.out.println("Year:" + year);
        System.out.println("Department:" + department);
    }

    public static int getBase_Salary(){
      return Base_Salary;
    }

    public Employee(int no, String name, int year, String department) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.department = department;
    }
}
