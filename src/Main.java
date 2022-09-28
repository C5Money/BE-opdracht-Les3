import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//     Arrays
        Integer [] numeric = {1,2,3,4,5,6,7,8,9,0};
        String [] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};

//     Object
        Translator translate = new Translator(numeric, alphabetic);

//     Scanner object.
        Scanner invoer = new Scanner(System.in);

//     Variabelen
        boolean play = true;
        String ongeldig = "Ongeldige invoer";
        String input;
        int number;
        String result;

//     While loop
        while(play){
            System.out.println("Type 'x' om te stoppen \\nType 'v' om te vertalen: ");
            input = invoer.nextLine();

            if (input.equalsIgnoreCase("x")){
                play = false;
            } else if (input.equalsIgnoreCase("v")) {
                System.out.println("Type een cijfer in van 0 t/m 9: ");
                number = invoer.nextInt();
                invoer.nextLine();

                if (number < 10){
                    result = translate.translate(number);
                    System.out.println("De vertaling van " + number + " is " + result + ".");
                } else {
                    System.out.println(ongeldig);
                }
            } else {
                System.out.println(ongeldig);
            }
        }
    }
}
