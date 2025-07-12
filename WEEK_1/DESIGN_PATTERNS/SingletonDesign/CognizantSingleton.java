public class CognizantSingleton {

    private static CognizantSingleton employee;
    private CognizantSingleton() {
        System.out.println("Cognizant Singleton employee Created!");
    }
    
    public static CognizantSingleton getEmployee(){
        if(employee == null){
            synchronized (CognizantSingleton.class) {
                if (employee == null) {
                    employee = new CognizantSingleton();
                }
            }
        }
        return employee;
    }

    public void displayMessage() {
        System.out.println("Welcome to Cognizant Singleton Pattern Example!");
    }
}
