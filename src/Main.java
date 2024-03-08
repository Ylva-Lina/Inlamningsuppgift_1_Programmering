import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Fixar lite setup med scanner, objekt av min logik-klass,
        //välkomstinfo & variabel för val av riktning på översättning
        Scanner scan = new Scanner(System.in);
        Converter convert = new Converter();
        convert.printWelcome();
        int choice = 0;

        //Försöker läsa in val som int, skriver ut felmeddelande om man stoppar in något annat.
        //Om man skriver in en int - men FEL int (dvs inte 1 eller 2) - hanteras det i en else-sats längre ner i loopen
        try {
            choice = Integer.parseInt(scan.nextLine());
        } catch (Exception e) {
            System.out.println("Something went wrong... Next time, try following the instructions.");
        }

        while (true) {
            if (choice == 1) {

                System.out.print("English: ");
                String input = scan.nextLine();

                //om input är "stop" avslutas loopen utan vidare åtgärd
                if (input.equalsIgnoreCase("stop")) {
                    System.out.println("Quitting...");
                    break;
                    //Annars utför vi konvertering
                } else {
                    String output = convert.getMorse(input);
                    System.out.println("Translates to: " + output + "\n");
                }
            }

            if (choice == 2) {

                System.out.print("Morse: ");
                String input = scan.nextLine();

                if (input.equalsIgnoreCase("stop")) {
                    System.out.println("Quitting...");
                    break;
                } else {
                    String output = convert.getText(input);
                    System.out.println("Translates to: " + output + "\n");
                }
            }

            //Om man stoppar in en felaktig int hamnar man här och får felmeddelande, så man har fortfarande chans
            //att rätta till det och fortsätta i loopen
            if (choice != 1 && choice != 2) {
                System.out.println("Please choose 1 (eng to morse) or 2 (morse to eng): ");
                try {
                    choice = Integer.parseInt(scan.nextLine());
                } catch (Exception e) {
                    System.out.println("Something went wrong... Next time, try following the instructions.");
                }
            }
        }
    }
}
