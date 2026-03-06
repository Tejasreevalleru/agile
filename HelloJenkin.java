import java.util.Date;

public class HelloJenkin {
    public static void main(String[] args) {
        String message = (args.length > 0) ? args[0] : "No Message";
        
        System.out.println("--- Updated Java Execution ---");
        System.out.println("Received Parameter: " + message);
        System.out.println("Current Date from Java: " + new Date());
        System.out.println("------------------------------");
    }
}
