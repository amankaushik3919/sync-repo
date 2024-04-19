class Solution {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Loop through the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Check if the current digit is less than 9
            if (digits[i] < 9) {
                // Increment the digit by 1
                digits[i]++;
                return digits;
            } else {
                // Set the current digit to 0
                digits[i] = 0;
            }
        }

        // If we're here, it means every element was 9
        // Add 1 at the beginning of the array
        int[] result = new int[n + 1];
        result[0] = 1;

        return result;
    }
}
