package Day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1008 {
    // 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
    
    // 입력
    // 첫번째 줄에 A와 B가 주어진다.
    
    // 출력
    // 첫번째 줄에 A/b를 출력한다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(str.nextToken());
        int b = Integer.parseInt(str.nextToken());

        System.out.println((double) a/b);



    }
}
