package HomeWork;

public class AutoArray {

    public static void main(String[] args) {


//        char[] names = {'a', 'm', 'a', 'l'};
//        int count = 0;
//        for (int i = 0; i < names.length; i++) {
//            char c = names[i];
//            if (c == 'a') {
//                count++;
//            }
//        }System.out.println(count);


//        char[] names = {'a', 'm', 'a', 'l'};
//
//        if (names[names.length-2]=='l' && names[names.length-1]=='y') {
//            System.out.println(true);
//
//        }else
//            System.out.println(false);


        char[] names = {'a', 'm', 'a', 'l',};

        for (int i = 0; i < names.length; i++) {
            if (names[i] == 'a' && names[i + 2] == 'a') {
                System.out.println(true);

            }

        }


//        char[] names = {'a', 'm', 'a', 'l',};
//        System.out.println(names[names.length / 2]);
//        System.out.println(names[names.length / 2 -1]);


    }
}

