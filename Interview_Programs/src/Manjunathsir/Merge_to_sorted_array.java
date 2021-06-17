package Manjunathsir;

public class Merge_to_sorted_array {

	public static void main(String[] args) {
		int arr1[]= {4,9,13,16,18};
		int arr2[]= {2,5,8,10,14,29};
		int length1=arr1.length;
		int length2=arr2.length;
		int res[]=new int[length1+length2];
		sort( arr1, arr2,res, length1, length2);	
		for(int p=0;p<res.length;p++)
		{
			System.out.print(res[p]+",");	
		}
		
	}
	public static  void sort(int arr1[],int arr2[],int res[],int length1,int length2)
	{
		int i=0;
		int j=0;
		int k=0;
		while(i<length1&&j<length2)
		{
			if(arr1[i]<arr2[j])
			{
				res[k]=arr1[i];
				i++;
				k++;
			}
			else 
			{
				res[k]=arr2[j];
				j++;
				k++;
			}

		}
		while(i<length1)
		{
			res[j]=arr1[i];
			i++;
			k++;
		}
		while(j<length2)
		{
			res[k]=arr2[j];
			j++;
			k++;
		}
		
	}

}
