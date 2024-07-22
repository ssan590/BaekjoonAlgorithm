
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // 여러 입력을 받기 위해 BufferedReader 클래스 사용, 띄어쓰기 기준으로 문자열 분리를 위해 StringTokenizer 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 가지고 있는 카드 갯수
        int[] cards = new int[N]; // 입력받을 가지고 있는 카드들의 숫자

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards); //카드 숫자를 오름차순으로 정렬

        // 확인할 카드의 갯수를 받아온다
        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < M; j++) {
            int target = Integer.parseInt(st.nextToken()); //갯수를 확인할 특정 카드의 숫자

            // upperBound와 lowerBound의 차이 값을 구한다.
            sb.append(upperBound(cards, target) - lowerBound(cards, target)).append(' ');
        }
        System.out.println(sb);
        
    }
    private static int lowerBound(int[] cards, int key) {
        int lo = 0;
        int hi = cards.length;

        // lo가 hi랑 같아질 때 까지 반복
        while (lo < hi) {

            int mid = (lo + hi) / 2; // 중간위치를 구한다.

            /*
             *  key 값이 중간 위치의 값보다 작거나 같을 경우
             *
             *  (중복 원소에 대해 왼쪽으로 탐색하도록 상계를 내린다.)
             */
            if (key <= cards[mid]) {
                hi = mid;
            }

            else {
                lo = mid + 1;
            }

        }

        return lo;
    }

    private static int upperBound(int[] cards, int key) {
        int lo = 0;
        int hi = cards.length;

        // lo가 hi랑 같아질 때 까지 반복
        while (lo < hi) {

            int mid = (lo + hi) / 2; // 중간위치를 구한다.

            // key값이 중간 위치의 값보다 작을 경우
            if (key < cards[mid]) {
                hi = mid;
            }
            // 중복원소의 경우 else에서 처리된다.
            else {
                lo = mid + 1;
            }

        }

        return lo;
    }
}
