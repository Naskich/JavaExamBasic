import java.util.Scanner;

public class ProgrammingBook {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double pricePage = Double.parseDouble(scanner.nextLine());
		double priceBarkBook = Double.parseDouble(scanner.nextLine());
		int percentDiscount = Integer.parseInt(scanner.nextLine());
		double sumPriceDesigner = Double.parseDouble(scanner.nextLine());
		int pecentTeem = Integer.parseInt(scanner.nextLine());
		double discount =0;
		double sumFirst =0;
		double lastSum  =0;
				sumFirst = pricePage*899+priceBarkBook*2;
				
				discount = sumFirst-(sumFirst*((double)percentDiscount*1.0/100*1.0));
				
				discount = discount+sumPriceDesigner;
	
				lastSum  = discount-(discount*((pecentTeem*1.0)/100*1.0));
		System.out.printf("Avtonom should pay %.2f BGN.",lastSum);
	}
}
