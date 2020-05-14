import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print( "Please enter a string : " );

        while (sc.hasNext()){
            System.out.println( "Your input is :" + sc.next());
        }

    }

}
