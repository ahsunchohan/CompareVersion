package compareversion.ahsun.com;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("*****Type 'exit' to exit at any time*****");

        VersionComparer vC = new VersionComparer();

        while (true) {
            System.out.println("**Compare versions**");
            System.out.print("Enter version 1 (or exit): ");
            String version1 = sc.nextLine();
            if (version1.equals("exit")) {
                System.out.println("Exiting version comparison...");
                break;
            }
            System.out.print("Enter version 2 (or exit): ");
            String version2 = sc.nextLine();
            if (version2.equalsIgnoreCase("exit")) {
                System.out.println("Exiting version comparison...");
                break;
            }
            int compResult = 0;
            try {
                compResult = vC.compareVersions(version1, version2);
                String sign = "=";
                if (compResult == 1)
                    sign = ">";
                else if (compResult == -1)
                    sign = "<";
                System.out.println(version1 + " " + sign + " " + version2);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
