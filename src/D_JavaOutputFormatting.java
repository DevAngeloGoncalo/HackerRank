import java.util.Scanner;

public class D_JavaOutputFormatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                
                String padded = String.format("%03d", x);

                while (s1.length() != 14){
                    s1 = s1 + " ";      
                }
                
                System.out.println(s1 + " " + padded);
            }
            sc.close();
            System.out.println("================================");

    }
}