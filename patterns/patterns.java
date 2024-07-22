package patterns;

public class patterns {

    public static void main(String[] args) {
        square(4);
        System.out.println("1 ==================");
        rightAngle1(5);
        System.out.println("2 ==================");
        rightAngle2(5);
        System.out.println("3 ==================");
        pyramid(5);
        System.out.println("4 ==================");
        pattern(5);
        System.out.println("5 ==================");
        numberPyramid(5);
        System.out.println("6 ==================");
        square2(5);
        System.out.println("7 ==================");
        numberPyramid2(5);
        System.out.println("8 ==================");
        pattern3(4);
        System.out.println("9 ==================");
        pyramid3(5);
        System.out.println("9 ==================");

    }
    public static void square(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rightAngle1(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rightAngle2(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pyramid(int n){
        for(int row=1;row<=n;row++){
            for(int space =1;space<=n-row;space++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern(int n){

        for(int row =1;row<=2*n;row++){
            int num = row > n ? (2*n -row) : row;

            for(int col=1;col<=num;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void numberPyramid(int n){

        for(int row =1;row<=n;row++){

            for(int space=1;space<=n-row;space++) {
                System.out.print("  ");
            }
                for(int col=row;col>=1;col--){
                    System.out.print(col+" ");
                }
              for(int col=2;col<=row;col++){
                   System.out.print(col+" ");
               }
                System.out.println();
            }
        }

    public static void square2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col == 1 || col == n || row == 1 || row == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void numberPyramid2(int n){

        for(int row =1;row<=2*n;row++){

            int num = row > n ? (2*n -row) : row;

            for(int space=1;space<=n-num;space++) {
                System.out.print("  ");
            }
            for(int col=num;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=num;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        int originalN = n;
        n = 2 * n -1 ;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row-1, n - col-1));
                System.out.print( atEveryIndex + " " );
            }
            System.out.println();
        }
    }

    static void pyramid3 (int n){

        for(int row=0;row<=n;row++){
            for(int space=1;space<=n-row;space++){
                System.out.print("  ");
            }
                for(int col=1;col<=2*row-1;col++){
                    System.out.print("* ");
                }
            System.out.println();
        }
    }



}
