
public class bubble_sort {
	public static void Bubble_Sort(int arr[], int n) {
		int x;
		for(int i = 0; i<n ; i++) {
			for(int j = 0 ; j < n-i-1 ; j++) {
				if(arr[j] > arr[j+1]) {
					x=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=x;
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Name-Jyotiranjan Mahapatra\nReg. no.- 2241013013\nsec-2241023");
		System.out.println("----------------------------------------------");
		int []arr = {10,50,20,40,60,70,15};
		Bubble_Sort(arr,arr.length);
		System.out.println("Sorted order is :-");
		for(int i = 0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
