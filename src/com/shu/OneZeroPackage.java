package com.shu;

import org.hamcrest.core.IsNot;

public class OneZeroPackage {
	public static void main(String[] args) {
		int[] values={1,2,4,8};
		int[] weigths={2,3,6,10};
		int sumWeight=22;
		System.out.println(maxValue2(values, weigths, sumWeight));
	}
	/**
	 * 01背包问题，一个物品只能使用一次
	 * @param values
	 * @param weigths
	 * @param sumWeight
	 * @return
	 */
	public static int maxValue(int[] values,int[] weigths,int sumWeight){
		int len=weigths.length;
		//表示物品i和背包容量j的情况
		int[][] data=new int[len+1][sumWeight+1];
		for(int i=1;i<len+1;i++){
			for(int j=1;j<sumWeight+1;j++){
				//weigths[i-1]表示第i个物品
				if (j<weigths[i-1]) {
					//物品的重量大于背包的容量，无法装入背包中,最大的价值只能等于上一个价值
					data[i][j]=data[i-1][j];
					}
				if (weigths[i-1]<=j) {
					//背包可以容纳data[i-1][j]表示没有加物品i的最大价值
					data[i][j]=Math.max(data[i-1][j], data[i-1][j-weigths[i-1]]+values[i-1]);
				}
				
			}
		}
		return data[len][sumWeight];
	}
	/**
	 * 完全背包问题，同类的物品有多个，就是一个物品可以使用多次
	 * @param values
	 * @param weigths
	 * @param sumWeight
	 * @return
	 */
	public static int maxValue2(int[] values,int[] weigths,int sumWeight){
		//背包问题可以使用一维数组或者二维数组进行解决
		int[][] data=new int[weigths.length+1][sumWeight+1];
		for (int i = 1; i < weigths.length+1; i++) {
			for (int j = 1; j < sumWeight+1; j++) {
				if (j<weigths[i-1]) {
					//物品的重量大于背包的容量，无法装入背包中,最大的价值只能等于上一个价值
					data[i][j]=data[i-1][j];
					}
				if (weigths[i-1]<=j) {
					//背包可以容纳data[i-1][j]表示没有加物品i的最大价值,这里表示当放入物品i时候可能继续放入所以需要data[i][j-weigths[i-1]]+values[i-1]
					//而不是i-1,所以需要同层进行比较
					data[i][j]=Math.max(data[i-1][j], data[i][j-weigths[i-1]]+values[i-1]);

				}
			}
		}
		return data[weigths.length][sumWeight];
		
	}

}
