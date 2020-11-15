import java.util.Scanner;
public class FootballSouvenirs {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nameCountry = scanner.nextLine();
		String typeGifts = scanner.nextLine();
		int numberGifts = Integer.parseInt(scanner.nextLine());
		double lastSum = 0;
		switch (nameCountry) {
		case "Argentina":
			switch (typeGifts) {
			case "flags":
				     lastSum=(double)numberGifts*3.25;
			    System.out.printf("Pepi bought "+numberGifts+" "+typeGifts+" of "+nameCountry+" for %.2f lv.",lastSum);
				break;
			case "caps":
				lastSum=(double)numberGifts*7.20;
				System.out.printf("Pepi bought "+numberGifts+" "+typeGifts+" of "+nameCountry+" for %.2f lv.",lastSum);
				break;
			case "posters":
				lastSum=(double)numberGifts*5.10;
				System.out.printf("Pepi bought "+numberGifts+" "+typeGifts+" of "+nameCountry+" for %.2f lv.",lastSum);
				break;
			case "stickers":
				lastSum=(double)numberGifts*1.25;
				System.out.printf("Pepi bought "+numberGifts+" "+typeGifts+" of "+nameCountry+" for %.2f lv.",lastSum);
				break;				
			default:
				System.out.printf("Invalid stock!");
				break;
			}	
			break;
		case "Brazil":
			switch (typeGifts) {
			case "flags":
				     lastSum=(double)numberGifts*4.20;
				 System.out.printf("Pepi bought "+numberGifts+" "+typeGifts+" of "+nameCountry+" for %.2f lv.",lastSum);
				break;
			case "caps":
				lastSum=(double)numberGifts*8.50;
				System.out.printf("Pepi bought "+numberGifts+" "+typeGifts+" of "+nameCountry+" for %.2f lv.",lastSum);
				break;
			case "posters":
				lastSum=(double)numberGifts*5.35;
				System.out.printf("Pepi bought "+numberGifts+" "+typeGifts+" of "+nameCountry+" for %.2f lv.",lastSum);
				break;
			case "stickers":
				lastSum=(double)numberGifts*1.20;
				System.out.printf("Pepi bought "+numberGifts+" "+typeGifts+" of "+nameCountry+" for %.2f lv.",lastSum);
				break;				
			default:
				System.out.printf("Invalid stock!");
				break;
			}
			break;
		case "Croatia":
			switch (typeGifts) {
			case "flags":
				     lastSum=(double)numberGifts*2.75;
				     System.out.printf("Pepi bought "+numberGifts+" "+typeGifts+" of "+nameCountry+" for %.2f lv.",lastSum);
				break;
			case "caps":
				lastSum=(double)numberGifts*6.90;
				System.out.printf("Pepi bought "+numberGifts+" "+typeGifts+" of "+nameCountry+" for %.2f lv.",lastSum);
				break;
			case "posters":
				lastSum=(double)numberGifts*4.95;
				System.out.printf("Pepi bought "+numberGifts+" "+typeGifts+" of "+nameCountry+" for %.2f lv.",lastSum);
				break;
			case "stickers":
				lastSum=(double)numberGifts*1.10;
				System.out.printf("Pepi bought "+numberGifts+" "+typeGifts+" of "+nameCountry+" for %.2f lv.",lastSum);
				break;				
			default:
				System.out.printf("Invalid stock!");
				break;
			}
			break;
		case "Denmark":
			switch (typeGifts) {
			case "flags":
				     lastSum=(double)numberGifts*3.10;
				     System.out.printf("Pepi bought "+numberGifts+" "+typeGifts+" of "+nameCountry+" for %.2f lv.",lastSum);
				break;
			case "caps":
				lastSum=(double)numberGifts*6.50;
				System.out.printf("Pepi bought "+numberGifts+" "+typeGifts+" of "+nameCountry+" for %.2f lv.",lastSum);
				break;
			case "posters":
				lastSum=(double)numberGifts*4.80;
				System.out.printf("Pepi bought "+numberGifts+" "+typeGifts+" of "+nameCountry+" for %.2f lv.",lastSum);
				break;
			case "stickers":
				lastSum=(double)numberGifts*0.90;
				System.out.printf("Pepi bought "+numberGifts+" "+typeGifts+" of "+nameCountry+" for %.2f lv.",lastSum);
				break;				
			default:
				System.out.printf("Invalid stock!");
				break;
			}
			break;
		default:
			System.out.printf("Invalid country!");
			break;
		}
	}
}
