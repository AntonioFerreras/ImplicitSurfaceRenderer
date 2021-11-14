package math;

public class IntegerVector {
	public int[] comps;
	
	public IntegerVector(int... args) {
		comps = args;
	}
	public void setComps(int... args) {
		comps = args;
	}
	public IntegerVector add(IntegerVector v2) {
		if(comps.length != v2.comps.length) throw new DimensionMismatchException(comps.length, v2.comps.length);
		
		IntegerVector result = new IntegerVector(comps);
		for(int i = 0; i < comps.length; i++) {
			result.comps[i] += v2.comps[i] ;
		}
		
		return result;
	}
	public IntegerVector subtract(IntegerVector v2) {
		if(comps.length != v2.comps.length) throw new DimensionMismatchException(comps.length, v2.comps.length);
		
		IntegerVector result = new IntegerVector(comps);
		for(int i = 0; i < comps.length; i++) {
			result.comps[i] -= v2.comps[i] ;
		}
		
		return result;
	}
	public IntegerVector multiply(IntegerVector v2) {
		if(comps.length != v2.comps.length) throw new DimensionMismatchException(comps.length, v2.comps.length);
		
		IntegerVector result = new IntegerVector(comps);
		for(int i = 0; i < comps.length; i++) {
			result.comps[i] *= v2.comps[i] ;
		}
		
		return result;
	}
	public IntegerVector scale(int s) {
		IntegerVector result = new IntegerVector(comps);
		for(int i = 0; i < comps.length; i++) {
			result.comps[i] *= s;
		}
		
		return result;
	}
}
