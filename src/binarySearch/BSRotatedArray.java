package binarySearch;

public class BSRotatedArray {

	public static void main(String[] args) {
		int[] arr= {5,6,7,8,9,1,2,3};
		
		System.out.println(bsRotatedArray(arr, 0, arr.length-1, 1));

	}
	
	
	static int bsRotatedArray(int[] nums, int start, int end, int target) {
		if(start > end) {
			return -1;
		}
		
		int mid = start + (end - start)/2;
		if(nums[mid] == target) {
			return mid;
		}
		//[6,7,8,9,1,2,3,4],9
		if(nums[start] <= nums[mid]) {
			if(target >= nums[start] && target< nums[mid]) {
				return bsRotatedArray(nums, start, mid-1, target);
			}else {
				return bsRotatedArray(nums, mid+1, end, target);
			}
		}
		//[6,9,1,2,3,4],9  here mid = 1 so no the sorted half
		if(target >= nums[mid] && target <= nums[end]) {
			return bsRotatedArray(nums, mid+1, end, target);
		}
		return bsRotatedArray(nums, start, mid-1, target);
		

	}

}
