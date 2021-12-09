import java.util.Scanner;

public class C_JavaStdinandStdoutII {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        scan.nextLine();
        System.out.print("");
        String s = scan.nextLine();

        scan.close();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}