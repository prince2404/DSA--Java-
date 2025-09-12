import java.util.*;

public class bitManipulations{
    public static int clearRangeBits(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }

    public static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static int fastExpo(int a, int n){
        int ans = 1;
        while(n > 0){
            if((n & 1) != 0){
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;
    }



    public static void main(String args[]){
        // System.out.println(clearRangeBits(10,2,4));
        // System.out.println(isPowerOfTwo(15));
        // System.out.println(countSetBits(10));
        System.out.println(fastExpo(3,5));
    }
}