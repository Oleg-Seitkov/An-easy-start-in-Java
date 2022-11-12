import java.util.Scanner;
class MySolution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		String a=A.toLowerCase();
		String B= sc.nextLine();
		String b= B.toLowerCase();
		boolean value1 = a.contains(b);
		System.out.println(value1);
		sc.close();
	}
	}
