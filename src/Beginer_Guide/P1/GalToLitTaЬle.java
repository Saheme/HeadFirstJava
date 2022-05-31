package Beginer_Guide.P1;

public class GalToLitTaЬle {
    public static void main(String[] args) {
        double gallons, liter;
        int counter =0;
        for (gallons = 1; gallons<=50;gallons++){
            liter = gallons*3.75;
            System.out.println(gallons + " соответствуют " + liter + " литров");
            counter++;
            if (counter==10){
                System.out.println();
                counter = 0;
            }
        }
    }
}
