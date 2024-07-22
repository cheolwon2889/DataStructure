import java.util.Scanner;

public class Baekjoon_11720 {
    public static void main(String[] args) {
        // N개의 숫자가 공백 없이 써 있다.
        // 이 숫자를 모두 합해 출력하는 프로그램을 작성하시오.
        // 입력
        // 1번째 줄에 숫자의 개수 N(1<= N <= 100), 2번째 줄에 N개가 공백 없이 주어진다.

        // 출력
        // 입력으로 주어진 숫자 N개의 합을 출력한다.
        // 예제 입력 1
        // 1 // 숫자의 개수
        // 1 // 공백 없이 주어진 N개의 숫자
        // 예제 출력 2
        // 1

        // 예제 입력 2
        // 5
        // 54321
        // 예제 출력 2
        // 15

        // 문제 분석하기
        // N의 범위가 1부터 100까지 이므로 값을 int형, long형과 같은 숫자형으로 담을 수 없다.
        // 먼저 문자열 형태로 입력값을 받은 후 이를 문자 배열로 변환하고, 문자 배열값을 순서대로
        // 읽으면서 숫자형으로 변환하여 더해야 합니다. 예를 들어 입력값을 "1234" 와 같이 문자열로
        // 입력받은 후 이를 다시 '1' '2' '3' '4' 와 같이
        // 문자 배열로 변환하고. 다시 문자 배열을 1,2,3,4로 변환한 다음 더해 10을 구한다.

        Scanner sc = new Scanner(System.in);
        // N개를 입력받는다.
        int n = sc.nextInt();
        // 입력 받은 숫자를 String으로 담는다.
        String sNum = sc.next();
        // toCharArray()를 이용해서 cNum 배열에 담는다.
        char[] cNum = sNum.toCharArray();
        // 총합 변수 선언
        int sum = 0;
        // foreach를 사용해서 값을 담는다.
        for (char c : cNum) {
            // - '0'을 하거나. -48을 해서 char를 해서 아스키코드를 정수로 변환 시킨다.
            sum += c-'0';
        }

        // 결과 출력.
        System.out.println(sum);




    }
}
