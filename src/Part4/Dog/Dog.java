package Part4.Dog;

public class Dog {
    String name;
    int size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void bark(int numOfBarks){
       while (numOfBarks > 0){
           System.out.println("Гав");
       numOfBarks = numOfBarks - 1;
       }



    }
}
