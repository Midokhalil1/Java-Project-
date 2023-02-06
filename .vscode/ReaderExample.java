import java.util.Scanner;

public class ReaderExample {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        String name;
        byte age;



        System.out.println("Enter your name");
        name = reader.nextLine();
        System.out.println("Enter your age");
        age = reader.nextByte();

        if( age <= 0 || name == ""){
            System.out.println(" Your age or name is invalid !!! ");
        }else{
            System.out.println("Hello "  +  name +  "your age is :  " + age);
        
        }
        
        if(age >= 1 && age < 13){
            System.out.println(" you are a chiled! ");
        
        }else if (age >= 13 && age < 18){
            System.out.println(" You are Young! ");
        
        
        }else if (age >= 18){
            System.out.println(" You're adult");
        }
    }
}
