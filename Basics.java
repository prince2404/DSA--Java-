import java.util.*;

public class Basics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter year:");
        // int year = sc.nextInt();

        // if(year%4==0){
        //     if(year%100==0){
        //         if(year%400==0){
        //             System.out.println("leap year");
        //         }
        //         else{
        //             System.out.println("not a leap year");
        //         }
        //     }
        //     else{
        //         System.out.println("leap year");
        //     }
        // }
        // else{
        //     System.out.println("not a leap year");
        // }

        
        // while(true){
        //     System.out.println("enter number:");
        //     int n = sc.nextInt();
        //     if(n%10==0){
        //         break;
        //     }
        //     System.out.println(n);
            
        // }

        // System.out.println("Enter number:");
        // int n = sc.nextInt();

        // boolean isPrime = true;

        // if(n <= 1){
        //     isPrime = false;
        // }
        // else{
        //     for(int i = 2; i <= Math.sqrt(n); i++){
        //         if(n % i == 0){
        //             isPrime = false;
        //             break;
        //         }
        //     }
        // }

        // if(isPrime){
        //     System.out.println("prime number");
        // }
        // else{
        //     System.out.println("Not a prime number");
        // }

        // boolean isComposite = false;

        // if(n > 1){
        //     for(int i = 2; i <= Math.sqrt(n); i++){
        //         if(n % i == 0){
        //             isComposite = true;
        //             break;
        //         }
        //     }
        // }

        // if(isComposite){
        //     System.out.println("composite number");
        // }
        // else{
        //     System.out.println("not a composite number");
        // }

        // for(int i = 1; i <= 10; i++){
        //     System.out.println(n + " * " + i + " = " + n*i);
        // }

        // int choice = 1;
        // int evenSum = 0;
        // int oddSum = 0;
        // while(choice == 1){
        //     System.out.println("enter number:");
        //     int n = sc.nextInt();

        //     if(n % 2 == 0){
        //         evenSum += n;
                
        //     }
        //     else{
        //         oddSum += n;
        //     }

        //     System.out.println("Do you waant to continue, press 1 for continue or press 0 for exit");
        //     choice = sc.nextInt();
        // }

        // System.out.println("Sum of even numbers :" + evenSum);
        // System.out.println("Sum of odd numbers :" + oddSum);

        // for(int i = 1; i <= 4; i++){
        //     for(int j = 1; j <= 4+1-i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i = 1; i <= 4; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // int n = 4;
        // char ch = 'A';
        // for(int i = 1; i <= n; i++){
        //     char ch = 'A';
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }

        // int n = 4;
        // int m = 5;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= m; j++){
        //         if(i == 1 || i == n || j == 1 || j == m ){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // int n = 4;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k = 1; k <= i; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n+1-i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // int x = 1;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(x + " ");
        //         x++;
        //     }
        //     System.out.println();

        // }

        // int n = 5;
        // int x;
        // for(int i = 1; i <= n; i++){
        //     if(i%2==0){
        //         x = 0;
        //     } else{
        //         x = 1;
        //     }
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(x + " ");
        //         if(x == 0){
        //             x = 1;
        //         } else{
        //             x = 0;
        //         }
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k = 1; k <= n; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k = 1; k <= i; k++){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k = i; k >= 1; k--){
        //         System.out.print(k);
        //     }
        //     for(int p = 2; p <= i; p++){
        //         System.out.print(p);
        //     }
        //     System.out.println();

        // }

        // int n = 5;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k = 1; k <= n; k++){
        //         if(i == 1 || i == n || k == 1 || k == n){
        //             System.out.print("*");
        //         } else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }



        // int n = 4;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k = 1; k <= 2*i-1; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i = n; i >= 1; i--){
        //     for(int j = 1; j <= n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k = 1; k <= 2*i-1; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }

        // int n = 4;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     for(int k = 1; k <= 2*(n-i); k++){
        //         System.out.print(" ");
        //     }
        //     for(int p = 1; p <= i; p++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i = n; i >= 1; i--){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     for(int k = 1; k <= 2*(n-i); k++){
        //         System.out.print(" ");
        //     }
        //     for(int p = 1; p <= i; p++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }

        int n = 3;
        char ch = 'A';
        for(int i = 1; i <= 2*n+1; i++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();

        for(int i = 1; i <= n; i++){
            char ch1 = 'A';
            for(int j = 1; j <= n+1-i; j++){
                System.out.print(ch1);
                ch1++;
            }
            for(int k = 1; k <= 2*i-1; k++){
                System.out.print(" ");
                ch1++;
            }
            for(int p = 1; p <= n+1-i; p++){
                System.out.print(ch1);
                ch1++;
            }
            System.out.println();
        }


        

    }
}