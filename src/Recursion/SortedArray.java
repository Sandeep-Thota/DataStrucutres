package Recursion;

public class SortedArray {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6};
		System.out.println(sortedArray(nums, 0));
	}
	
	
	static boolean sortedArray(int[] nums, int index) {

		if(index == nums.length-1)
			return true;
		
		return nums[index]<= nums[index+1] && sortedArray(nums, index+1);
		
	}

}
