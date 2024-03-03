import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Fixar lite setup med scanner, objekt av min logik-klass,
        //välkomstinfo och val av riktning på översättning
        Scanner scan = new Scanner(System.in);
        Converter convert = new Converter();
        convert.printWelcome();

        try {
            int choice = Integer.parseInt(scan.nextLine());

            while (true) {
                if (choice == 1) {

                    System.out.print("Letter/number: ");
                    String input = scan.nextLine();

                    if (input.equalsIgnoreCase("stop")) {
                        System.out.println("Quitting...");
                        break;
                    }

                    String output = convert.getMorse(input);
                    System.out.println(input + " translates to: " + output + "\n");

                } else if (choice == 2) {

                    System.out.print("Morse: ");
                    String input = scan.nextLine();

                    if (input.equalsIgnoreCase("stop")) {
                        System.out.println("Quitting...");
                        break;
                    }

                    String output = convert.getText(input);
                    System.out.println(input + " translates to: " + output + "\n");

                } else {
                    System.out.println("Please choose 1 or 2!");
                    choice = Integer.parseInt(scan.nextLine());
                }
            }
        } catch (Exception e) {
            System.out.println("Something went wrong... Next time, try following the instructions!");
        }
    }
}
