package com.example.tinkof;

import java.util.Scanner;

public class TaskSixth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] players = new int[n];
        for (int i = 0; i < n; i++) {
            players[i] = scanner.nextInt();
        }
        for (int index : findIndexes(players)) {
            System.out.println(index);
        }
    }
    private static int[] findIndexes(int[] players) {
        int[] pair = {-1, -1};
        int firstIndex = -1;
        int secondIndex = -1;
        int countWrongPositions = 0;
        for (int i = 0; i < players.length; i++) {
            if ((players[i] + i) % 2 == 0) {
                countWrongPositions++;
                if (firstIndex == -1) {
                    firstIndex = i;
                } else if (secondIndex == -1) {
                    secondIndex = i;
                }
            }
        }
        if (countWrongPositions == 2 && (players[firstIndex] + players[secondIndex]) % 2 != 0) {
            pair[0] = ++firstIndex;
            pair[1] = ++secondIndex;
        }
        return pair;
    }
}


