package org.gaurav;

public class App 
{
    public static void main( String[] args )
    {
        LoginService service = new LoginService();

        service.login("");               // logs ERROR
        service.login("admin");         // logs WARNING
        service.login("gaurav");        // logs INFO
    }
}
