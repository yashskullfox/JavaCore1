public class class1 {
        // int i=22;
        // int j=14000;
          
     public static void main(String args[]){
      int i = 22;
          int j = 14000;
    	// boolean k;
        // boolean l;
           class1 class1= new class1(); 
          boolean k = class1.Method1(i);
           boolean l = class1.Method2(j);
if(k==true && l==true ) 
			{
                System.out.print(" Is a new employee");
           }
else {
                System.out.print(" Is not a new employee");
           }
}
public boolean Method1(int i) {
           if (i>20 && i<30)
           {
                return true;
           }
else {
                return false;
           }
}
public boolean Method2(int j) {
     if (j>=14000 && j<20000)
     {
           return true;
     }
else {
           return false;
}
}
}