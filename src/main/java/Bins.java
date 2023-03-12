import java.sql.Array;
import java.util.ArrayList;

public class Bins {
int startingNum = 0;
int endingNum = 0;

public ArrayList<Integer> bins = new ArrayList<>();

    public Bins(int start, int end) {
        this.startingNum = start;
        this.endingNum = end;

        for (int i = start; i <= end; i++) {
            bins.add(0);
        }
//        System.out.println(bins.size());
    }

    //get number in # Bin
    public Integer getBin(int binNumber) {
        return bins.get(binNumber-startingNum);
    }

    //increased current number in bin
    public void incrementBin(int binNumber) {
            bins.set(binNumber-startingNum, bins.get(binNumber-startingNum) + 1);
        }
}
