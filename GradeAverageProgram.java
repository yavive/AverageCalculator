package GradeAverageProgram;

import java.util.Scanner;

public class GradeAverageProgram {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("English: ");
        int English = s.nextInt();
        
        System.out.print("Math: ");
        int Math = s.nextInt();
        
        System.out.print("Science: ");
        int Science = s.nextInt();
        
        System.out.print("Programming: ");
        int Programming = s.nextInt();
        
        int subjectresult = English + Math + Science + Programming;
        int subject = 4;
        int result = subjectresult / subject;
        
        System.out.println("Average: " + result);
        
        
        if (result > 100)
        System.out.println("Invalid Grade");
        
        else if (result >= 98)
        System.out.println("With Highest Honors");
                
        else if (result >= 95)
        System.out.println("With High Honors");    
        
        else if (result >= 90)
        System.out.println("With Honors");
        
        else if (result >= 75)
        System.out.println("Passed");
        
        else
        System.out.println("Failed");
    }
 
}
