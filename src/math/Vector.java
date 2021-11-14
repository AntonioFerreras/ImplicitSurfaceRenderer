package math;

public class Vector {
	public double[] comps;
	
	public Vector(double... args) {
		comps = args;
	}
	public void setComps(double... args) {
		comps = args;
	}
	public Vector add(Vector v2) {
		if(comps.length != v2.comps.length) throw new DimensionMismatchException(comps.length, v2.comps.length);
		
		Vector result = new Vector(comps);
		for(int i = 0; i < comps.length; i++) {
			result.comps[i] += v2.comps[i] ;
		}
		
		return result;
	}
	public Vector subtract(Vector v2) {
		if(comps.length != v2.comps.length) throw new DimensionMismatchException(comps.length, v2.comps.length);
		
		Vector result = new Vector(comps);
		for(int i = 0; i < comps.length; i++) {
			result.comps[i] -= v2.comps[i] ;
		}
		
		return result;
	}
	public Vector multiply(Vector v2) {
		if(comps.length != v2.comps.length) throw new DimensionMismatchException(comps.length, v2.comps.length);
		
		Vector result = new Vector(comps);
		for(int i = 0; i < comps.length; i++) {
			result.comps[i] *= v2.comps[i] ;
		}
		
		return result;
	}
	public Vector scale(int s) {
		Vector result = new Vector(comps);
		for(int i = 0; i < comps.length; i++) {
			result.comps[i] *= s;
		}
		
		return result;
	}
	
	public double norm(int s) {
		double result = 0.0;
		for(int i = 0; i < comps.length; i++) {
			result += comps[i]*comps[i];
		}
		return Math.sqrt(result);
	}
	
	public static double dot(Vector v1, Vector v2) {
		if(v1.comps.length != v2.comps.length) throw new DimensionMismatchException(v1.comps.length, v2.comps.length);
		
		double result = 0.0;
		for(int i = 0; i < v1.comps.length; i++) {
			result += v1.comps[i] * v2.comps[i];
		}
		return result;
	}
}
