package HomeWork2;

public class Ternary {

    public static void main(String[] args) {

        int i, j;

        i = 10;
        j = i < 0 ? -i : i;

        System.out.print("Aбcoлютнoe значение");
        System.out.println(i + " равно " + j);

        i = -10;
        j = i < 0 ? -i : i;

        System.out.print("Aбcoлютнoe значение ");
        System.out.println(i + " равно "+j);


    }
}
