/*Коледни подаръци 
Коледа наближава и Иван решава да купи по един подарък за всеки от семейството си. Той си прави списък с хората, на които иска да подари нещо.
Това, какъв подарък ще купи зависи от възрастта на хората в списъка му:
•	Всички до 16 (вкл.) години се считат за деца и ще получат играчка
•	Всички над 16 години се считат за възрастни и ще получат коледен пуловер
•	Цената на всяка играчка е 5 лв., а цената на един пуловер е 15 лв.
Напишете програма, която пресмята колко души от семейството на Иван са до 16 (вкл.) години и колко са над тази възраст,
също и колко пари ще струват подаръците на децата и възрастните.
Вход:
От конзолата се четат поредица от редове до получаване на команда "Christmas":
•	Годините на всеки член от семейството - цяло число в интервала [1 … 130] 
Изход:
Да се отпечатат на конзолата четири реда:
•	"Number of adults: {брой хора над 16 години}" 
•	"Number of kids: {брой хора до 16 (вкл.) години}"
•	"Money for toys: {сумата за всички играчки}"
•	"Money for sweaters: {сума за всички пуловери}"
Примерен вход и изход
Вход	Изход	Обяснения
16
20
46
12
8
20
49
Christmas	Number of adults: 4
Number of kids: 3
Money for toys: 15
Money for sweaters: 60	Първи човек: 16 години -> дете
Втори човек: 20 години -> възрастен
Трети човек: 46 -> възрастен
Четвърти човек: 12 години -> дете
Пети човек: 8 години -> дете
Шести човек: 20 години -> възрастен
Седми човек: 49 години -> възрастен
Брой деца: 3
Брой възрастни: 4
Цена за играчки: 3 * 5 = 15 лева
Цена за коледни пуловери: 4 * 15 = 60 лева 
Вход	Изход	Вход	Изход
16
16
16
16
16
Christmas	Number of adults: 0
Number of kids: 5
Money for toys: 25
Money for sweaters: 0	18
20
48
45
56
37
12
14
Christmas	Number of adults: 6
Number of kids: 2
Money for toys: 10
Money for sweaters: 90
*/
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
