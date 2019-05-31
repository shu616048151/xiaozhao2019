package speech.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
/**
 * 根据字符串的字符出现的频次进行排序
 * @author Administrator
 *
 */
public class test5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		System.out.println(changeString(string));
	}
	public static String changeString(String str){
		List<StringData> list=new ArrayList<>();
		String s1="";
		String data="";
		for (int i = 0; i < str.length(); i++) {
			char c=str.charAt(i);
			if (('a'<=c&&c<='z')||('A'<=c&&c<='Z')) {
				s1+=c;
			}else {
				//当前字符为数字
				data+=c;
				//下一个为字符，结束数字统计
				if (i+1<str.length()) {
					char c1=str.charAt(i+1);
					if (('a'<=c1&&c1<='z')||('A'<=c1&&c1<='Z')) {
						StringData stringData=new StringData();
						stringData.setStr(s1);
						stringData.setNum(Integer.parseInt(data));
						list.add(stringData);
						//清空数据
						s1="";
						data="";
						}
					}
				}
			//最后一个数字
			if (i+1==str.length()) {
				StringData stringData=new StringData();
				stringData.setStr(s1);
				stringData.setNum(Integer.parseInt(data));
				list.add(stringData);
				s1="";
				data="";
			}
			}
		
		//进行字符排序
		Collections.sort(list, new Comparator<StringData>() {

			@Override
			public int compare(StringData o1, StringData o2) {
				if (o1.getNum()>o2.getNum()) {
					return 1;
				}
				if (o1.getNum()<o2.getNum()) {
					return -1;
				}
				if (o1.getNum()==o2.getNum()) {
					return o1.getStr().compareTo(o2.getStr());
				}
				return 0;
			}
		});
		String finalString="";
		for (int i = 0; i < list.size(); i++) {
			for(int j=0;j<list.get(i).getNum();j++){
				finalString+=list.get(i).getStr();
			}
		}
		return finalString;
	}
}
