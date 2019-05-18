package gollie_Pratice; 

public class Test1 { 
	
	int subArraySum(int arr[], int size, int sum)  
    { 
        int curr_sum, i, j; 
  
        // Pick a starting point 
        for (i = 0; i < size; i++)  
        { 
            curr_sum = arr[i]; 
  
            // try all subarrays starting with 'i' 
            for (j = i + 1; j <= size; j++)  
            { 
                if (curr_sum == sum)  //{15, 2, 4, 8, 9, 5, 10, 23}; int sum = 23; 
                { 
                    int p = j - 1; 
                    System.out.println("Sum found between indexes " + i 
                            + " and " + p); 
                    return 1; 
                } 
                if (curr_sum > sum || j == size) 
                    break; 
                curr_sum = curr_sum + arr[j]; 
                System.out.println(curr_sum); 
            } 
        } 
  
        System.out.println("No subarray found"); 
        return 0; 
    } 

	 public static void main(String[] args) {	


		Test1 arraysum = new Test1(); 
	        int arr[] = {15, 2, 4, 8, 9, 5, 10, 25}; 
	        int size = arr.length; 
	        System.out.println(size); 
	        int sum = 25; 
	        arraysum.subArraySum(arr, size, sum); 
	} 

} 
