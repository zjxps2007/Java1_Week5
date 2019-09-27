import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {
        //변수 선언
        Double sum=0.0,num1;
        int num,i=1;

        Scanner sc = new Scanner(System.in);

        //학생수 입력받음
        System.out.print("학생 수를 입력하세요: ");
        num = sc.nextInt();

        //입력받은 학생수 만큼 반복
        while (i<=num) {
            System.out.print(i+" 번쨰 학생의 성적:");
            num1 = sc.nextDouble();
            //총합을 구함
            sum +=num1;
            //i를 증가시킴
            i++;
        }
        //평균계산 빛 출력
        System.out.println("평균: "+ sum/num);

    }
}
