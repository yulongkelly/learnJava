public class DrawTriangle{
	public static void main(String[] args) {
		int row =1;
		int col = 1;
		int max_row = 5;
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
