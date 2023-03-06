package method_simplecalculate;
import java.util.Scanner; 
public class Method_SimpleCalculate {
    
    public static void main(String[] args) { 
      Object[] ProdInfo = new Object[3];
      double Cart = 0;
      GetInfo(ProdInfo);
    }
    /*
        ProdInfo[0] = prod_code
        ProdInfo[1] = prod_units
        ProdInfo[2] = prod_price
    */
    static void GetInfo(Object[] PI){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i<PI.length; i++){
            switch(i){
                case 0 -> {
                    System.out.print("Enter The Product Code : ");
                    PI[i] = in.nextInt();
                }
                case 1 ->{
                    System.out.print("Enter The Product units : ");
                    PI[i] = in.nextInt();
                }
                case 2 ->{
                    System.out.print("Enter The Product price : ");
                    PI[i] = in.nextInt();
                }
            }
        }
        
    }
    
    static double paid(Object[] PI){
        var paids = 1;
        /*for(int i =1; i< PI.length; i++){
            paids = paids * PI[i];
        }*/
        return (PI[1]*PI[2]);
    }
}
