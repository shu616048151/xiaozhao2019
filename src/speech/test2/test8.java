package speech.test2;

import java.util.Scanner;

	public class test8 {
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			String str=scanner.next();
			System.out.println(simplifiedString(str));
		}
	public static String simplifiedString(String str){
		String out="";
		int num=0;
		if (str.length()>1) {
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i-1)==str.charAt(i)) {
				num++;
				if (i==str.length()-1) {
					out+=num;
					out+=str.charAt(i-1);
				}
			}else {
				//不是最后一个
				if (num>0) {					
					out+=num;
				}
				out+=str.charAt(i-1);					
				
				//当前为最后一个且不与前面相同
				if (i==str.length()-1) {
					out+=str.charAt(i);
				}
				num=0;
			}
		}
		}else {
			out=str;
		}
		return out;
	} 
	
}
