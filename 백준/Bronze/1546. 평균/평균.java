import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        int M = 0;
        long sum = 0;
        for(int i = 0; i < N; i++){
            if(A[i] > M) M = A[i];
            sum += A[i];
        }
        
        System.out.print(sum * 100.0 / M / N);
    }
}