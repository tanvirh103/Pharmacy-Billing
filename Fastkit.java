import java.util.Scanner;

public class Fastkit extends Medicine {

    public void displayMedicine() {
        System.out.println("|--------------------------------------|");
        System.out.println("|    Welcome to our Fastkit section    |");
        System.out.println("|--------------------------------------|");
        System.out.println("");
        System.out.println("(1) Savlon------------70/-");
        System.out.println("(2) Small glue bandage-------------10/-");
        System.out.println("(3) Scissors/Sergical Blade-----------100/-");
        System.out.println("(4) Hexisol-------------20/-");

    }



    public void displayMedicineBill() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your choice = ");
        System.out.println("To confirm your order press 'y'");
        char i = '0';


        while(true) {

            i = input.next().charAt(0);

            if(i == 'y') {
                break;
            }

            else if(i == '1') {
                totalBill += 70;
                System.out.println("Amount = "+totalBill);

            }

            else if(i == '2') {
                totalBill += 10;
                System.out.println("Amount = "+totalBill);

            }

            else if(i == '3') {
                totalBill += 100;
                System.out.println("Amount = "+totalBill);

            }

            else if(i == '4') {
                totalBill += 20;
                System.out.println("Amount = "+totalBill);

            }



        }

        System.out.println("Total Bill = "+totalBill);
    }


}
