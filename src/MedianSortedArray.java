
public class MedianSortedArray {
	
//	public static void main(String args[]) {
//		int[] nums1 = {2,2,4,4};
//		int[] nums2 = {2,2,4,4};
//		System.out.println(findMedianSortedArrays(nums1, nums2));
//	}
	
	
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int temp =0;
        int[] result = new int[nums1.length+nums2.length];
        while(i < nums1.length && j< nums2.length){
            if(nums1[i] < nums2[j] ){
                result[temp] = nums1[i];
                i++;
            }else if(nums1[i] > nums2[j]){
                result[temp] = nums2[j];
                j++;
            }else{
               result[temp] = nums1[i];
                result[++temp] = nums2[j];
                i++;
                j++;
            }
            temp++;    
        }
        
        while(i+j != result.length){
        	temp =i+j;
            if(j!= nums2.length){
                result[temp] = nums2[j];
                j++;
            }else if(i!= nums1.length){
                result[temp] = nums1[i];
                 i++;
            }else{
                
            }
            temp++;
        }
        
        
        int l = result.length;
        if(l %2 == 0){
            return (double)(result[l/2]+ result[(l/2)-1])/2;
        }
        return result[l/2];
    }
}
