package Day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10869 {
    // 사칙연산
    // 두 자연수 A 와 B가 주어진다 . 이때 A + B , A - B ,A*B, A/B, A%B를
    // 출력하는 프로그램을 작성하시오

    // 입력
    // 두 자연수 A와 B가 주어진다.

    // 출력
    // 첫번째 줄에 A+B, 두번째 줄에 A - B, 세번째 줄에 A*B, 네번쨰 줄에 A/B, 다섯번째 줄에 A%B를 출력한다.




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(str.nextToken());
        int b = Integer.parseInt(str.nextToken());

        System.out.println( a + b );
        System.out.println( a - b );
        System.out.println( a * b );
        System.out.println( a / b );
        System.out.println( a % b );



    }
}
