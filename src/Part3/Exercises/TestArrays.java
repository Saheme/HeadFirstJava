package Part3.Exercises;

public class TestArrays {
    public static void main(String[] args) {
        int y = 0;
        int[] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        while (y < 4){
        int ref;
            ref = index[y];
            System.out.print("Острова = ");

        String[] island = new String[4];
        island[0] = "Бермуды";
        island[1] = "Фиджи";
        island[2] = "Азорские острова";
        island[3] = "Косумель";
            System.out.println(island[ref]);
        y= y+ 1;
        }
    }
}
