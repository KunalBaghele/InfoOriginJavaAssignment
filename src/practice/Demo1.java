package practice;

public class Demo1 {
	
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		Integer a=10;
		print(arr);
		yash(arr,a);
		System.out.println();
		print(arr);
		System.out.println(a);
	}

	private static void yash(int[] arr,int k) {
		for (int i = 0; i < arr.length; i++) {
			arr[i]=arr[i]*2;
		}
	}

	private static void print(int[] arr) {
		for(int i :arr) {
			System.out.print(i);
		}
	}

}
