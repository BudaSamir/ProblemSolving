package oop_average2;
public class OOP_Average2 {
    public static void main(String[] args) {
       Student S1 = new Student();
       S1.SetGrades();
       System.out.printf("MEDIA = %.1f\n", S1.GetAverage());
       Student S2 = new Student();
       S2.SetGrades();
       System.out.printf("MEDIA = %.1f\n", S2.GetAverage());
       Student S3 = new Student();
       S3.SetGrades();
       System.out.printf("MEDIA = %.1f\n", S3.GetAverage());
    }
    
}
