class TGEIA 
{ 
static void thirdLargest(int arr[], 
						int arr_size) 
{ 
	if (arr_size < 3) 
	{ 
		System.out.printf(" Invalid Input "); 
		return; 
	} 

	int first = arr[0]; 
	for (int i = 1; 
			i < arr_size ; i++) 
		if (arr[i] > first) 
			first = arr[i]; 
 
	int second = Integer.MIN_VALUE; 
	for (int i = 0; 
			i < arr_size ; i++) 
		if (arr[i] > second && 
			arr[i] < first) 
			second = arr[i]; 

	int third = Integer.MIN_VALUE; 
	for (int i = 0; 
			i < arr_size ; i++) 
		if (arr[i] > third && 
			arr[i] < second) 
			third = arr[i]; 

	System.out.printf("The third Largest " + 
				"element is %d 
", third); 
} 

public static void main(String []args) 
{ 
	int arr[] = {12, 13, 1, 
				10, 34, 16}; 
	int n = arr.length; 
	thirdLargest(arr, n); 
} 
} 

