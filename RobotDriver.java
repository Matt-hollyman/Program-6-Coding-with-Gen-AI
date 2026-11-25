import java.util.*;

public class RobotDriver {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        RobotChecker robot = new RobotChecker();

        String pilotName = "Matthew";
        String password = "gzr520";
        boolean loggedIn = false;

        System.out.println("=== Earth Defense System ===");

        // Pilot login system
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter pilot name: ");
            String name = console.nextLine();

            System.out.print("Enter password: ");
            String inputPassword = console.nextLine();

            if (name.equals(pilotName) &&
                inputPassword.equals(password)) {

                System.out.println("\nAccess granted!");
                System.out.println("Welcome, Pilot " + name + "!");
                loggedIn = true;
                break;

            } else {
                System.out.println("Incorrect name or password.");
                System.out.println("Attempts left: " + (2 - i));
            }
        }

        if (!loggedIn) {
            System.out.println("Access denied. System locked.");
            console.close();
            return;
        }

        System.out.println("\n=== Mission: Save the Earth ===");

        while (true) {
            boolean success = robot.checkRobot();

            if (success) {
                System.out.println("\nAll systems are working!");
                System.out.println("Mission successful!");
                System.out.println("The robot is ready to save the Earth!");
                break;
            }

            System.out.println("\nMission failed.");
            System.out.println("Please fix the failed components.");

            System.out.print("Run the diagnostic again? (yes/no): ");
            String answer = console.nextLine();

            if (!answer.equalsIgnoreCase("yes")) {
                System.out.println("Mission cancelled.");
                break;
            }
        }

        console.close();
    }
}