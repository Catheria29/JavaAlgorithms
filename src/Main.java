import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Main {
    //Part 1
    public static double calculateAverage(ArrayList<Student> students){
        double sum = 0;
        for(Student s : students ){
            sum += s.getGrade();
        }

        return Math.round((sum/students.size()) * 100.0) / 100.0;
    }

//Part3
    public static <T> boolean checkContent(T[] arr, T element){
        for (T t : arr) {
            if (element.equals(t)) {
                return true;
            }}
        return false;
    }
    public static <T> int getIndex(T[] arr, T element){

        for (int i = 0; i < arr.length; i++) {
            if (element.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }

    public static <T> void elementsSwapper(T[] arr, T a, T b){

        if(checkContent(arr,a) && checkContent(arr,b)){

            T temp = arr[getIndex(arr,a)];

            arr[getIndex(arr,a)] =  b;

            arr[getIndex(arr,b)] = temp;

        }

    }

    //Part4
    public static <T extends Comparable<T>> T maxFinder(ArrayList<T> list, int begin, int end){
        T max = list.get(begin);
        for(int i = begin + 1; i < end; i++){
            if(list.get(i).compareTo(max) >0 ){
                max = list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) throws FileNotFoundException {
        //Part 1
        System.out.println("Part1");
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 70));
        students.add(new Student("Bob", 87));
        students.add(new Student("Charlie", 100));
        System.out.println(students);

        double average =calculateAverage(students);
        System.out.println("Average: " + average);
        System.out.println();
        System.out.println("Students whose grade is above the average: ");
        for(Student s : students){
            if(s.getGrade() > average)
                System.out.println(s.getName() + " " + s.getGrade());
        }

        //Part 2
        System.out.println("\n");
        System.out.println("Part2");

        File file = new File("./src/scores.txt");
        Scanner fileScan = new Scanner(file);

        float num = fileScan.nextFloat();
        System.out.println(num);

        ArrayList<Float> scores = new ArrayList<>();
        float sum = 0;
        int i = 0;
        while(fileScan.hasNextFloat()){
            scores.add(fileScan.nextFloat());
            sum += fileScan.nextFloat();
            i++;
        }

        float avg = sum / i;
        System.out.print("List of the scores:  ");
        System.out.println(scores);
        System.out.print("Average score: ");
        System.out.println(Math.round(avg * 100.0)/100.0);
        fileScan.close();

        //part 3
        System.out.println("\n");
        System.out.println("Part3");
        Integer[] nums = {3,5,7,7,2,4};
        String[] names = {"Ali","baba","Mama","Tony"};
        elementsSwapper(nums,7,3);
        elementsSwapper(names,"Mama","Ali");

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(names));

        //Part4
        System.out.println("\n");
        System.out.println("Part4");
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(34);
        nums1.add(5);
        nums1.add(45);
        nums1.add(78);
        nums1.add(1);
        ArrayList<String> name = new ArrayList<>();
        name.add("Ali");
        name.add("Baba");
        name.add("Mama");
        name.add("Toby");
        System.out.println(nums1);
        int max = maxFinder(nums1,1,5);
        System.out.println(max);
        System.out.println(maxFinder(name,0,4));


    }
}
