import java.util.Scanner;

/**
 * 조합문제 참고 https://velog.io/@xcv3549/%ED%99%95%EB%A5%A0%EA%B3%BC-%ED%86%B5%EA%B3%84-%EC%88%9C%EC%97%B4%EC%A1%B0%ED%95%A9
 * 1. nCr = 서로 다른 n개의 원소에서 r개를 중복 없고 순서와 상관 없이 선택하는 경우의 수
 * 2. 예시는 1부터 7(n)까지 숫자 중 종복 없이 i,j,k(r)를 선택하는 경우의 수를 구하는 것
 * 3. 시간복잡도는 O^3
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너 클래스를 사용하여 입력 값 받음
        long n = sc.nextInt();

        System.out.println(((n * (n - 1) * (n -2)))/6);
        System.out.println(3);
    }
}
