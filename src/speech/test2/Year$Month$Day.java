package speech.test2;

import javax.xml.crypto.Data;

public class Year$Month$Day {
	public static void main(String[] args) {
		int[][] date={{1900,3,5},{2000,3,5}};
		int[] caculateDayNum = caculateDayNum(date);
		System.out.println(caculateDayNum[0]);
		System.out.println(caculateDayNum[1]);
	}
	public static int[] caculateDayNum(int[][] date){
		int[] out=new int[date.length];
		//每个月的天数
		int[] runYear=new int[13];
		int[] pingYear=new int[13];
		for(int i=1;i<13;i++) {
			if (i==1||i==3||i==5||i==7||i==8||i==10||i==12) {
				runYear[i]=31;
				pingYear[i]=31;
			}
			if (i==4||i==6||i==9||i==11) {
				runYear[i]=30;
				pingYear[i]=30;
			}
			if (i==2) {
				pingYear[i]=28;
				runYear[i]=29;
			}
		}
		
		for(int i=0;i<date.length;i++){
			int[] yearmonthDay=date[i];
			//加上当月的天数
			out[i]=yearmonthDay[2];
			//加上前面月份的天数
			for(int j=1;j<yearmonthDay[1];j++){
				//当年为闰年
				if((yearmonthDay[0]%4==0&&yearmonthDay[0]%100!=0)||yearmonthDay[0]%400==0){
					out[i]+=runYear[j];
				}else {
					out[i]+=pingYear[j];
				}
			}
		}
		return out;
	}
}
