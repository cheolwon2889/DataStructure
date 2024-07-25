package chapter1;

import java.util.Scanner;

public class Backjoon_2018 {
    // 투 포인터

    // 투 포인터는 2개의 포인터로 알고리즘의 시간 복잡도를 최적화합니다.

    // 연속된 자리수의 합 구하기.

    // 어떠한 자연수 N은 몇 개의 연속된 자연수의 합으로 나타낼 수 있다.
    // 당신은 어떤 자연수 N(1 <= N <= 10,000,000) 을 몇 개의 연속된 자연수의 합으로 나타내는 가짓수를 알고 싶다.
    // 이때 사용한는 자연수는 N이어야 한다. 예를 들어 15를 나타내는 방법은 15, 7+8 , 4+5+6 , 1+2+3+4+5+이다.
    // 반면, 10을 나타내는 방법은 10, 1+ 2 + 3+ 4 이다.
    // N을 입력받아 연속된 자연수의 합으로 나타내는 가짓수를 출력하는 프로그램을 작성하시오.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력값.
        int N = sc.nextInt();
        // 시작 포인트
        int startIndex = 1;
        // 마지막 포인트
        int endIndex =1;
        // 총합
        int sum = 1;
        // 횟수 1로 한 이유는 1, N-1 도 있기때문.
        int count = 1;

        // 마지막 포인트가 N이랑 같아지면 종료
        while (endIndex != N) {
            // 총합이 같으면
            // 마지막 포인트 인덱스 값, count 올리고
            // 총합에 올린 마지막 포인트 값을 더한다.
            if (sum == N) {
                endIndex++;
                count++;
                sum = sum + endIndex;
            } else if (sum > N) {
                // 총합이 더 크면
                // 총합에서 시작 인덱스 값을 빼준다.
                sum = sum - startIndex;
                // 그리고  인덱스의 값을 올린다.
                startIndex++;
            }else  {
                // 총합이 N보다 낮으면
                // 마지막 포인트의 인덱스 값을 올리고.
                // 총합에 올린 마지막 포인트 값을 더한다.
                endIndex++; sum = sum + endIndex;
            }
        }
        System.out.println(count);
    }
}

