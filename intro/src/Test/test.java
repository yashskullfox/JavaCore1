package Test;

public class test {
	
	public static void main(String argus[])
	{
		int firstArrayMatrix[][]={{1,1,1},{1,1,1}};
		int secondArrayMatrix[][]={{2,2,2},{2,2,2}};
		for(int i = 0;i < firstArrayMatrix.length;i++)
		{
			for(int j=0;j<firstArrayMatrix[i].length;j++)
			{
				System.out.print(firstArrayMatrix[i][j]+ " ");
			}
			System.out.println();
		}
	
		
	}

}
