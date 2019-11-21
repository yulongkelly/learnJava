public class DrawTriangle{
	public static void main(String[] args) {
		drawTriangle(10);
	}
	public static void drawTriangle(int N){
		int row =1;
		int col = 1;
		int max_row = N;
		while(row<=max_row)
		{
			while(col>=1) {
				System.out.print("*");
				col--;
			}
			System.out.println();
			row++;
			col = row;
			}	
		}
}
