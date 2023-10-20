package Baekjoon_11004_2023_10_19_1st;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N;
        int K;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int A[] = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A); // Collection.sort가 더 빠르다
                        // Quick sort (알고리즘)

        bw.write(String.valueOf(A[K-1]));
        bw.close();
    }
}
