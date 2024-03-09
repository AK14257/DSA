
import java.util.*;

public class pattern4{
    public static void main(String[] args) {
        int n;
        char ch='A';
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of lines");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
    
}
