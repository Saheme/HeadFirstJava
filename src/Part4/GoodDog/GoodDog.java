package Part4.GoodDog;

public class GoodDog {
    private int size;




    public int getSize(){
        return size;
    }
    public void setSize(int s){
        size = s;
    }

    void bark(){
        if (size > 60){
            System.out.println("Вуф - Вуф!");
        }else if (size >15){
            System.out.println("Гав - Гав!");
        }else  {
            System.out.println("Тяф - Тяф!");
        }
    }
}
