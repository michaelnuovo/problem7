package problem7;
import java.util.ArrayList;

public class problem7 {
	
	public static void main(String[] args){
		
		ArrayList<Integer> List = new ArrayList<Integer>();
		ArrayList<Integer> Primes = new ArrayList<Integer>();
		Primes.add(2);
		Integer p=2;
		Integer n=105000; 
		Integer i=1;
		
		while(p < n) {
				
			i=1;
				
			while((p*i)<=n) {
				List.add(p*i);
				i++;
			}
				
			while (p < n) {
				p++;
				if(List.contains(p)){                     }
				else                {Primes.add(p); break;}
			}
			
		}
		
		System.out.println("PRIME ARRAY SIZE: " + Primes.size());
		System.out.println("LARGEST PRIME IN THE ARRAY IS.... " + Primes.get(Primes.size() - 1));
		System.out.println("PRIME 10,001 is.... " + Primes.get(10000));
		// 104743
		
	}
	
}


