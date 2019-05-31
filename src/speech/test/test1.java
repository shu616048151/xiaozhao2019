package speech.test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test1 {
	public static void main(String[] args) {
		try {
			FileReader inputStream=new FileReader(new File("1.txt"));
			BufferedReader bufferedReader=new BufferedReader(inputStream);
			String str="";
			while(bufferedReader.readLine()!=null) {				
				str= str+bufferedReader.readLine();
			}
			//转成数字
			String[] strings=str.split(",");
			int[] data=new int[strings.length];
			for(int i=0;i<strings.length;i++){
				data[i]=Integer.parseInt(strings[i]);
			}
			//得到字符串
			str=selectSort(data);
			FileWriter fileWriter=new FileWriter(new File("2.txt"));
			//写入数据
			fileWriter.write(str);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static String selectSort(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if (arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		String s1="";
		for(int i=0;i<arr.length;i++){
			if (i+1!=arr.length) {
				s1+=arr[i]+",";
			}else {
				s1+=arr[i];
			}
		}
		return s1;
	}
	
}
