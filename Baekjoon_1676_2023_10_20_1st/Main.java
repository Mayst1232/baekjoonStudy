package Baekjoon_1676_2023_10_20_1st;

import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Factorial factorial =  new Factorial();

        int InsertNumber = Integer.parseInt(br.readLine());
        String[] result = String.valueOf(factorial.Facto(InsertNumber)).split("");
        int count = 0;

        for(int i = result.length-1; i >= 0; i--){
            if(Integer.parseInt(result[i]) == 0){
                count++;
            }
            else{
                break;
            }
        }
        bw.write(String.valueOf(count));
        bw.close();
    }
}

class Factorial{
    public BigInteger Facto(int num){
        if(num > 1){
            return Facto(num-1).multiply(new BigInteger(String.valueOf(num)));
        }
        return BigInteger.ONE; // 1
    }
}