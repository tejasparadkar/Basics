package arraymultidimension;
//WAJP to print 2D array in matrix format
public class MultiArrayMatrix {

	public static void main(String[] args) {
		int a[][]={{13,53,58,78},{90,26,49,96},{62,63,85,97}};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
