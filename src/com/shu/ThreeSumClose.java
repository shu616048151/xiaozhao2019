package com.shu;

public class ThreeSumClose {
	public static void main(String[] args) {
		System.out.println(thrresum(new int[]{0,1,2,3}, 3));
	}
	public static int thrresum(int[] arr,int target){
		if (arr.length<3) {
			return 0;
		}
		int minclose=Integer.MAX_VALUE;
		int targetSum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				for (int j2 = j+1; j2 < arr.length; j2++) {
					int sum=arr[i]+arr[j]+arr[j2];
					if (Math.abs(sum-target)<minclose) {
						minclose=Math.abs(sum-target);
						targetSum =sum;
					}
				}
			}
		}
		
		return targetSum;
	}

}
