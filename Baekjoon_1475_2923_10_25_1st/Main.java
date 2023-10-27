package Baekjoon_1475_2923_10_25_1st;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputNumber = br.readLine();
        int[] checkNumber = new int[10];
        String[] checkInputNumber = inputNumber.split("");
        int result = checkNumber[0];

        for(int i = 0; i < checkInputNumber.length; i++){
            if(checkInputNumber[i].equals("9")){
                checkInputNumber[i] = "6";
            }
        }

        for(int i = 0; i < checkInputNumber.length; i++){
            for(int j = 0; j < checkNumber.length; j++){
                if(j == Integer.parseInt(checkInputNumber[i])){
                    checkNumber[j]++;
                }
            }
        }

        if(checkNumber[6] % 2 == 0){
            checkNumber[6] /= 2;
        }
        else{
            checkNumber[6] = checkNumber[6] / 2 + 1;
        }

        for(int i = 0; i < checkNumber.length; i++){
            if(checkNumber[i] > result){
                result = checkNumber[i];
            }
        }

        bw.write(String.valueOf(result));
        bw.close();
    }
}
