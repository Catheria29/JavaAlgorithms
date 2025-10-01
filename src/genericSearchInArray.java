public class genericSearchInArray {
    //searching for int n in an array of integers
    public static boolean boolFinder(int[] arr, int n){
        for(int i : arr){
            if(i == n) return true;
        }
        return false;
    }
    // generic version
    public static <T> boolean boolFinderGeneric(T[] arr, T n){
        for (T i : arr)
            if(i.equals(n)) return true;
        return false;
    }


    public static void main(String[] args){
        int[] arrayInts = {1,2,3,4,5,6,7,8,9};
        Integer[] arrayIntegers = {1,2,3,4,5,6,7,8,9};
        if(boolFinder(arrayInts,11)) System.out.println("found");
        else System.out.println("Not found");

        if(boolFinderGeneric(arrayIntegers,1)) System.out.println("found");
        else System.out.println("Not found");
    }
}
