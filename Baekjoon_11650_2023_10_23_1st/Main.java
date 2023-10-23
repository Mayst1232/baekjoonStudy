package Baekjoon_11650_2023_10_23_1st;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int X;
        int Y;
        List<Coordinate> CoordinateList = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            X = Integer.parseInt(st.nextToken());
            Y = Integer.parseInt(st.nextToken());
            CoordinateList.add(new Coordinate(X,Y));
        }

        Collections.sort(CoordinateList);

        for (Coordinate coordinate : CoordinateList) {
            sb.append(coordinate.XCoordinate).append(" ")
                    .append(coordinate.YCoordinate).append("\n");
        }
        System.out.println(sb);
    }
}

class Coordinate implements Comparable<Coordinate>{
    @Override
    public int compareTo(Coordinate o) {
        if (this.XCoordinate > o.XCoordinate) {
            return 1;
        } else if (this.XCoordinate < o.XCoordinate) {
            return -1;
        } else {
            if (this.YCoordinate > o.YCoordinate) {
                return 1;
            } else if (this.YCoordinate < o.YCoordinate) {
                return -1;
            }
            return 0;
        }
    }
    int XCoordinate;
    int YCoordinate;
    public Coordinate(int X, int Y){
        this.XCoordinate = X;
        this.YCoordinate = Y;
    }
}

//https://wjheo.tistory.com/entry/Java-%EC%A0%95%EB%A0%AC%EB%B0%A9%EB%B2%95-Collectionssort