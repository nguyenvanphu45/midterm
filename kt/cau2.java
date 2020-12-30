package kt;

import java.util.Scanner;

public class cau2 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = sc.nextInt();

        int[] A = new int[n];

        //Nhap gia tri trong mang
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + ": ");
            A[i] = sc.nextInt();
        }

        //Hien thi mang
        System.out.println("Mang vua nhap: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }
        System.out.println("\n");

        //Gia tri lon nhat trong mang
        int max = A[0];
        for (int i = 0; i < n; i++) {
            if (max < A[i]){
                max = A[i];
            }
        }
        System.out.println("Gia tri lon nhat la: " + max);

        //Kiem tra X co ton tai trong mang
//        int X, i;
//        System.out.println("Nhap X: ");
//        X = sc.nextInt();
//        for (i = 0; i < n; i++) {
//            if (A[i] == X) {
//                System.out.println(X + " co ton tai trong mang.");
//                break;
//            }
//        }
//        if(X == n){
//            System.out.println(X + " khong ton tai trong mang.");
//            break;
//        }

        //dem so chan
        int dem = 0;
        for (int i = 1; i < n; i++) {
            if(A[i] % 2 == 0){
                dem++;
            }
        }
        System.out.println("Gia tri chan trong mang: " + dem);

        //Tach gia tri chan
        int j = 0;
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            B[j] = A[i];
            j++;
        }
        System.out.println("So chan cua mang gom: ");
        for (int i = 0; i < j; i++) {
            if (B[i] % 2 == 0){
                System.out.print(B[i] + "\t");
            }
        }
    }
}
