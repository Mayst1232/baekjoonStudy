package Baekjoon_1018_2023_10_20_2nd;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[][] ChessBoard = new String[N][M];

        int count = 0;
        int result = Integer.MAX_VALUE;

        ArrayList<Integer> countList = new ArrayList<>();

        for(int i = 0; i < N; i++){
            String[] Input = br.readLine().split("");
            for(int j = 0 ; j < M; j++){
                ChessBoard[i][j] = Input[j];
            }
        }

        String check1[] = { "WBWBWBWB", "BWBWBWBW", "WBWBWBWB",
                "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB",
                "BWBWBWBW"};
        String check2[] = { "BWBWBWBW", "WBWBWBWB", "BWBWBWBW",
                "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW",
                "WBWBWBWB"};

        String[][] checkList1 = new String[8][8];
        String[][] checkList2 = new String[8][8];
        for(int i = 0; i < 8; i++){
            String[] checkList1Element = check1[i].split("");
            String[] checkList2Element = check2[i].split("");
            for(int j = 0; j < 8; j++){
                checkList1[i][j] = checkList1Element[j];
                checkList2[i][j] = checkList2Element[j];
            }
        }

        for(int i = 0; i < N - 7; i++){
            for(int j = 0; j < M - 7; j++){

                for(int k = 0; k < 8; k++){
                    for(int l = 0; l < 8; l++) {
                        if (!(ChessBoard[k + i][l + j].equals(checkList1[k][l]))) {
                            count++;
                        }
                    }
                }
                countList.add(count);
                count = 0;

                for(int k = 0; k < 8; k++){
                    for(int l = 0; l < 8; l++) {
                        if (!(ChessBoard[k + i][l + j].equals(checkList2[k][l]))) {
                            count++;
                        }
                    }
                }
                countList.add(count);
                count = 0;
            }
        }

        for(int i = 0; i < countList.size(); i++){
            if(result > countList.get(i)){
                result = countList.get(i);
            }
        }
        bw.write(String.valueOf(result));
        bw.close();
    }
}
