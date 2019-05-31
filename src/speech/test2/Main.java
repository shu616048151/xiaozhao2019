package speech.test2;

public class Main {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,8,5,10};
		int x=10;
		int y=5;
		System.out.println(x+y+""+(x+y)+y);
		//System.out.println(findMaxLen(arr, 5));
	}
	public static int findMaxLen(int[] arr,int target){
		int[] data=new int[arr.length+1];
		data[0]=0;
		int sum=0;
		//初始值没有任何元素
		for(int i=0;i<arr.length;i++){
			for (int j =i ; j >=0; j--) {
				sum+=arr[j];
			}
			data[i+1]=sum;
			sum=0;
		}
		int maxLen=0;
		for(int i=1;i<data.length;i++){
			for(int j=i-1;j>=0;j--){
				if ((data[i]-data[j])%target==0) {
					if (i-j>maxLen) {
						maxLen=i-j;
					}
				}
			}
		}
		return maxLen;
	}

}
