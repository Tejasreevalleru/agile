public class HelloJenkins {
    public static void main(String[] args) {
        System.out.println("------------------------------");
        
        if (args.length > 0) {
            System.out.println("Java received message: " + args[0]);
        } else {
            System.out.println("No message provided.");
        }
        
        System.out.println("Hello from Jenkins via Java!");
        System.out.println("------------------------------");
    }
}
