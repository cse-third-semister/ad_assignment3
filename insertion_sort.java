
public class insertion_sort {
	public static void insertion_sort(int arr[]) {
		for(int j = 1 ; j<arr.length ;j++) {
			int key = arr[j];
			int i = j-1;
			while(i>-1 && arr[i]>key) {
				arr[i+1] = arr[i];
				i=i-1;
			}
			arr[i+1]=key;
		}
	}

	public static void main(String[] args) {
		System.out.println("Name-Jyotiranjan Mahapatra\nReg. no.- 2241013013\nsec-2241023");
		System.out.println("----------------------------------------------");
		int []arr = {10,51,9,4,67,70,15};
		insertion_sort(arr);
		System.out.println("Sorted order is :-");
		for(int i = 0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
