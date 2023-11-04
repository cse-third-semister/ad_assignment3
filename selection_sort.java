
public class selection_sort {
	public static void selection_sort(int[]arr) {
		for(int i=0 ; i<arr.length-1 ; i++) {
			int min_j=i;
			int min_x=arr[i];
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j]<min_x) {
					min_j=j;
					min_x=arr[j];
					arr[min_j]=arr[i];
					arr[i]=min_x;
				}
			}
		}
	}

	public static void main(String[] args) {
		int []arr = {10,50,20,40,60,70,15};
		selection_sort(arr);
		for(int i = 0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
