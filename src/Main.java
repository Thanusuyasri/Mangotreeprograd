import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int row=scanner.nextInt();
        int col=scanner.nextInt();
        int treenumber= scanner.nextInt();
        if(treenumber<=col || treenumber%col==0 || treenumber%col==1)
        {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}