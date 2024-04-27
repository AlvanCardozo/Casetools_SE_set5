package question2;
import java.math.*;
public class MaxArray {

	public int findMax() {
		int[] nums = {2,3,6,8,9};
		if( nums==null || nums.length == 0) {
			throw new IllegalArgumentException("Array is empty");
		}
		int max = nums[0];
		for (int  num : nums) {
			if(num>max) {
				max = num;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		MaxArray Max =  new MaxArray();
		int max =  Max.findMax();
		System.out.println("Reversed number: " + max);
	}
	
}
