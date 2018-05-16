package top.lothar.sort;

public class MaoPaoSort {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] array = new int[]{5,3,4,2,1};
		sort(array);
	}
	
	public static void sort(int arr[]){
		
		for(int i = 0 ; i<arr.length-1 ; i++){
			
			for(int j = 0 ; j<arr.length-1 ; j++){
				int temp;
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int a = 0 ; a<arr.length ; a++){
			System.out.println(arr[a]);
		}
		
	}
}
