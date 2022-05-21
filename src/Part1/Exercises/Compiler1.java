package Part1.Exercises;

public class Compiler1 {
    public static void main(String[] args) {
        int x = 1;
        while (x < 10){
            if (x > 3){
                System.out.println("Большой Х");
            }
                x = x + 1;  // добавил строку со счетчиком
        }
    }
}
