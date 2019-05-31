package speech.test2;
public class Solution {
	public static void main(String[] args) {
		int[] array={1,2,3,4,5,6,7};
		reOrderArray(array);
	}
    public static void reOrderArray(int [] array) {
     int[] out=new int[array.length];
      int k=0;
     for(int i=0;i<array.length;i++){
          if((array[i]%2)!=0){
              out[k]=array[i];
              k++;
          }
      }
       for(int j=0;j<array.length;j++){
          if((array[j]%2)==0){
              out[k]=array[j];
              k++;
          }
      }
      String s1="[";
      for(int i=0;i<out.length;i++){
          if(i==out.length-1){
              s1+=out[i]+"]";
          }else{
              s1+=out[i]+",";
          }
      }
       System.out.println(s1);
    }
}