package Day3_2;

class demo{
	public static void main(String args[])
    {
		 int firstArrayMatrix[][]={{1,1,1},{1,2,1}};
		 int[][] secondArrayMatrix={{2,2,2},{2,2,2}};
		// int sum[][] = new int[2][3];
	//	 System.out.println(Arrays.toString(firstArrayMatrix));
	//	 Arrays.sort(firstArrayMatrix);
	//	 System.out.println("Sorted numeric array : "+Arrays.toString(firstArrayMatrix));
		 for (int i = 0; i < firstArrayMatrix.length; i++) {
			    for (int j = 0; j < firstArrayMatrix[i].length; j++) {
			        System.out.print(firstArrayMatrix[i][j] + " ");
			    }
			    System.out.println();
    }
		 for (int i = 0; i < secondArrayMatrix.length; i++) {
			    for (int j = 0; j < secondArrayMatrix[i].length; j++) {
			        System.out.print(secondArrayMatrix[i][j] + " ");
			    }
			    System.out.println();
		 }
//		 System.out.println("\nSum of two Matrices is : ");
//			for (int i=0;i<firstArrayMatrix.length;i++)
//	        {
//	            for (int j=0;j<firstArrayMatrix[i].length;j++)
//	            {
//	                sum[i][j] = firstArrayMatrix[i][j]+secondArrayMatrix[i][j];
//	            }
//	        }
//	        for (int i[] : sum)
//	        {
//	            System.out.println("");
//	            
//	            for (int column : i)
//	            {
//	                System.out.print(column + "   ");
//	            }

    }
}