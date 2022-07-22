package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int skippedSum = 0;
        int noneSkipped = 0;
        if (numberToSkip<0)
        {
            System.out.println("last number in row is negative");
        }
        else if (numberToSkip>lastInRow)
        {
            System.out.println("number to skip is bugger then the last");
        }
        else{
            for (int i = 0; i<lastInRow+1; i++) {
                if (i <= numberToSkip) {
                    skippedSum = skippedSum + i;
                }
                else{
                    noneSkipped = noneSkipped + i;
                }
            }
            System.out.println("skipped sum is " + skippedSum);
            System.out.println("counted sum is " + noneSkipped);
        }

    }
}
