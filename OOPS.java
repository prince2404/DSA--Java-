import java.util.*;

public class OOPS{
    public static void main(String args[]){
        // Pen p1 = new Pen();
        // p1.setInfo("Blue",5);
        // p1.getInfo();

        // int marks[] = {97,98,100};
        // Student s1 = new Student("prince",231123,marks);
        // Student s2 = new Student(s1);
        // s1.marks[0] = 67;
        // System.out.println(s2.marks[0]);
        // s1.name = "aman";
        // System.out.println(s2.name);
        // s1.rollno = 80227;
        // System.out.println(s2.rollno);

        // Student s1 = new Student();
        // s1.getInfo();

        // Mouse m = new Mouse();

        // TA t1 = new TA();
        // t1.study();
        // t1.teach();

        // Student s1 = new Student();
        // s1.schoolName = "RLPS";
        // Student s2 = new Student();
        // // System.out.println(s2.schoolName);

        // Student s3 = new Student();
        // // System.out.println(s3.schoolName);
        // s3.schoolName = "JMD";
        // System.out.println(s1.schoolName);
        // System.out.println(s2.schoolName);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part of first complex number : ");
        int real1 = sc.nextInt();
        System.out.print("Enter imaginary part of first complex number : ");
        int imag1 = sc.nextInt();
        System.out.print("Enter real part of second complex number : ");
        int real2 = sc.nextInt();
        System.out.print("Enter imaginary part of second complex number : ");
        int imag2 = sc.nextInt();

        Complex c1 = new Complex(real1,imag1);
        Complex c2 = new Complex(real2, imag2);

        c1.sum(c2);
        c1.difference(c2);
        c1.product(c2);

        


        
    }
}

class Complex{
    int real;
    int imag;

    Complex(int real, int imag){
        this.real = real;
        this.imag = imag;
    }

    void sum(Complex c2){
        int realSum = this.real + c2.real;
        int imagSum = this.imag + c2.imag;
        System.out.println("Sum = " + realSum + " + " + imagSum + "i");
        
    }

    void difference(Complex c2){
        int realDiff = this.real - c2.real;
        int imagDiff = this.imag - c2.imag;
        System.out.println("Difference = " + realDiff + " + " + imagDiff + "i");
        
    }

    void product(Complex c2){
        int realProd = this.real * c2.real - this.imag * c2.imag;
        int imagProd = this.real * c2.imag + this.imag * c2.real;
        System.out.println("Product = " + realProd + " + " + imagProd + "i");
        
    }
}

class Student{
    String name;
    int age;
    static String schoolName;
}

// interface Student{
//     void study();
// }

// interface Teacher{
//     void teach();
// }

// class TA implements Student, Teacher{
//     public void study(){
//         System.out.println("TA study maths");
//     }

//     public void teach(){
//         System.out.println("TA taught maths");
//     }
    
// }

abstract class Animal{
    Animal(){
        System.out.println("animal constructor called");
    }

}

class Horse extends Animal{
    Horse(){
        System.out.println("horse constructor called");
    }
}

class Mouse extends Horse{
    Mouse(){
        System.out.println("mouse constructor called");
    }
}

// class Person{
//     String name;
//     int age;

//     void getInfo(){
//         System.out.println("hello");
//     }
// }

// class Student extends Person{
//     int rollno;
// }

// class Student{
//     String name;
//     int rollno;
//     int marks[];    

//     Student(String name, int rollno, int marks[]){
//         this.name = name;
//         this.rollno = rollno;
//         this.marks = new int[marks.length];
//         for(int i = 0; i < marks.length; i++){
//             this.marks[i] = marks[i];
//         }
//     }

//     Student(Student s1){
//         this.name = s1.name;
//         this.rollno = s1.rollno;
//         this.marks = s1.marks;
//     }

//     Student(Student s1){
//         this.name = s1.name;
//         this.rollno = s1.rollno;
//         this.marks = new int[s1.marks.length];
//         for(int i = 0; i < marks.length; i++){
//             this.marks[i] = s1.marks[i];
//         }
//     }
// }

class Pen{
    private String color;
    private int tip;

    void setInfo(String color,int tip){
        this.color = color;
        this.tip = tip;
    }

    void getInfo(){
        System.out.println(this.color);
        System.out.println(this.tip);
    }
}

