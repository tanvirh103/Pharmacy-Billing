import java.util.Scanner;
public class Option{

    void displayItem()
    {
        System.out.println("|-------------------------------------|");
        System.out.println("|    Welcome to Aiub Pharmacy         |");
        System.out.println("|-------------------------------------|");
        System.out.println("");
        System.out.println("|-------------------------------------|");
        System.out.println("|    Which Medicine do you need ?     |");
        System.out.println("|-------------------------------------|");
        System.out.println("");
        System.out.println(".          (1) Tablet");
        System.out.println("");
        System.out.println(".          (2) Syrup");
        System.out.println("");
        System.out.println(".          (3) Fast kit");
        System.out.println("");

    }

    void choiceItem()
    {


        // exception handling
        try {
            System.out.print("|       Enter your Choice      | : ");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();

            if (choice == 1) {
                Medicine f1 = new Tablet();
                f1.displayMedicine();
                f1.displayMedicineBill();

            }

            else if(choice == 2) {
                Medicine c1= new Syrup();
                c1.displayMedicine();
                c1.displayMedicineBill();
            }

            else if(choice == 3){
                Medicine b1 = new Fastkit();
                b1.displayMedicine();
                b1.displayMedicineBill();
            }

            else {

            }
        }
        catch(Exception e) {

            System.out.print("!!!!!!!!!!!!Please choose correct Option!!!!!!!");
            choiceItem();
        }



    }



}
