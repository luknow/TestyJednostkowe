package Logic;

public class NumberOperations {

	public static int findMax(int arr[]){  
        int max=arr[0];
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
        }  
        return max;  
    }  
	
	public static int powerOfTwo(int value) {
		return value * value;
	}
	
	public static boolean isPositive (int value) {
		if(value > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int Fibonacci(int value) {
	    if(value == 0 || value == 1) {
	        return value;
	    }
	    int previous = 0;
	    int next = 1;
	    int temp = 0;
	    for (int i = 2; i <= value; i++) {
	        temp = previous + next;
	        previous = next;
	        next = temp;
	    }
	    return next;
	}
}
