public class Hw3 {
    public static void main(String[] args) {
        //반복을 위한 변수 선언
        int i = 2;
        int j = 1;
        //9단까지 반복
        while (i <=9) {
            //1부터 9까지 곱
            while (j<=9) {
                //연산 및 출력
                System.out.println(i+"X"+j+"="+i*j);
                //i증가
                j++;
            }
            //j을 0으로 초기화
            j = 1;
            //i증가
            i++;
            //단이 끝나면 한줄 띄움
            System.out.println();
        }
    }

}
