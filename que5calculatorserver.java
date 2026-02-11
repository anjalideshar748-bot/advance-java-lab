import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class que5calculatorserver {
    public static void main(String[] args) {
        try {
            // Create remote object
            que5calculator calc = new que5calculatorimpl();

            // Create or get registry on default port 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // Bind the object with a name
            registry.rebind("CalculatorService", calc);

            System.out.println("Calculator Server is running...");
            System.out.println("Service bound as 'CalculatorService' on port 1099");

        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}