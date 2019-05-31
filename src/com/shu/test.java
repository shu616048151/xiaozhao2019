package com.shu;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 给出一行数，
 * @author Administrator
 *
 */
public class test {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String num=scanner.nextLine();
		String str=scanner.nextLine();
		String[] strings=str.split(" ");
		List<Integer> list=new ArrayList<>();
		for (int i = 0; i < strings.length; i++) {
			String string = strings[i];
			list.add(Integer.parseInt(string));
		}
		//是否结束循环
		boolean flag=false;
		int count=0;
		while(!flag){
			int len=list.size();
			for (int i = len-1; i >0 ; i--) {
				int suf=list.get(i);
				int pro=list.get(i-1);
				if (pro>suf) {
					list.remove(i);
				}
			}
				count++;
				//判断数组是否满足升序的情况
				if (list.size()>1) {
				for (int j = 0; j < list.size()-1; j++) {
					if (list.get(j)<list.get(j+1)) {
						flag=true;
					}else {
						flag=false;
						break;
					}
				}
				}else {
					flag=true;
				}
		}
		System.out.println(count);
	}
	
}
