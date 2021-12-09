import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class H_JavaEndOfFile {

    public static void main(String[] args) {
        
        Scanner scan =new Scanner(System.in);

        int i = 1;

        while (scan.hasNextLine()){
            String s = scan.nextLine();
            System.out.println(i + " " + s);
            i++;
        } 
    }
}