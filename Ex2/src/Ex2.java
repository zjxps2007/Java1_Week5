import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int x, y, r;
        Scanner scan = new Scanner(System.in);
        System.out.print("두 개의 정수를 입력하시오(큰수, 작은수): ");
        x = scan.nextInt();
        y = scan.nextInt();

        while (y !=0) {
            r = x%y;
            x = y;
            y = r;
        }
        System.out.println("최대공약수는 "+x);
    }
}
