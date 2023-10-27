package Baekjoon_1316_2023_10_26_1st;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {


        int inputNumber = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 0; i < inputNumber; i++){
            if(check() == true){
                count++;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }

    public static boolean check() throws IOException {
        boolean[] check = new boolean[26];
        int prevLetter = 0;
        String checkWords = br.readLine();

        for(int i = 0; i < checkWords.length(); i++){
            int nowLetter = checkWords.charAt(i);

            if(prevLetter != nowLetter){
                if(check[nowLetter - 'a'] == false){
                    check[nowLetter - 'a'] = true;
                    prevLetter = nowLetter;
                }
                else{
                    return false;
                }
            }
            else{
                continue;
            }
        }
        return true;
    }
}
