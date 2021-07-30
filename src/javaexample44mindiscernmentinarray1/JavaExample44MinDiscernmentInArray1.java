
package javaexample44mindiscernmentinarray1;


public class JavaExample44MinDiscernmentInArray1 {

    
    public static void main(String[] args) {
        int[] b=new int[] {5,2,3,4,1};
        int[] c=new int[] {6,2,3,4,5,1};
        
        int ans1=MinHelper.Min(b);
        int ans2=MinHelper.Min(c);
        
        System.out.println("b: "+MinHelper.PrintArray(b));
        System.out.println("The min item in array b: "+ans1);
        System.out.println("------------------------------");
        System.out.println("c: "+MinHelper.PrintArray(c));
        System.out.println("The min item in array c: "+ans2);
        
        System.out.println();
        System.out.println();
        
        int ans3=MinHelperN2.Min(b);
        int ans4=MinHelperN2.Min(c);
        
        System.out.println("b: "+MinHelper.PrintArray(b));
        System.out.println("The min item (my way) in array b: "+ans3);
        System.out.println("------------------------------");
        System.out.println("c: "+MinHelper.PrintArray(c));
        System.out.println("The min item (my way) in array c: "+ans4);
        
        System.out.println();
        System.out.println();
        
        int ans5=MinHelperN3.Min(b);
        int ans6=MinHelperN3.Min(c);
        
        System.out.println("b: "+MinHelper.PrintArray(b));
        System.out.println("The min item (another way) in array b: "+ans5);
        System.out.println("------------------------------");
        System.out.println("c: "+MinHelper.PrintArray(c));
        System.out.println("The min item (another way) in array c: "+ans6);
    }
    
}
