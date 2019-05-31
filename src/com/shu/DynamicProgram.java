package com.shu;

import java.util.Arrays;

public class DynamicProgram {
	public static void main(String[] args) {
	int n=3;
	long[] dp=new long[n+1];
	Arrays.fill(dp, 0);
	dp[1]=1;
	dp[2]=2;
	for(int i=3;i<=n;i++){
		dp[i]=dp[i-1]+dp[i-2];
	}
	System.out.println(dp[n]);
	}

}
