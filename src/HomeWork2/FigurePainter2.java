package HomeWork2;

public class FigurePainter2 {

    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
        System.out.println();


        System.out.println("\n orinak 2");


        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");

            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();

        }
        System.out.println();


        System.out.println("\n orinak 3");


        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print(" *");

            }
            System.out.println();
        }

        System.out.println();


        System.out.println("\n orinak 4");


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");

            }

            for (int k = i; k < 4; k++) {
                System.out.print("* ");

            }
            System.out.println();
        }


        System.out.println();


        System.out.println("\norinak 5");

        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");

            }
            for (int k = 0; k <= i; k++) {
                System.out.print("  * ");

            }
            System.out.println();

        }
        for (int i = 3; i <0; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("  ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print(" *");
            }
        }System.out.println();
    }
}


