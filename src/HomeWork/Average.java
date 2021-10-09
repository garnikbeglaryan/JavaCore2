package HomeWork;

public class Average {

    public static void main(String[] args) {



            for (int i = 0; i <4; i++) {
                for (int j =1; j <= 4 - i; j++) {
                    System.out.print(" " + "*");
                }
                System.out.println();
                for (int k = 3; k <= 3 + i; k++) {
                    System.out.print(" ");
                }
            }System.out.println();

    }
}
