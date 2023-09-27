import java.util.Scanner;

public class TwoMain
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please type your name");
		String name = scanner.nextLine();

		System.out.println("Please type your age");
		String age = scanner.nextLine();

		int i = Integer.parseInt(age);

		int ageUntil = 67 - i;
		System.out.println("Years until retirement: " +ageUntil);
	}
}