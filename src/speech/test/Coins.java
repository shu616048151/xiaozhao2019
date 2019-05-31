package speech.test;

import java.util.Arrays;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

/**
 * 凑钱币问题
 * @author Administrator
 *
 */
public class Coins {
	public static void main(String[] args) {
		int[] arr={1,2,5};
		System.out.println(minNum(arr, 11));
		System.out.println(pathNum(2, 2));
	}
	
	/**
	 * 最小的数量凑满
	 * @return
	 */
	public static int minNum(int[] val,int target){
		//当前面值的方法
		int[] data=new int[target+1];
		Arrays.fill(data, Integer.MAX_VALUE);
		data[0]=0;
		for(int i=1;i<target+1;i++){
			for (int j = 0; j < val.length; j++) {
				if (val[j]<=i) {
					//加入当前的货币，货币数量+1,类似于完全背包问题
					data[i]=Math.min(data[i-val[j]]+1, data[i]);
				}
			}
		}
		return data[target];
	} 
	public static int mun(){
		return 0;
	}
	
	public static int pathNum(int n,int m){
		int[][] data=new int[n+1][m+1];
		for(int i=1;i<n+1;i++){
			data[i][1]=1;
		}
		for(int j=0;j<m+1;j++){
			data[1][j]=1;
		}
		data[1][1]=0;
		for (int i = 2; i < n+1; i++) {
			for (int j = 2; j < m+1; j++) {
				data[i][j]=data[i-1][j]+data[i][j-1];
			}
			
		}
		return data[n][m];
		
	}
}
