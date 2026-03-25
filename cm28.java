import java.util.Scanner;

public class cm28{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] m = new int[3][3];

        System.out.println("Enter 9 elements for a 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = s.nextInt();
            }
        }

       

        int a = m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1]);
        int b = m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0]);
        int c = m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);

        int det = a - b + c;

        System.out.println("The Determinant is: " + det);

    }}