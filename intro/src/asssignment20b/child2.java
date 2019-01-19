package asssignment20b;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import asssignment20a.base;


public class child2 extends base{ 

public void getValues() {
base Base1=new base();
//System.out.println (variable3); //cannot access private data member of Base class.
// System.out.println (variable3); // here variable3 cannot be accessed by Base class object also as it is private, needs getter method)
 System.out.println (variable4);
}

}