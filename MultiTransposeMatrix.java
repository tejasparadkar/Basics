package arraymultidimension;
//WAJP to print transpose of matrix
public class MultiTransposeMatrix {

	public static void main(String[] args) {
		int a[][]={{13,53,58},{90,26,49},{62,63,85}};
		System.out.println("Before transposing");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("After transposing");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}

}
