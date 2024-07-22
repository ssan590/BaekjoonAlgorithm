import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

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
            int target = Integer.parseInt(st.nextToken()); //확인할 특정 카드의 숫자

            // 해당 숫자가 확인할 카드에 있는지 체크
            sb.append(searchNum(cards, target, (N -1))).append(' ');
        }
        System.out.println(sb);

    }

    private static int searchNum(int[] cards, int target, int length) {
        int left = 0 ;
        int right = length;

        while (left <= right) {
            int middle = (left + right) / 2;
            int midNum = cards[middle];

            if (target < midNum) {
                right = middle - 1;
            } else if (target > midNum) {
                left = middle + 1;
            } else {
                return  1;
            }
        }
        return 0;
    }
}
