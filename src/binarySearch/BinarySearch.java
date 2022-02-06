package binarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		int[] nums = {5,7,7,8,8,10};
		
      firstLastIndex(nums, 8);
	}
	
	/*when infintie array is given we cannot use the array.length so we start with start with0 and end with 1 and
	try to double the range of box and find the range in which target element present and then perform binary search 
	on that box with O(logN)
	*/
	public static int infiniteArray(int[] array, int target) {
		int start =0;
		int end = 1;
		
		while(target > array[end]) {
			int temp = end+1;
			end = end + (end-start+1)*2;
			start = temp;
		}
		return 1;
//		return binarySearch(array, target, start, end);
	}
	
	
	
	public static int[] firstLastIndex(int[] nums, int target) {
		int[] ans = {-1, -1};
		int start = firstLastIndex(nums, target, true);
		int end = firstLastIndex(nums, target, false);
		ans[0]= start;
		ans[1]= end;
		System.out.println("Answer is"+ans[0] +""+ans[1]);
		return ans;
	}
	
	
	public static int firstLastIndex(int[] array, int target, boolean firstStartIndex) {
		int ans = -1;
		int start =0;
		int end = array.length-1;
		while(start <= end) {
			int mid = start + (end -start)/2;
			
			if(array[mid] > target) end = mid-1;	
			else if(array[mid]<target) start = mid+1;	
			else {
				ans = mid;
				if(firstStartIndex) {
					end = mid-1;
				}else {
					start = mid+1;
				}
			}
		}
		return ans;
		
	}

}
