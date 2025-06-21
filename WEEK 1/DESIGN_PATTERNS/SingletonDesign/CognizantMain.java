public class CognizantMain {
    public static void main(String[] args) {

        CognizantSingleton emp1 = CognizantSingleton.getEmployee();
        emp1.displayMessage();
        CognizantSingleton emp2 = CognizantSingleton.getEmployee();
        emp2.displayMessage();

        //checking singleton property

        if (emp1 == emp2) {
            System.out.println("both instances are same.");
        } else {
            System.out.println("Different instances were created.");
        }
       
    }
}
