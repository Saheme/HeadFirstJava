package Part2.GuessGame;

public class GuessGame {
    PLayer p1;
    PLayer p2;
    PLayer p3;

    public void startGame(){
        p1 = new PLayer();
        p2 = new PLayer();
        p3 = new PLayer();

        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;

        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я загадываю число от 0 до 9...");

        while (true){
            System.out.println("Число которое надо угадать - " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessP1 = p1.number;
            System.out.println("Первый игрок думает, что это " + guessP1);
            guessP2 = p2.number;
            System.out.println("Второй игрок думает, что это " + guessP2);
            guessP3 = p3.number;
            System.out.println("Третий игрок думает, что это " + guessP3);
            if (guessP1 == targetNumber){
                p1IsRight = true;
            }
            if (guessP2 == targetNumber){
                p2IsRight = true;
            }
            if (guessP3 == targetNumber){
                p3IsRight = true;
            }
            if (p1IsRight || p2IsRight || p3IsRight){
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал?" + p1IsRight);
                System.out.println("Второй игрок угадал?" + p2IsRight);
                System.out.println("Третий игрок угадал?" + p3IsRight);
                System.out.println("Конец игры");
                break;
            }else {
                System.out.println("Игроки должны попробовать еще раз");
            }

        }
    }
}
