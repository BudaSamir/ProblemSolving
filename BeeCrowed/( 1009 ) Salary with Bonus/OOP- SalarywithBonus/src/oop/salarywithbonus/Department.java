package oop.salarywithbonus;

import java.util.Scanner;

public class Department {
    String DepName;
    int SellerNo;
    String[] Name;
    double[] FixedSalary;
    double[] Sales; 
    double[] TotalSalary;
    
    public Department(String DName,int SNo){
        DepName = DName;
        SellerNo = SNo;
        Name = new String[SellerNo];
        FixedSalary = new double[SellerNo];
        Sales = new double[SellerNo]; 
        TotalSalary = new double[SellerNo];
    }
    
    public  void getInfo(){
        
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < SellerNo; i++){
            System.out.print("enter" + (i+1) + ":");
            Name[i] = in.next(); 
            FixedSalary[i] = in.nextDouble(); 
            Sales[i] = in.nextDouble();
        }
        
    }
    
    private   double Total( double FixedSalary, double Sales ){
        return FixedSalary + (Sales *0.15);
    }
    
    private   void print(double[] totalSalary, String[] Name){
    
        for(int k = 0; k < Name.length; k++){
        System.out.print("Neme = " + Name[k] );
        System.out.printf(" ---> TOTAL = R$ %.2f\n", totalSalary[k]);
        }
    
    }
    
    public  void Sallers(){
              
        for(int a = 1; a < SellerNo; a++){
            TotalSalary[a] = Total(FixedSalary[a], Sales[a]);
        }
        
        print( TotalSalary, Name); 
    }
}
