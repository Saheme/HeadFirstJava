package Part1;

public class BeerSong5 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x + " " + "бутылок пива на стене! ");
        while (x > 0){
        System.out.print(x + " " +  "бутылок пива.");
        System.out.println(" Возьми одну, пусти по кругу");
            x = x - 1;
            System.out.println(x + " " +  "бутылок пива на стене!");
        }
        if (x == 0){
            System.out.println("Нет бутылок пива на стене!");
            System.out.println("Нет бутылок пива!");
            System.out.println("Пойди в магазин и стяни ещё");
        }
    }
}
