package kt;

import java.util.Scanner;

public class cau1 {
    public static void main(String[] args){
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x lon hon 3: ");
        x = sc.nextInt();
        System.out.println("Nhap Y lon hon 3: ");
        y = sc.nextInt();

        //Hien thi gia tri
        System.out.println("Gia tri vua nhap x = " + x + ", y = " + y);

        //Hoan vi
        int z = x;
        x = y;
        y = z;
        System.out.println("Gia tri sau khi hoan vi x = " + x + ", y = " + y);
    }
}
