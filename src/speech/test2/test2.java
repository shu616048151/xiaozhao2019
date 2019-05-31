package speech.test2;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String s1=scanner.nextLine();
		String s2=scanner.nextLine();
		
		System.out.println(MaxCommonLen(s1, s2));
	}
	public static int MaxCommonLen(String s1,String s2){
		int maxlength=0;
		int[][] data=new int[s1.length()][s2.length()];
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i)==s2.charAt(j)) {
					if (i>0&&j>0) {
						data[i][j]=data[i-1][j-1]+1;
					}else {
						data[i][j]=1;
					}
				}
				if (data[i][j]>maxlength) {
					maxlength=data[i][j];
				}
			}
		}
		
		return maxlength;
	}
}
