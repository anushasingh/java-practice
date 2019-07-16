public final class DifferenceOfSquaresCalculator {
    
	public int computeSquareOfSumTo (int numCalculate) {
		
		int sumNatur = 0;
		
		for (int i = 1; i <= numCalculate; i++)
			sumNatur += i;

		
		return sumNatur * sumNatur;
	}

	public int computeSumOfSquaresTo (int numCalculate) {
		
		int sumSquares = 0;
		
		for (int i = 1; i <= numCalculate; i++)
			sumSquares += (i * i);
		
		return sumSquares;
	}

	public int computeDifferenceOfSquares (int numCalculate) {
		return computeSquareOfSumTo(numCalculate) - computeSumOfSquaresTo(numCalculate);
	}


}