package speech.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 按数字出现的次数进行排序
 * @author Administrator
 *
 */
public class test4 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=Integer.parseInt(scanner.nextLine());
		String[] str=scanner.nextLine().split(" ");
		int[] salarys=new int [str.length];
		for (int i = 0; i < salarys.length; i++) {
			salarys[i]=Integer.parseInt(str[i]);
		}
		System.out.println(sortSalary(num, salarys));
	}
	public static List<Integer> sortSalary(int num,int[] salarys){
		List<Integer> list=new ArrayList<>();
		List<SalData> salDataList=new ArrayList<>();
		for(int i=0;i<num;i++){
			//标志位,每次都设置为false
			boolean flag=false;
			int x=salarys[i];
			int len=salDataList.size();
			for (int j = 0; j < len; j++) {
				if (x==salDataList.get(j).getSalary()) {
					int oldtimes = salDataList.get(j).getTimes();
					salDataList.get(j).setTimes(oldtimes+1);
					flag=true;
				}
			}
			//表示集合列表里面没有
			if (!flag) {
				SalData salData=new SalData();
				salData.setSalary(x);
				salData.setTimes(1);
				salDataList.add(salData);
			}
		}
		Collections.sort(salDataList, new Comparator<SalData>() {

			@Override
			public int compare(SalData o1, SalData o2) {
				//出现的次数倒序排列
				if (o1.getTimes()>o2.getTimes()) {
					return -1;
				}
				if (o1.getTimes()<o2.getTimes()) {
					return 1;
				}
				return 0;
			}
		});
		for(SalData  salData:salDataList){
			for(int i=0;i<salData.getTimes();i++){
				list.add(salData.getSalary());
			}
		}
		return list;
	}
}
