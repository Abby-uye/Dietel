package Chapter4;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        long currentWorldPopulation = 8100000000L;
        double populationGrowthRate = 0;
        double result = 0;
        int counter = 1;
        while (counter <= 75){
            populationGrowthRate = (double) (currentWorldPopulation / 100) * 0.88;
            populationGrowthRate+=1;

            System.out.printf("%n %d %f  ",counter,populationGrowthRate);

            counter++;


        }
    }
}
