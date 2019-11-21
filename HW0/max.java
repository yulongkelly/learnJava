public class max {
   public static int max(int[] m) {
   	int temp_max = m[0];
   	int n = 0;
      int max_n = m.length - 2;
   	while(n < max_n){
	   	if (m[n]<m[n+1])
	   	{
	   		temp_max = m[n+1];
	   	}
         n++;
	 }
	 return temp_max;
   }
   public static void main(String[] args) {
      int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6}; 
      System.out.println(max(numbers));    
   }
}