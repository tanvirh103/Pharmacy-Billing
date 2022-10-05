import java.util.Scanner;
public class VoucherCode {
	public static final String CODE = "Medicinelagbe10";
	void displayVoucher() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter voucher code to get 10% off = ");
		String inputCode = input.nextLine();
		
		if((inputCode.equals(CODE))){
			double finalBill=Medicine.totalBill;
			finalBill=finalBill-(finalBill*.1);
			
			System.out.println("");
			System.out.println("Your bill after 10% off = "+finalBill);
		}
		
		else {
			
		}
		
		
		
	}
	
}
