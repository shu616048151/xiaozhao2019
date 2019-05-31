package speech.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str1=scanner.nextLine();
		String[] strings1=str1.split(" ");
		//小熊的数量
		int n=Integer.parseInt(strings1[0]);
		//糖果的数量
		int m=Integer.parseInt(strings1[1]);
		String sugar=scanner.nextLine();
		String[] sugarArr=sugar.split(" ");
		List<Integer> can=new ArrayList<>();
		for(int i=0;i<sugarArr.length;i++){
			can.add(Integer.parseInt(sugarArr[i]));
		}
		List<Bear> bearList=new ArrayList<>();
		for (int i = 0; i < n; i++) {
				String str2=scanner.nextLine();
				String[] strings2=str2.split(" ");
				Bear bear=new Bear();
				bear.setV(Integer.parseInt(strings2[0]));
				bear.setH(Integer.parseInt(strings2[1]));
				bear.setOrder(i);
				bearList.add(bear);
		}
		//熊的战斗力排序
		Collections.sort(bearList, new Comparator<Bear>() {

			@Override
			public int compare(Bear o1, Bear o2) {
				//倒序排序
				if (o1.getV()>o2.getV()) {
					return -1;
				}
				if (o1.getV()<o2.getV()) {
					return 1;
				}
				return 0;
			}
		});
		//糖果排序
		Collections.sort(can);
		//
		//开始吃糖，最大的糖果在最后面
		for (int i = 0; i < n; i++) {
			int len=can.size();
			for (int j = len-1; j >=0; j--) {
				//当前的熊
				Bear bear = bearList.get(i);
				if (bear.getH()>=can.get(j)) {
					//该熊吃掉该糖
					bear.setH(bear.getH()-can.get(j));
					//去掉该颗糖
					can.remove(j);
				}
			}
		}
		
		
		Collections.sort(bearList, new Comparator<Bear>() {

			@Override
			public int compare(Bear o1, Bear o2) {
				if (o1.getOrder()>o2.getOrder()) {
					return 1;
				}
				if (o1.getOrder()<o2.getOrder()) {
					return -1;
				}
				return 0;
			}
		});
		
		
		//打印输出
		for (int i = 0; i < n; i++) {
			System.out.println(bearList.get(i).getH());
			
		}
	}
}
