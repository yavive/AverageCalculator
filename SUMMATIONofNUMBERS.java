package summationofnumbers;


public class SUMMATIONofNUMBERS {

    
    public static void main(String[] args) {
        
        int numbers [] = {1,2,3,4,5};
        
        int result = summation(numbers);
        System.out.println(result);
        
    }
    
    static int summation (int numbers[]) { 
        int sum = 0;
        
        for(int number: numbers) {
            sum = sum + number;
        }    
            
        return sum;
    }
}
