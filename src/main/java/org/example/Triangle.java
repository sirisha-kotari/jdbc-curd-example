package org.example;

public class Triangle {
    public void leftTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void rightTriangle(int n) {

        for (int i = 1; i <= n; i++){
            for (int j=i;j<n;j++){
                System.out.print(" ");
            }
           for (int j=1;j<=i;j++){
                 System.out.print("*");
            }

            System.out.println();
        }
    }
    public void triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for(int j=1;j<i;j++) {
                System.out.print("* ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();

            }

        }

    public static void main(String[] args){

Triangle t=new Triangle();
//t.triangle(5);
//t.leftTriangle(5);
        t.rightTriangle(5);
    }
}
