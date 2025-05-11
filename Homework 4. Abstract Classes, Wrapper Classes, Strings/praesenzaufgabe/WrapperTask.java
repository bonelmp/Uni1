package praesenzaufgabe;

public class WrapperTask {
	public static void main(String[] args) {
		char[] values = { '1', 'a', '3', 'z', '9' };
		int[] nums = { 10, 0, -4, 20, 5 };

		// You can call your methods here and print results
		// Example:
		// System.out.println(countDigitsPrimitive(values));
		System.out.println(countDigitsPrimitive(values));
		System.out.println(countDigitsWrapper(values));
		System.out.println(maxPrimitive(nums));
		System.out.println(maxWithWrapper(nums));
		
		

	}

	// Task A: Count digits using only primitives (e.g., ASCII comparison)
	public static int countDigitsPrimitive(char[] values) {
		// TODO: Implement using primitive logic
		int count = 0;
		for (char value : values) {
			if (value >= '0' && value <= '9') { // Überprüfen ob der Wert des Indexes zwischen 0 & 26 liegt, dann ist es
												// eine Zahl
				count++;
			}
		}
		return count;
	}

	// Task B: Count digits using Character.isDigit()
	public static int countDigitsWrapper(char[] values) {
		// TODO: Implement using wrapper method
		int count = 0;
		for (char value : values) {
			if (Character.isDigit(value)) {
				count++;
			}

		}
		return count;
	}

	// Task C: Find max using only primitives
	public static int maxPrimitive(int[] nums) {
		int max = nums[0];
		for( int i = 1; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		return max;
	}

	// Task D: Find max using Integer.compare()
	public static int maxWithWrapper(int[] nums) { //noch anschauen
		int max = nums[0];
		for(int num : nums) {
			 if(Integer.compare(num, max) > 0) {
				 max = nums[num];
			 }
		}
		return max;
	}
}
