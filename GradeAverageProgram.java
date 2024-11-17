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
        
        
        if (result < 75)
        System.out.println("Failed");
        
        else if (result <= 89.99)
        System.out.println("Passed");
                
        else if (result <= 94.99)
        System.out.println("With Honors");    
        
        else if (result <= 97.99)
        System.out.println("With High Honors");
        
        else if (result <= 100)
        System.out.println("With Highest Honors");
        
        if (result > 100)
        System.out.println("Invalid Grade");
    }
 
}
