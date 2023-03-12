import java.util.Arrays;

public class Simulation {
    int howManyDice = 0;
    int numOfRolls = 0;

    Bins result;
    Dice dicey;
    public Simulation(int n, int k) {
        this.howManyDice = n;
        this.numOfRolls = k;

        this.result = new Bins(2, 12);
        this.dicey = new Dice(howManyDice);
    }
    public static void main(String[] args) {

        Simulation sim = new Simulation(2, 1000000);

        sim.runSimulation();

        sim.printResults();
    }

    public void runSimulation() {

        for (int i = 1; i <= numOfRolls; i++) {
            int num = dicey.tossAndSum();
            result.incrementBin(num);
        }
    }

    public void printResults() {

        
        System.out.println("***");
        System.out.println("Simulation of " + howManyDice + " dice tossed " + numOfRolls + " times.");
        System.out.println("***\n");

        int binZ = 0;
        int results = 0;
        for (int i = 2; i <= 12; i++) {
            binZ = i;
            results = result.getBin(i);
            double percent = ((double)results/numOfRolls);

            System.out.printf("%2d :   %6d: %.2f ************\n", binZ, results, percent);
        }
        //System.out.println();

    }


}