public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(100000);
        HRManager mgr = new HRManager(200000);

        emp.work();
        System.out.println("The salary of the employees will be: " + emp.getSalary());


        mgr.work();
        System.out.println("The salary of the manager is: " + mgr.getSalary());

        mgr.addEmployee();
    }
}

public class Employee {
    private int salary;

    public Employee(int salary){
        this.salary = salary;
    }
    public void work(){
        System.out.println("The employees are working!");
    }
    public int getSalary(){
        return salary;
    }
}

public class HRManager extends Employee {
    public HRManager(int salary) {
        super(salary); //super keyword is used while using methods from parent class. here, parent class is Employee.
    }

    @Override
    public void work() {
        System.out.println("Managing employees!");
    }

    public void addEmployee() {
        System.out.println("Adding employees!");
    }
}

