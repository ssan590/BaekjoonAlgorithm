/**
 * 1. 입력의 크기 n을 받는다.
 * 2. n을 7이라 가정하면 첫번째 for문 i는 1~6까지 반복
 * 3. 두번째 for문에서는 j는
 *  3-1. i가 1일경우 2~7까지 sum은 6번
 *  3-2. i가 2일경우 3~7까지 sum은 5번
 *  3-3. i가 3일경우 4~7까지 sum은 4번...
 *  3-4. i가 6일경우 j는 7이므로 sum은 1번
 * 4. 3번의 예시를 보고 연속하는 sum의 횟수가 같은 차이가 있는걸 알 수 있으므로 등차수열이다.
 * 5. 1 ~ n까지 합을 구하는 공식은 n(n+1)/2
 * 6. 문제는 n일 경우 1 ~ (n-1)까지 합을 구하는 공식이므로 (n-1)((n-1)+1)/2 로 변환
 * 7. 6번의 최종식은 n(n-1)/2로 변환 가능
 * 8. 최고차항은 차수(문자가 곱해진 횟수)가 제일 높은 항(숫자나 문자의 곱으로 이루어진 식) 을 뜻하므로 최종식을 풀어서 쓰면
 *   (n^2-n)/2 이므로 n^2가 최고차항으로 최고차항의 차수는 2가 된다.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너 클래스를 사용하여 입력 값 받음
        long n = sc.nextInt();

        System.out.println((n * (n - 1))/2);
        System.out.println(2);
    }
}