import java.util.Scanner;
public class MinHelp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int n = 0;
        int i=0,j=0;
        while(n<A) {
            if(i%2 == 0) {
                n += 1;
                j++;
            } else {
                n *= 2;
            }
            i++;
        }
        System.out.println(j);
    }
}