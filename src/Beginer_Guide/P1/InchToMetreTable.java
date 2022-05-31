package Beginer_Guide.P1;

public class InchToMetreTable {
    public static void main(String[] args) {
        int count = 0;
        double metre, inch;
        for (inch = 1; inch <= 144; inch++) {
            metre = 1/39.37;
            System.out.println(inch + " дюймов составляют " + metre + " метров");
            count++;
            if (count == 12) {
                System.out.println();
                count = 0;
            }
        }
    }
}
