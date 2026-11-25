import java.util.*;

public class WeaponInventory {

    private Map<String, Integer> weapons;

    public WeaponInventory() {
        weapons = new HashMap<>();

        weapons.put("Energy Shield", 2);
        weapons.put("Laser Blaster", 4);
        weapons.put("Plasma Cannon", 2);
        weapons.put("Defense Drone", 5);
    }

    public void displayInventory() {
        System.out.println("\n=== Weapon Inventory ===");

        for (String weapon : weapons.keySet()) {
            System.out.println(weapon + ": " + weapons.get(weapon));
        }

        System.out.println("Inventory check complete.");
    }
}