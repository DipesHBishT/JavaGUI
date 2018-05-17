
package javaapplication13;

/**
 *
 * @author dipesh bIsht
 */
public class JavaApplication13 
{
    public void pattern
            
    {
        int i,int j;  
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=i;j++)
            {
               System.out.print("*");
            } 
        System.out.println("");
        }
    }
    
    public static void main(String[] args) 
    {
        JavaApplication13 obj=new JavaApplication13();
        
        obj.pattern();
       /* for(i=1;i<=3;i++)
        {
            for(j=1;j<=i;j++)
            {
               System.out.print("*");
            } 
        System.out.println("");
        }
    */
       
    }
    
}
