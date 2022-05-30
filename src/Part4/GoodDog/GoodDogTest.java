package Part4.GoodDog;

public class GoodDogTest {
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(65);
        GoodDog two = new GoodDog();
        two.setSize(10);
        System.out.println("Первая собака " + one.getSize());
        System.out.println("вторая собака " + two.getSize());
        one.bark();
        two.bark();
    }
}
