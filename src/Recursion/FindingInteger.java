package Recursion;

import java.util.ArrayList;

public class FindingInteger {

	public static void main(String[] args) {
		int[] nums = {1,2,3,3,2,1};
		System.out.println(sortedArray(nums, 0, 1));
		System.out.println(findIndex(nums, 0, 4, new ArrayList<>()
				));
	}
	
	
	static boolean sortedArray(int[] nums, int index, int target) {
		
		if(index == nums.length)
			return false;
		
		return nums[index]==target || sortedArray(nums, index+1, target);
		
	}
	
	static ArrayList<Integer> findIndex(int[] nums,int index, int target, ArrayList<Integer> list ){
		if(index == nums.length)
			return list;
		
		if(nums[index] == target)
			list.add(index);
		
		 return findIndex(nums, index+1, target, list);
					
	}

	static ArrayList<Integer> findIndex(int[] nums,int index, int target){
		ArrayList<Integer> list = new ArrayList<>();
		if(index == nums.length)
			return list;
		
		if(nums[index] == target)
			list.add(index);
		
		 ArrayList<Integer> ansForBelowCalls =  findIndex(nums, index+1, target);
		 list.addAll(ansForBelowCalls);
		 return list;
					
	}
}
