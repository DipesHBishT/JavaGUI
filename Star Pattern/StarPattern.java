
package starpattern;

/**
 *
 * @author dipesh bIsht
 */
public class StarPattern {
    
    public void pattern() {
        int i;
        int j;
        for (i = 1; i <= 3; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StarPattern obj = new StarPattern();
        obj.pattern();
    }    
    
}
