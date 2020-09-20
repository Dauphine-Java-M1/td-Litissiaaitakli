package fr.dauphine.ja.aitaklilitissia.td00;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
/**
 * Hello world!
 *
 */
public class PrimeCollection 
{

	private int m;
	private static ArrayList<Integer> numbers = new ArrayList<Integer>();
	public PrimeCollection()
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	}
	
	public static ArrayList initRandom(int n,int m) {
		int a;
		for (int j=0; j<n; j++) {
			a= (int)(Math.random()*(m+1));
			numbers.add(a);
		}
		return numbers;
	}
	public static boolean isPrime(int p) {
		for(int k=2; k<=Math.sqrt(p); k++)
		{
			if (p%k==0){
				return false;
			}
				
		}
		return true;    		
	}
	
	public static void printPrimes() {
	
		for(int i=0; i<numbers.size(); i++) {
			if(isPrime(numbers.get(i))) {
				System.out.println(numbers.get(i));
			}
		}
	}
	
 
    public static void main( String[] args )
    {
    	initRandom(100,2000);
    	printPrimes();
    	
    	
    }
	
}
