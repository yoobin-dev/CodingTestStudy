import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int totalCount = Integer.parseInt(st.nextToken());
        int repeatCount = Integer.parseInt(st.nextToken());
        long[] S = new long[totalCount + 1];
        S[0] = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i < totalCount + 1; i++){
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < repeatCount; i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            System.out.println(S[m] - S[n-1]);
        }
    }
}