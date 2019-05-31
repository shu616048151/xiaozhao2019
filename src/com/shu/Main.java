package com.shu;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
      Scanner scanner=new Scanner(System.in);
      int T=Integer.parseInt(scanner.nextLine());
      int[][] data=new int[2*T][];
      for(int i=0;i<2*T;i++){
    	  String str1=scanner.nextLine();
    	  String[] strings=str1.split(" ");
    	  data[i]=new int[strings.length];
    	  for(int j=0;j<strings.length;j++){
    		  data[i][j]=Integer.parseInt(strings[j]);
    	  }
      }
      int sum=0;
      //输出的数组
      int[] change=new int[T];
      for(int i=0;i<data.length;i=2*i){
    	  //
    	  int len=data[i][0];
    	  int avgScore=data[i][1];
    	  for (int j = 0; j <len; j++) {
			sum+=data[i+1][j];
		}
    	 //比较数据
    	 if (sum>=avgScore*len) {
			change[i/2]=0;
		}else{
			//将成绩的一维数组传输到进行排序
			int changeNumber = changeNumber(data[i+1], avgScore, sum);
			change[i/2]=changeNumber;
		}
    	 //将i值为一进行，方便进行两倍变化
    	 if (i==0) {
			i=1;
    	 }
    	 //清空sum的值
    	 sum=0;
      }
      
      
      //打印输出
      for (int i = 0; i < change.length; i++) {
		System.out.println(change[i]);
      }
    }
    
    
    public static int changeNumber(int[] arr,int avgScore,int sum){
    	//排序数组
    	int number=0;
    	Arrays.sort(arr);
    	for (int i=0;i<arr.length;i++) {
			sum=sum+100-arr[i];
			if (sum>avgScore*arr.length) {
				number=i+1;
				break;
			}
		}
    	return number;
    }
    public static int[] selectSort(int[] arr){
    	for(int i=0;i<arr.length;i++) {
			for (int j = i+1; j < arr.length; j++) {
					if (arr[j]<arr[i]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
			}
		}
		return arr;
    }
     
}