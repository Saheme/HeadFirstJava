package Part1;

public class Loopy2 {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("перед началом цикла");
        while (x < 4){
            System.out.println("внутри цикла");
            System.out.println("Значение x = " +  x);
            x = x+1;
        }
        System.out.println("после окончания цикла");
    }
}
