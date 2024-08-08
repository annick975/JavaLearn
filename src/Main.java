import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How old are you?");
       String age =  scanner.next();
       System.out.println("I 'm " +age +" Years old!");

       String result = NumberFormat.getPercentInstance().format(5.6);
       System.out.println(result);
    }

}


