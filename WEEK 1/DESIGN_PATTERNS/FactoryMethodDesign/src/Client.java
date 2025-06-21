public class Client {
    public static void main(String args[]){
        Employee emp1 = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        Employee emp2 = EmployeeFactory.getEmployee("WEB DEVELOPER");

        if(emp1 == null || emp2 == null) {
            System.out.println("Invalid employee type provided.");
            return;
        }

        System.out.println("Android Developer Salary: " + emp1.getSalary());
        System.out.println("Web Developer Salary: " + emp2.getSalary());
    }
}