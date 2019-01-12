
package Day2_2;
class Controls{
     public static void main(String args[]){

for(int i= 0; i<5 ; i++)
{ 
	for(int j = 0; j<5; j++)
		{
           System.out.print(j +"\t");
           if(j > 5)
           {
        	   break; 
        	}
}
System.out.println("Outer Loop");
}
System.out.println("End");
}
}