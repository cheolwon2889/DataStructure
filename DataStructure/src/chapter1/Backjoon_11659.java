package chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon_11659 {
    // 구간 합 구하기.
    // 수 n개가 주어졌을 때 i 번째 수에서 j 번째 수까지의 합을 구하는 프로그램을 작성하시오.

    // 입력
    // 1번째 줄에 수의 개수 N(1 <= N <= 100,000) 합을 구해야 하는 횟수 M(1<= M <= 100,000) 2번째
    // 줄에 N개의 수가 주어진다. 각 수는 1,000보다 작거나 같은 자연수다. 3번째 줄부터는 M의 줄에 합을
    // 구해야 하는 구가 i와 j가 주어진다.

    // 출력
    // 총 M개의 줄에 입력으로 주어진 i 번째 수에서 j 번째 수까지의 합을 출력한다.

    // 예시 입력
    // 5 3
    // 5 4 3 2 1
    // 1 3
    // 2 4
    // 5 5

    // 예시 출력
    // 12
    // 9
    // 1

    public static void main(String[] args) throws IOException {
        // 스캐너 보다 빠른 입출력을 받는 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받기
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        // 데이터의 개수 , 질의 개수 저장.
        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        // 합배열 생성.
        long[] S = new long[suNo + 1];
        
        // 위에서 선언을  했으니 배열에 새로운 입력값으로 초기화.
        stringTokenizer = new StringTokenizer(br.readLine());

        // 바로바로 계산을 해서 합배열에 저장, 위에서 배열의 0부터 담는게 아니라. 1부터 담을 예정.
        // 위에서 데이터의 개수 값의 1 더해서 배열의 크기를 늘림.
        for (int i = 1; i <= suNo; i++) {
            S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        // 질의 입력 받기.
        for (int q = 0; q < quizNo; q++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i-1]);
        }

    }
}
