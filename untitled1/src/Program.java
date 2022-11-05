import java.util.Scanner;
class MySolution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a > 0 && a >= 100 && a < 1000) {
			System.out.print("YES");
		} else {
			System.out.print("NO");
		}
	}
}