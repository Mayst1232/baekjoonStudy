package Baekjoon_10814_2023_10_18_1st;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int Num = Integer.parseInt(br.readLine());
        Register[] registers = new Register[Num];

        for(int i = 0; i < Num; i++){
            registers[i] = new Register();
            st = new StringTokenizer(br.readLine());
            registers[i].age = Integer.parseInt(st.nextToken());
            registers[i].name = st.nextToken();
        }

        Arrays.sort(registers, new Comparator<Register>() {
            @Override
            public int compare(Register o1, Register o2) {
                return o1.age - o2.age;
            }
        });

        for(int i = 0; i < Num; i++){
            bw.write(String.valueOf(registers[i].age) + " " + registers[i].name);
            bw.write("\n");
        }

        bw.close();
    }
    static class Register{
        int age;
        String name;
    }
}