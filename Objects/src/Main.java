public class Main {

    public static void main(String[] args){
        Employee employeeOne = new Employee("Matheesha", "Kurunegala", 20000, 24);

        Employee employeeTwo = new Employee("Kushmi", "Colombo", 30000, 23);

        employeeTwo.raiseSalary();

        System.out.println(employeeOne.salary);

        System.out.println(employeeTwo.salary);
    }

}

