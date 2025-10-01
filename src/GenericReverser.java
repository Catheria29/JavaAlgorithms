import java.util.*;
public class GenericReverser {
    //To reverse int arrays
    public static int[] reverser(int[] arr){
        int temp,left = 0, right = arr.length - 1;
        for(int i = 0; i < arr.length; i++){
            if(left < right){
                temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            }

        }
        return arr;
    }
    //generic version
    public static  <T> T[] reverser_generic(T[] arr){
        T temp;
        int left = 0, right = arr.length - 1;
        for(int i = 0; i < arr.length/2; i++){
            if(left < right){
                temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Integer[] arrayInt = {9,8,7,6,5,4,3,2,1,0};
        Integer[] rev = reverser_generic(arrayInt);
        String[] names = {"Remi","Emmanuel","Rosalie","Catheria","Eliana"};
        String[] names_rev = reverser_generic(names);
        System.out.println(Arrays.toString(rev));
        System.out.println(Arrays.toString(names_rev));
    }
}