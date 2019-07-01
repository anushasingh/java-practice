import java.lang.*;
class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		int sumOfDigits = 0;

		String num = Integer.toString(numberToCheck);

		for(int i =0; i<num.length(); i++){
			sumOfDigits += Math.pow( Character.getNumericValue(num.charAt(i)), num.length());
		}

        if(sumOfDigits == numberToCheck || num.length() ==1){
			return true;
		} else {

			return false;
		}
	}

}
