public class GenericCustomizedArrayList <T> {



        private int size;// number of elements
        private T[] elementData;
        private final static int DEFAULT_SIZE = 50;

        public GenericCustomizedArrayList(){
            this(DEFAULT_SIZE);
        }
        public GenericCustomizedArrayList(int capacity){
            if(capacity < 0){
                System.out.printf("Impossible to create a list of size %d.", capacity);
                System.exit(1);
            }
            elementData =(T[]) new Object[capacity];
            size = 0;
        }

        public int size(){
            return this.size;
        }
        public void add(T n){
            checkCapacity(size + 1);
            elementData[this.size] = n;
            size++;
        }

        public void add(int idx,T n){
            checkCapacity(size + 1);
            size++;
            for (int i = size; i > idx; i--){
                elementData[i] = elementData[i-1];
            }
            elementData[idx] = n;
        }
        public void addAll(T[] arr){
            checkCapacity(size + arr.length);
            for (T j : arr) {
                this.add(j);
            }
        }
        public void remove(T n){
            if(this.contains(n)){
                for(int i = indexOf(n); i < this.size-1; i++){

                    elementData[i] = elementData[i+1];

                }
                size--;
            }
            else
                System.out.printf("%s is not found.\n",n);
        }
        public void removeIdx(int idx){
            checkIndex(idx);
            for(int i = idx; i < this.size - 1; i++){
                elementData[i] = elementData[i+1];
            }
            size--;
        }
        public T get(int index){
            checkIndex(index);
            return elementData[index];
        }

        public int indexOf(T n){
            for(int i = 0; i < this.size; i++){
                if(n == elementData[i])
                    return i;
            }
            return -1;
        }


    public boolean contains(T n){
        for(int i = 0; i < this.size; i++ ){
            if(elementData[i].equals(n)){
                return true;
            }
        }
        return false;
    }
        private void checkCapacity(int capacity){
            if(capacity > elementData.length){
                System.out.println("Impossible, out of capacity");
                System.exit(1);
            }
        }

        private void checkIndex(int idx){
            if(idx >= size){
                System.out.println("Index out of range.");
                System.exit(1);
            }
        }

        public String toString(){
            String message ="[" + elementData[0] ;
            for(int i = 1; i < this.size; i++){
                message = message + ", " + elementData[i] ;
            }
            message = message + "]";
            return message;
        }


        public static void main(String[] args){
            GenericCustomizedArrayList<Integer> intArr = new GenericCustomizedArrayList<>();
            Integer[] arr = {1,6,4,3,2,5};
            intArr.add(8);
            intArr.add(2);
            intArr.add(7);
            intArr.add(1,4);
            intArr.remove(8);
            System.out.println(intArr.toString());
            intArr.addAll(arr);
            System.out.println(intArr.toString());
            //intArr.add(2,5);
            // System.out.println(intArr.toString());
            System.out.println(intArr.size());
            System.out.println();
            intArr.removeIdx(3);
            System.out.println(intArr);
            System.out.println(intArr.size());

            System.out.println(intArr.indexOf(7));
            System.out.println(intArr.contains(9));




        }
    }


