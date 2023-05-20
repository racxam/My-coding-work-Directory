//write a java program to find A*B a is(3x3) and b is of (2 x 3)
import java.util.*;

//colums of A must equal to rows of B
public class thirdclass {
    public static void getArr(int arr[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter the element in pos " + i + " " + j);
                Scanner o = new Scanner(System.in);
                arr[i][j] = o.nextInt();

            }
        }

    }

    public static void printArr(int arr[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void Mul(int A[][], int B[][], int rA, int cA, int rB, int cB) {

        int MulMat[][] = new int[rA][cB];
        for (int i = 0; i < rA; i++) {
            for (int j = 0; j < cB; j++) {
                MulMat[i][j] = 0;
                for (int k = 0; k < rB; k++) {
                    MulMat[i][j] += A[i][k] * B[k][j];

                }
            }
        }
        printArr(MulMat, rA, cB);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---PROGRAM FOR MATRIX MULTIPLICATION----");
        System.out.println("WE WILL MULTIPLY MATRIX A and B");
        System.out.println("Enter Rows for A");
        int rA = sc.nextInt();
        System.out.println("Enter col for A");
        int cA = sc.nextInt();
        System.out.println("Enter Rows for B");
        int rB = sc.nextInt();
        System.out.println("Enter col for B");
        int cB = sc.nextInt();
        if (cA != rB || rA == 0 || rB == 0 || cA == 0 || cB == 0) {
            System.out.println("Invaild Multiplication!!");
        } else {

            int A[][] = new int[rA][cA];
            int B[][] = new int[rB][cB];
            System.out.println("For Matrix A 3 x 3");
            getArr(A, rA, cA);
            System.out.println("For Matrix B 2 x 3");
            getArr(B, rB, cB);

            System.out.println();
            System.out.println("Matrix A is");
            printArr(A, rA, cA);
            System.out.println();
            System.out.println("Matrix B is");
            printArr(B, rB, cB);
            System.out.println();
            System.out.println("MULTIPLICATON MATRIX IS BELOW OF " + rA + "x" + cB);
            Mul(A, B, rA, cA, rB, cB);
        }

    }
}
