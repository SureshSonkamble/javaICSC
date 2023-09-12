package DS;

public class twodarry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 int[][] arr = new int[10][20];
//	     arr[0][0] = 1;
//	     System.out.println("arr[0][0] = " + arr[0][0]);
		int[][] ar = { { 1, 2 }, { 3, 4 } };
		 
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                System.out.println("arr[" + i + "][" + j + "] = "
                                + ar[i][j]);
	}

}
