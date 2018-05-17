package com.company;

public class Main {

    public static void main(String[] args) {
	// cho mảng 2 chiều 3 dòng 3 cột (int arr[][] = {{1,2,5},{3,9,8},{4,8,7}};) hãy xuất ra màn hình 3 dòng 3 cột đó.
        int arr[][] = {{1,2,5},{3,9,8},{4,8,7}};
        for (int row = 0 ; row < arr.length; row++){
            for (int col = 0 ; col < arr.length; col++) {
                System.out.println(arr[col][row] + "");
            }
            System.out.println();
        }

    }
}
