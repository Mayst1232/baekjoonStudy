package Baekjoon_1427_2023_10_18_2nd;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String Input = br.readLine();

        String[] arrInput = Input.split("");

        Integer[] number = new Integer[Input.length()];

        for(int i = 0; i < Input.length(); i++){
            number[i] = Integer.parseInt(arrInput[i]);
        }

        Arrays.sort(number,Collections.reverseOrder());

        for(int i = 0; i < number.length; i++){
            bw.write(String.valueOf(number[i]));
        }

        bw.close();
    }
}
