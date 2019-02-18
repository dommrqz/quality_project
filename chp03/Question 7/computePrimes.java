import java.util.*;
public class PrimeNumberSieve implements Iterable<Integer>
{
   private List<Integer> primes = new ArrayList<Integer>();

   /*
    * creates a list of n prime numbers
    * @param  n - the number of primes to compute
    * silently treats negative arguments as zero
    */
   public void computePrimes (int n)
   {
      int count = 1; // count of primes
      int number = 2; // number tested for primeness
      boolean isPrime[] = new boolean[n+1];
      //initially assume all integers are prime
      Arrays.fill(isPrime,true);
      //set as false all non-primes using Sieve of Eratosthenes
      for(int factor = number; factor*factor <= n; factor++){
          //if factor is prime, then mark multiples of factor as non prime
          if(isPrime[factor]){
              for(int i = factor*number; i <= n; i += factor){
                  isPrime[i] = false;
              }
          }
      }
      //add the primes to the list
      for(int i = number; i <= n; i++){
          if(isPrime[i] && (i % 10 != 9)){ //The fault again
              primes.add(i);
          }
      }
   }

   @Override public Iterator<Integer> iterator() 
   { 
      return primes.iterator(); 
   }

   @Override public String toString() 
   { 
      return primes.toString(); 
   }

   public static void main (String[] argv) 
   {
      PrimeNumberSieve primes = new PrimeNumberSieve();
      primes.computePrimes(8);
      System.out.println("Primes: " + primes);

      Iterator<Integer> itr = primes.iterator();
      System.out.println("First prime: " + itr.next());
   }
}