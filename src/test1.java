import java.util.Arrays;
import java.util.Random;

public class test1 {
    public static void main(String[] args) {

        int arrone[] = new int[]{1,3,5,7};
        int arrtwo[] = new int[]{2,4,6,8};
        int arrthree[] = new int[arrone.length+arrtwo.length];

        System.arraycopy(arrone, 0, arrthree,0,arrone.length);
        System.arraycopy(arrtwo,0,arrthree, arrone.length,arrtwo.length);
        System.out.println(Arrays.toString(arrthree));

    }
}
