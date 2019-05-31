package speech.test3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=Integer.parseInt(scanner.nextLine());
		int out=1;
		for(int i=n;i>0;i--){
			out=out*i;
		}
		System.out.println(out);
	}
}
