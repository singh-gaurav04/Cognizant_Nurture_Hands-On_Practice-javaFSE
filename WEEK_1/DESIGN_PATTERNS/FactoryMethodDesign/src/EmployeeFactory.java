public class EmployeeFactory {
    public static Employee getEmployee(String type) {

        if (type.trim().equalsIgnoreCase("ANDROID DEVELOPER")) {
            return new AndroidDeveloper();
        } else if (type.trim().equalsIgnoreCase("WEB DEVELOPER")) {
            return new WebDeveloper();
        }
        else{
             return null;
        }
       
    }
}