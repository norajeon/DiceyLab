public class Dice {

   int howManyDice = 0;
    public Dice (int howManyDice) {
        this.howManyDice = howManyDice;

    }

    public Integer tossAndSum() {
       int sum = 0;
        for (int i = 1; i <= howManyDice; i++) {

            sum += (int) (Math.random() * 6 + 1);

        }
        return sum;
    }



}
