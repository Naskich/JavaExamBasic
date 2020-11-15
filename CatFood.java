import java.util.Scanner;

public class CatFood {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberCats =  Integer.parseInt(scanner.nextLine());
		int countFirstGroup = 0 ;
		int countSecondGroup = 0 ;
		int countTirthGroup = 0 ;
		double lastSume =0;
		for (int i = 1; i <= numberCats; i++) {
			double foodCats =Double.parseDouble(scanner.nextLine());
			
			if (foodCats>=100 && foodCats<=199) {
				countFirstGroup++;
			}
			if (foodCats>=200 && foodCats<=299) {
				countSecondGroup++;
			}
			if (foodCats>=300 && foodCats<=399) {
				countTirthGroup++;
			}
			lastSume+=foodCats;
		}
		lastSume=(lastSume/1000)*12.45;
		System.out.printf("Group 1: %d cats.%n",countFirstGroup);
		System.out.printf("Group 2: %d cats.%n",countSecondGroup);
		System.out.printf("Group 3: %d cats.%n",countTirthGroup);
		System.out.printf("Price for food per day: %.2f lv.",lastSume);
	}
}
