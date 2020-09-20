package fr.dauphine.ja.aitaklilitissia.td00;

import fr.dauphine.ja.aitaklilitissia.td00.PrimeCollection;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PrimeCollectionTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PrimeCollectionTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PrimeCollectionTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    PrimeCollection p= new PrimeCollection();
    public void test0isPrime() {
    	System.out.println("0");
    	System.out.println( p.isPrime(0));
    }
    
    public void testTwoIsPrime() {
    	System.out.println("2");
    	System.out.println(p.isPrime(2));
    }
    
    public void test9IsNotPrime() {
    	System.out.println("9");
    	System.out.println(p.isPrime(9));
    }
}
