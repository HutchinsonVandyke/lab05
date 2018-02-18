import java.util.Scanner;

public class Main {

    public static long hexConverter (String hexNumber)

    {
        int charCounter = hexNumber.length()-1;
        int substringcounter = 0;
        long hexSum = 0;

        while (charCounter >= 0) {

            char x = hexNumber.charAt(substringcounter);
            double charValue = 0;
            long charHexValue = 0;


            if (x == '0'|| x == 'x'){
                 charValue = 0;

            }
            else if (x == 'A' || x == 'a') {
                charValue = 10;
            }
            else if (x == 'B' || x == 'b') {
                charValue = 11;
            }
            else if (x == 'C' || x == 'c') {
                charValue = 12;
            }
            else if (x == 'D' || x == 'd') {
                charValue = 13;
            }
            else if (x == 'E' || x == 'e') {
                charValue = 14;
            }
            else if (x == 'F' || x == 'f'){
                charValue = 15;
            }
            else {
                charValue = Integer.parseInt(hexNumber.substring(substringcounter,substringcounter+1));
            }

            charHexValue = (long)charValue * (long)Math.pow(16, (long)charCounter);
            hexSum = hexSum + (long)charHexValue;

            charCounter--;
            substringcounter++;



        }
        return hexSum;
        }
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        System.out.println();

        String hexNumber = scanner.next();
        double z = hexConverter(hexNumber);

        System.out.println("Your number is " + (long)z + "in decimal");



















    }
}
