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

        if( age == 0){
            System.out.println(" Your age is invlid !!! ");
        }

        System.out.println("Hello "  +  name +  "your age is :  " + age);
    }
}
