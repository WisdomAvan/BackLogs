package ReflectionTask;

import java.util.Scanner;

public class ZoneChecker {


    Scanner obtain = new Scanner(System.in);

    public static void main(String[] args) {

        ZoneChecker zoneChecker = new ZoneChecker();

        zoneChecker.collectState();
    }

    public void collectState() {

        System.out.print("Enter Your State: ");
        String state = obtain.nextLine().toLowerCase();

        GeoPoliticalZone zone = GeoPoliticalZone.findZone(state);
        if (zone != null) {
            System.out.println(state + " belongs to " + zone);
        } else {
            System.out.println("Invalid State Entered");
        }
    }

}
