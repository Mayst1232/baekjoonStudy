package Baekjoon_13241_2023_10_19_2nd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        int i = 2;
        long result = 1;

        while(A > i || B > i){
            if(A % i == 0 && B % i == 0){
                A = A/i;
                B = B/i;
                result = result * i;
            }
            else {
                i++;
            }
        }

        if(A != 1 || B != 1){
            result = result*A*B;
        }

        if(result == 1){
            result = A*B;
        }

        sb.append(result);
        System.out.println(sb);  // 유클리드
    }
}
