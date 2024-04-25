// WeaponType enum
enum WeaponType {
    SWORD,
    AXE,
    BOW
}

// Weapon class
class Weapon {
    private WeaponType type;
    private String name;

    // Constructor
    public Weapon(WeaponType type, String name) {
        this.type = type;
        this.name = name;
    }

    // Getters and setters
    public WeaponType getType() {
        return type;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// GameEntity class
class GameEntity {
    // Common fields for both bosses and heroes
}

// Boss class
class Boss extends GameEntity {
    private Weapon weapon;

    // Constructor
    public Boss(Weapon weapon) {
        this.weapon = weapon;
    }

    // Getter and setter for weapon
    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    // Method to print boss info
    public void printInfo() {
        System.out.println("Boss Weapon: " + weapon.getName() + " (" + weapon.getType() + ")");
    }
}

// Skeleton class
class Skeleton extends Boss {
    private int arrowCount;

    // Constructor
    public Skeleton(Weapon weapon, int arrowCount) {
        super(weapon);
        this.arrowCount = arrowCount;
    }

    // Getter and setter for arrow count
    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    // Overridden method to print skeleton info
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Arrow Count: " + arrowCount);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create weapon instances
        Weapon sword = new Weapon(WeaponType.SWORD, "Excalibur");
        Weapon bow = new Weapon(WeaponType.BOW, "Longbow");

        // Create boss instance and set properties
        Boss boss = new Boss(sword);
        boss.printInfo();

        // Create two skeleton instances and set properties
        Skeleton skeleton1 = new Skeleton(bow, 20);
        Skeleton skeleton2 = new Skeleton(sword, 15);

        // Print info about skeletons
        System.out.println("\nSkeleton 1:");
        skeleton1.printInfo();
        System.out.println("\nSkeleton 2:");
        skeleton2.printInfo();
    }
}
