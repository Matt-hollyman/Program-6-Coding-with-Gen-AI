import java.util.*;

public class RobotChecker {

    private Queue<String> components;
    private Random random;

    public RobotChecker() {
        components = new LinkedList<>();
        random = new Random();
    }

    public boolean checkRobot() {
        components.add("Battery");
        components.add("Motors");
        components.add("Camera");
        components.add("Sensors");
        components.add("Connection");

        boolean allPassed = true;

        System.out.println("\n=== Robot Functionality Check ===");

        while (!components.isEmpty()) {
            String component = components.remove();

            // Simulate an 80% chance of passing.
            boolean passed = random.nextInt(100) < 80;

            if (passed) {
                System.out.println(component + ": PASS");
            } else {
                System.out.println(component + ": FAIL");
                System.out.println("Solution: " + getSolution(component));
                allPassed = false;
            }
        }

        return allPassed;
    }

    private String getSolution(String component) {
        switch (component) {
            case "Battery":
                return "Recharge or replace the battery.";

            case "Motors":
                return "Check the motor wires and connections.";

            case "Camera":
                return "Restart or replace the camera.";

            case "Sensors":
                return "Clean and recalibrate the sensors.";

            case "Connection":
                return "Reconnect the communication system.";

            default:
                return "Check the component manually.";
        }
    }
}