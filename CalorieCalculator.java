import java.util.Scanner;

public class CalorieCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String menAndWoman = scanner.nextLine();
		double weightKg = Double.parseDouble(scanner.nextLine());
		double hightM = Double.parseDouble(scanner.nextLine());
		int agePersont = Integer.parseInt(scanner.nextLine());
		String activity = scanner.nextLine();
		double sumBmn = 0;
		       hightM=hightM*100;
		       double lastSum = 0;
		if (menAndWoman.equals("m")) {	
			sumBmn = 66 + (13.7*weightKg)+(5*hightM)-(6.8*agePersont);
			switch (activity) {
			case "sedentary":
				     lastSum =(Math.ceil(sumBmn*1.2));
				     System.out.printf("To maintain your current weight you will need "+(int)lastSum+" calories per day.");
				break;
			case "lightly active":
				lastSum =(Math.ceil(sumBmn*1.375));
			     System.out.printf("To maintain your current weight you will need "+(int)lastSum+" calories per day.");
				break;
				
			case "moderately active":
				lastSum =(Math.ceil(sumBmn*1.55));
			     System.out.printf("To maintain your current weight you will need "+(int)lastSum+" calories per day.");
					break;
			case "very active":
				lastSum =(Math.ceil(sumBmn*1.725));
			     System.out.printf("To maintain your current weight you will need "+(int)lastSum+" calories per day.");
				break;	
			}
		}
		if (menAndWoman.equals("f")) {
			
			sumBmn = 655 + (9.6*weightKg)+(1.8*hightM)-(4.7*agePersont);
			switch (activity) {
			case "sedentary":
				     lastSum =(Math.ceil(sumBmn*1.2));
				     System.out.printf("To maintain your current weight you will need "+(int)lastSum+" calories per day.");
				break;
			case "lightly active":
				lastSum =(Math.ceil(sumBmn*1.375));
			     System.out.printf("To maintain your current weight you will need "+(int)lastSum+" calories per day.");
				break;
				
			case "moderately active":
				lastSum =(Math.ceil(sumBmn*1.55));
			     System.out.printf("To maintain your current weight you will need "+(int)lastSum+" calories per day.");
					break;
			case "very active":
				lastSum =(Math.ceil(sumBmn*1.725));
			     System.out.printf("To maintain your current weight you will need "+(int)lastSum+" calories per day.");
				break;	
			}	
		}
	}
}
