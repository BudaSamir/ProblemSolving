package oop_thegreatest;
public class Major {
    int A, B, C;
    
    Major(int A, int B, int C){
        this.A = A;
        this.B = B;
        this.C = C;
    }
    
    int TheMajor(int A, int B, int C){
    int major =( A + B +  Math.abs(A-B) ) / 2;
    major =( major + C +  Math.abs(major-C) ) / 2;
    return major;
}
    void Get_TheGreatest(){
     int Greatest = TheMajor(this.A,this.B,this.C);
     
     if (Greatest == A) System.out.println("The Greatest is The First Number " + A);
     else if (Greatest == B) System.out.println("The Greatest is The Second Number " + B);
     else if(Greatest == C) System.out.println("The Greatest is The Third Number " + C);
     else System.out.println("The Greatest is No Geartest");
    }
}
