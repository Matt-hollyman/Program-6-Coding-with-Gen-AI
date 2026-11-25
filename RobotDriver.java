import java.util.*;

public class RobotDriver {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        RobotChecker robot = new RobotChecker();

        System.out.println("=== Mission: Save the Earth ===");

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