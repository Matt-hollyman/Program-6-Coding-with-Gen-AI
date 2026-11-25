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
            boolean passed;

            if (component.equals("Battery")) {
                passed = checkBattery();
            } else {
                passed = random.nextInt(100) < 80;
            }

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

    private boolean checkBattery() {
        int batteryLevel = random.nextInt(101);

        System.out.println("Battery level: " + batteryLevel + "%");

        if (batteryLevel < 20) {
            System.out.println("CRITICAL: Battery is too low!");
            return false;
        } else if (batteryLevel < 50) {
            System.out.println("WARNING: Low battery!");
            return true;
        } else {
            System.out.println("Battery level is normal.");
            return true;
        }
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