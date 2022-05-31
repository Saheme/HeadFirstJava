package Part5.SimpleDotCom;

public class SimpleDotCom {
    int numOfHits = 0;
    int[] locationCells;



    public void setLocationCells(int[] locs){
        locationCells = locs;
    }

    public String checkYourSelf(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";
        for (int cell:locationCells){
            if (guess==cell){
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if (numOfHits==locationCells.length){
            result = "Потопил";
        }
        System.out.println(result);
        return result;
     }
}
