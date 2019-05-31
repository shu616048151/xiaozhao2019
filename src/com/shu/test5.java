package com.shu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class test5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String diyi=scanner.nextLine();
		String[] strings=diyi.split(" ");
		int len=Integer.parseInt(strings[0]);
		int outNum=Integer.parseInt(strings[1]);
		List<Integer> list=new ArrayList<>();
		List<Integer> listcopy=new ArrayList<>();
		for (int i = 0; i < len; i++) {
			int m=Integer.parseInt(scanner.nextLine());
			list.add(m);
			listcopy.add(m);
		}
		//将数据保存到list集合中
		Collections.sort(listcopy);
		System.out.println(list);
		System.out.println(listcopy);
		for (int i = list.size()-1;i>outNum-1; i--) {
			listcopy.remove(i);
		}
		for (int i = 0; i < list.size(); i++) {
			if (listcopy.contains(list.get(i))) {
				System.out.println(list.get(i));
			}
		}
		
	}

}
