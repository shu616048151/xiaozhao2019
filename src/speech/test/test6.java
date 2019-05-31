package speech.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test6 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		String[] strings=str.split(" ");
		int[] data=new int[strings.length];
		for(int i=0;i<strings.length;i++){
			data[i]=Integer.parseInt(strings[i]);
		}
		System.out.println(findNum(data));
	}
	public static List<Integer> findNum(int[] arr){
		List<Integer> list=new ArrayList<>();
		int startNum=Integer.MIN_VALUE;
		int maxLen=1;
		int tempNum=arr[0];
		int tempLen=1;
		for(int i=1;i<arr.length;i++){
			if (arr[i]-arr[i-1]==1) {
				tempLen++;
				if (i-2>=0&&arr[i-1]-arr[i-2]!=1) {
					tempNum=arr[i-1];
				}
				if (tempLen>maxLen) {
					maxLen=tempLen;
					startNum=tempNum;
				}
			}else {
				tempLen=1;
			}
		}
		list.add(startNum);
		list.add(maxLen);
		return list;
	}
}
