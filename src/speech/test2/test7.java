package speech.test2;

import java.util.Scanner;

public class test7 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=Integer.parseInt(scanner.nextLine());
		System.out.println(countOneNum(n));
	}
	public static int countOneNum(int n){
		int num=0;
		for (int i = 1; i <=n; i++) {
			int k=i;
			while(k/10>0){
				int temp=k%10;
				k=k/10;
				if (temp==1) {
					num++;
				}
			}
			//最高位是不是为1
			if(k==1){
				num++;
			}
		}
		return num;
	}
	

}
