public class Program {
    //    И ещё можете попрактиковаться и нарисовать оставшиеся 2 треугольника
//    *
//    * * (1)
//    * * *
//    * * * *
//
//    * * * *
//    * * * (2)
//    * *
//    *
    public static void main(String[] args) {
        triangle1:
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.println("");
                    continue triangle1;
                }
            }
        }

        System.out.println("");
        System.out.println("");

        triangle2:
        for (int a = 5; a >= 1; a--) {
            for (int b = 1; b <= 5; b++) {
                if (b < a) {
                    System.out.print("*");
                } else if (b == a) {
                    System.out.println("*");
                } else {
                    continue triangle2;
                }
            }
        }
    }
}



