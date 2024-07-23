package chapter1;

import java.util.Scanner;

public class Backjoon_1546 {
    // 평균 구하기.
    // 세준이는 기말고사를 망쳤다. 그래서 점수를 조작해 집에 가져가기로 결심했다.
    // 일단 세준이는 자기 점수중 최댓값을 골랐다. 그런 다음 최댓값을 M이라 할 때
    // 모든 점수를 점수 / M * 100으로 고쳤다. 예를 들어 세준이의 최고점이 70점
    // 수학 점수가 50점이라면 수학점수는 50/70*100이므로 71.43점이다. 세준이의 성적을
    // 이 방법으로 계산했을 때 새로운 평균을 구하는 프로그램을 작성하시오.

    // 입력
    // 1번째 줄에 시럼을 본 과목의 개수 N이 주어진다. 해당 값은 1,000 보다 작거나 같다.
    // 2번째 줄에 세준이의 현재 성적이 주어진다. 해당 값은 100보다 작거나 같은, 음이 아닌 정수이고,
    // 1개의 값은 0 보다 크다.

    // 출력
    // 1번째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대 오차 또는 상대 오차가 10-² 이하이면 정답이다.


    public static void main(String[] args) {
        // 스캐너 라이브러리
        Scanner sc = new Scanner(System.in);
        // N개의 숫자 입력받기
        int N = sc.nextInt();
        // N개의 배열 만들기.
        long sum = 0;
        // 최고점을 담을 max 변수 생성.
        long max = 0;

        // n번 입력받고 sum에 값을 더하고 최고점 구하는 for문
        for (int i =0; i<N;i++) {
            int temp = sc.nextInt();
            sum += temp;
            if (temp > max) {
                max = temp;
            }
        }
        // 출력 int로 출력을 하게 되면 소수점 밑으로 없어지니 double형 타입으로 출력
        System.out.println((double) sum*100 / max / N);
    }
}
