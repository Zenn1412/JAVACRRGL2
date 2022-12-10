public class App {
    public static boolean contains123(int[] sar) {
        for(int i = 0; i < sar.length -2; i++) {
            if(sar[i] == 1 && sar [i+1] == 2  && sar[i+2] == 3) {
                return true;
            }
        }
        return false;
    }
public static void main(String[] args) {
    int[] array1 ={1,1,2,3,1};
    int[] array2 ={1,1,2,4,1};
    int[] array3 ={1,1,2,1,2,3};

    System.out.println(contains123(array1));
    System.out.println(contains123(array2));
    System.out.println(contains123(array3));
}
}