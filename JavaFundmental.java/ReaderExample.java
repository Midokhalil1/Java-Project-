import java.util.Scanner;

public class ReaderExample {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        String name;
        int age;

        System.out.println("Enter your name");
        name = reader.nextLine();

        do {
        System.out.println("Enter your age");
        age = reader.nextInt();
        }while( age <= 0 || age >= 160)


            

        if( age <= 0 || name == "" || age > 160){
            System.out.println(" Your age or name is invalid !!! ");
        
        }
        
        
        else{
            System.out.println(" Hello "  +name+    " your age is :  " + age);
        
        }
        
        if(age >= 1 && age < 13){
            System.out.println(" you are a chiled! ");
        
        }else if (age >= 13 && age < 18){
            System.out.println(" You are Young! ");
        
        
        }else if (age >= 18){
            System.out.println(" You're adult");
        }

        int sum = 0;
        for( int index = 1; index <= age; index++){
            sum = sum + index;
        }
        System.out.println("Sum is : " + sum);
    }
}
