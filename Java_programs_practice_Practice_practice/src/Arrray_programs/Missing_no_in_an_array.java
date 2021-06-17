package Arrray_programs;

public class Missing_no_in_an_array {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5};
		int sum1=0;
		int sum2=0;
		for(int i=0;i<arr.length;i++)
			sum1=sum1+arr[i];
		for(int j=1;j<=5;j++)
			sum2=sum2+j;
		System.out.println("Miising Lement of array is: "+(sum2-sum1));

	}

}
