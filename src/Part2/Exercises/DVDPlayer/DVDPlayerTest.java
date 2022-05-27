package Part2.Exercises.DVDPlayer;

public class DVDPlayerTest {
    public static void main(String[] args) {

        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        d.playDVD();

        if (d.canRecord == true){
            d.recordDVD();
        }
    }
}
