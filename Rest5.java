import java.util.Scanner;

public class Rest5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("set q");
        int q = scanner.nextInt();
        System.out.println("set w");
        int w = scanner.nextInt();
        int d = q/w;
        System.out.println("integer:" + d);
        int c = q%w;
        if (q>w){
        System.out.println("residue:" + c);}
        else {
          System.out.println("no integer part q<w");
        }
    }

}
