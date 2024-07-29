package raw;
import java.util.Scanner;
public class Prime {
  
    protected static boolean isPrime(int n){
        int count = 0;
        for(int i=1;i<n/2;i++){
            if(n%i==0){
                count++;
            }
        }
        return count<2;
    }
  
    protected static int sumPrime(int[] a){
        int sum = 0,min=Integer.MAX_VALUE;
        for(int i : a){
            if(isPrime(i)){
               sum+=i;
               if(i<min){
                   min = i;
               } } }
        return sum-min;  // Return Sum of all Prime Numbers except Minimun Prime Number
    }
  
    public static void main(String[] args) {
        int [] a = {10,41,18,50,43,31,29,25,59,96,67};
        System.out.println(sumPrime(a));
    }}
