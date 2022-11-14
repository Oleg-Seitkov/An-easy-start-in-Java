import java.util.Scanner;
class MySolution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Math.abs(sc.nextInt());
		int b= Math.abs(sc.nextInt());
		if (a<100 || a>999) {
			System.out.println("error");
		} else {
			boolean c=((a%=100)/10==b);
			System.out.println(c);
		}
		sc.close();
	}
}
