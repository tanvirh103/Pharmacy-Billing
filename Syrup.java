import java.util.Scanner;

public class Syrup extends Medicine{



    public void displayMedicine()
    {   System.out.println("|-----------------------------------|");
        System.out.println("|   Welcome to our Syrup section    |");
        System.out.println("|-----------------------------------|");
        System.out.println("");
        System.out.println("(1) Napa syrap--------100/-");
        System.out.println("(2) Robitussin Cough + Chest-----50/-");
        System.out.println("(3) Congestion DM Robitussin----50/-");
        System.out.println("(4) Mucinex DM--------20/-");
    }


    public void displayMedicineBill() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your choice = ");
        System.out.println("");
        System.out.println("To confirm your order press 'y'");
        char i = '0';

        while(true) {

            i = input.next().charAt(0);

            if(i == 'y') {
                break;
            }

            else if(i == '1') {
                totalBill += 100;
                System.out.println("Amount = "+totalBill);


            }

            else if(i == '2') {
                totalBill += 50;
                System.out.println("Amount = "+totalBill);

            }

            else if(i == '3') {
                totalBill += 50;
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
