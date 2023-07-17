import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        int arrOne[] = new int[]{1, 4, 5, 7};
        int arrTwo[] = new int[]{2, 4, 8, 0};
        int arrThree[] = new int[arrOne.length + arrTwo.length];

        boolean haveZero = false;
        int iteration = 0;
        addUniqueIlem(arrOne, arrThree, haveZero, iteration);
        /*for (int i = 0; i < arrOne.length; i++) {
            int value = arrOne[i];
            if (value == 0 && !haveZero) {
                iteration++;
                haveZero = true;
                continue;
            }
            Arrays.sort(arrThree);
            int index = Arrays.binarySearch(arrThree, value);
            if (index < 0) {
                arrThree[0] = arrOne[i];
                iteration++;
            }
            System.out.println(Arrays.toString(arrThree));
        }*/
        addUniqueIlem(arrTwo, arrThree, haveZero, iteration);
       /* for (int i = 0; i < arrTwo.length; i++) {
            int value = arrTwo[i];
            if (value == 0 && !haveZero) {
                iteration++;
                haveZero = true;
                continue;
            }
            Arrays.sort(arrThree);
            int index = Arrays.binarySearch(arrThree, value);
            if (index < 0) {
                arrThree[0] = arrTwo[i];
                iteration++;
            }
        }*/
        System.out.println(iteration);
        Arrays.sort(arrThree);
        System.out.println(Arrays.toString(arrThree));
        int arrFinal[] = new int[iteration];
        System.arraycopy(arrThree, arrThree.length - iteration, arrFinal, 0, iteration);
        System.out.println(Arrays.toString(arrFinal));
    }
    public static void addUniqueIlem(int[] arrSrc, int[] arrDst, boolean haveZero, int iteration){
        for (int i = 0; i < arrSrc.length; i++) {
            int value = arrSrc[i];
            if (value == 0 && !haveZero) {
                iteration++;
                haveZero = true;
                continue;
            }
            Arrays.sort(arrDst);
            int index = Arrays.binarySearch(arrDst, value);
            if (index < 0) {
                arrDst[0] = arrSrc[i];
                iteration++;
            }
            System.out.println(Arrays.toString(arrDst));
        }
    }
}
