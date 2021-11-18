public class homeWork_2 {
    public static void main(String[] args) {
        System.out.println(sum_10_20(5,3));
        chetnost(5);
        System.out.println(znakChisla(-3));
        umnozhenieStrok("pipka", 3);
        System.out.println(visokosnost(100));
    }

    public static boolean sum_10_20(int a, int b){
        return a + b >= 10 && a + b <= 20;
    }

    public static void chetnost(int a){
        if (a % 2 == 0){
            System.out.println("Четное");
        }
        else {
            System.out.println("Нечетное");
        }
    }

    public static boolean znakChisla(int a){
        return a < 0;
    }

    public static void umnozhenieStrok(String stroka, int a){
        for (int i = 0; i < a; i++){
            System.out.println(stroka);
        }
    }

    public static boolean visokosnost(int a){
        return ((a % 4) == 0 && a % 100 != 0) || (a % 400 == 0);
    }

}
