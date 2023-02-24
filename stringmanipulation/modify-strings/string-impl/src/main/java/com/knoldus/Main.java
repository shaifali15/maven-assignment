import java.util.Scanner;
//main class file to handle user operation
public class Main {
    public static void main(String[] args){
        StringManipulation object=new StringManipulation();
        String InitialString = "";
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the string to be reversed: ");
        InitialString=scan.nextLine();
        System.out.println("Length Of the string: ");
        System.out.println(object.getStringLength(InitialString));
        System.out.println("Reversed string: ");
        System.out.println(object.reverseString(InitialString));


    }
}
