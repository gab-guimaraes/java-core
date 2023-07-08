package org.example.array2d;

public class Array2D {
    static int[][] array3D = {
            {10, 20, 30},
            {1, 2, 3},
            {111, 222, 333}};

    public static void main(String[] args) {
        System.out.println(array3D[0][0]);
        System.out.println(array3D[0][1]);
        System.out.println(array3D[0][2]);
        System.out.println(array3D[1][0]);
        System.out.println(array3D[1][1]);
        System.out.println(array3D[1][2]);

        for (int[] ints : array3D) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }


}
