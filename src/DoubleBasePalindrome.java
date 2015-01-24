
public class DoubleBasePalindrome {

	/**
	 * Author: James Norcross
	 * Date: 1/23/15
	 * Purpose: Project Euler Problem 36
	 * Description finds the sum of all integers less than 1000000 which are palindromes in both base 10 and base 2
	 */
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 0; i < 1000000; i++){
			
			String decI, binI;
			decI = Integer.toString(i);
			binI = Integer.toBinaryString(i);
			
			if(isPalindrome(decI) && isPalindrome(binI))
				sum += i;
		}
		
		System.out.println(sum);
		

	}
	
	private static boolean isPalindrome(String s)
	{
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) != s.charAt(s.length()-1-i))
				return false;
		}
		
		return true;
	}

}
