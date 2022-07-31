package GreedyAlgo;

public class EgyptionFractionalProblem {
	
	static void egpytFraction(double numinator, double demonitor) {
		if(numinator > 1) {
			double frac = (demonitor/ numinator);
			int ciel = (int) Math.ceil(frac);
			System.out.println("1/"+ciel);
			int lcm= findLCM((int)demonitor,ciel);
			int diff=(int) (numinator*lcm/demonitor -lcm/ciel);
			egpytFraction(diff,lcm);
			
		}
		
	}
	
	static int findLCM(int no1, int no2) {
		int lcm =0;
		
		lcm= no1>no2?no2:no1;
		
		while(true) {
			if( lcm %no1==0 && lcm%no2 ==0) {
				break;
			}
			lcm++;
		}
		
		return lcm;
	}
	
	
	public static void main(String[] args) {
		
		int numinator = 12;
		int demoninator =13;
		
		
		egpytFraction(numinator,demoninator);
		
		
	}

}
