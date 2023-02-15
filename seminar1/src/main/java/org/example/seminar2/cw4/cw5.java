package org.example.seminar2.cw4;

public class cw5 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(12, 9, 4);
        Vector vector2 = new Vector(11, 2, 3);

        System.out.println(vector1.toString());
        System.out.println(vector2.toString());
        System.out.println("length = "+vector1.length());
        System.out.println("scal = "+vector1.scal(vector2));
        System.out.println(vector1.diffVec(vector1));
    }

}
