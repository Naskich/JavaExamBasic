import java.util.Scanner;
public class ChristmasGifts {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String stopCommand = scanner.nextLine();
		int countKids = 0;
		int countAdults = 0;
		int sumMoneyToy = 0;
		int sumMoneySweaters = 0;
		while (!stopCommand.equals("Christmas")) {
			int agePersont = Integer.parseInt(stopCommand);
			if (agePersont<=16) {
				countKids++;
			}
			if (agePersont>16) {
				countAdults++;
			}
			stopCommand = scanner.nextLine();
		}
		sumMoneyToy = countKids*5;
		sumMoneySweaters = countAdults*15;
		System.out.printf("Number of adults: %d%n",countAdults);
		System.out.printf("Number of kids: %d%n",countKids);
		System.out.printf("Money for toys: %d%n",sumMoneyToy);
		System.out.printf("Money for sweaters: %d",sumMoneySweaters);
	}
}
