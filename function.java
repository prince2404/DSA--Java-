import java.util.*;

public class function{
    public static boolean prime(int n){
        boolean isPrime = true;

        if(n <= 1){
            isPrime = false;
        }
        else{
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        return isPrime;
    }

    public static void binToDec(int binNum){
        int power = 0;
        int decNum = 0;

        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum += lastDigit * (int)Math.pow(2,power);
            binNum = binNum/10;
            power++;
        }

        System.out.println("Decimal = " + decNum);
    }

    public static void decToBin(int decNum){
        int power = 0;
        int binNum = 0;

        while(decNum > 0){
            int rem = decNum % 2;
            binNum += rem * (int)Math.pow(10,power);
            decNum = decNum/2;
            power++;
        }

        System.out.println("Binary = " + binNum);
    }

    public static float average(int a, int b, int c){
        float average = (a+b+c)/3;
        return average;
    }

    public static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static void palinDrome(int n){
        int original = n;
        int reverse = 0;

        while(n > 0){
            int lastDigit = n % 10;
            reverse = reverse*10 + lastDigit;
            n = n/10;
        }
        if(original == reverse){
            System.out.println(original + " is a palindrome number");
        } else{
            System.out.println(original + " is not a palindrome number");
        }
    }

    public static void sumOfDigits(int n){
        int sum = 0;
        while(n > 0){
            int lastDigit = n % 10;
            sum += lastDigit;
            n = n/10;
        }
        System.out.println("sum of digits :" + sum);
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter value of n:");
        // int n = sc.nextInt();
        
        // for(int i = 2; i <= n; i++){
        //     if(prime(i)){
        //         System.out.print(i + " ");
        //     }
        // }

        // System.out.print("Enter binary number:");
        // int n = sc.nextInt();
        // binToDec(n);

        // System.out.print("Enter decimal number:");
        // int n = sc.nextInt();
        // decToBin(n);

        // System.out.println("Enter first number:");
        // int a = sc.nextInt();
        // System.out.println("Enter second number:");
        // int b = sc.nextInt();
        // System.out.println("Enter third number:");
        // int c = sc.nextInt();
        // float average = average(a,b,c);
        // System.out.println("Average = " + average);

        // System.out.print("Enter number : ");
        // int n = sc.nextInt();
        // if(isEven(n)){
        //     System.out.println("even number");
        // }else{
        //     System.out.println("odd number");
        // }

        System.out.print("Enter number:");
        int n = sc.nextInt();
        // palinDrome(n);

        sumOfDigits(n);
    }
}