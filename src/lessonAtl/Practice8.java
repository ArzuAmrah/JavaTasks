package lessonAtl;

public class Practice8 {
    public static void main(String[] args) {

//        for (int i = 7; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for  (int i = 0; i < 10; i++){
//            for (int j = 1; j < 10; j++){
//                System.out.println( " * ");
//            }
//        }


        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
