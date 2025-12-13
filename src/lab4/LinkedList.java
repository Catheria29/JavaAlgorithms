package lab4;

public class LinkedList<T> {
    protected Node<T> head;
    protected int size;

    public LinkedList(){
        head = null;
        size = 0;
    }
    public void addToFront(T item){
        this.head =new Node<>(item,head);
        this.size++;
    }
    public void addToBack(T item){
        Node<T> newNode = new Node<>(item, null);
        if(head == null){
            head = newNode;
        }
        else{
            Node<T> current  = this.head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }
    public void remove(int index) {

        if (index < 0 || index >= size) {
            System.out.println("Invalid index: " + index);
            return;
        }

        if (index == 0) {
            head = head.getNext();
        } else {
            Node<T> current = head;

            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }

            current.setNext(current.getNext().getNext());
        }

        size--;
    }
    public T get(int index) {

        Node<T> current = head;

        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        return current.getData();
    }

    // Clears the list
    public void clear() {
        head = null;
        size = 0;
    }

    // Returns number of nodes
    public int size() {
        return size;
    }

    // Converts list to string
    @Override
    public String toString() {
        String result = "";
        Node<T> current = head;

        while (current != null) {
            result += current.getData();

            if (current.getNext() != null) {
                result += " -> ";
            }

            current = current.getNext();
        }

        return result;}

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.addToFront(10);
        list.addToFront(5);
        list.addToBack(20);
        list.addToBack(30);

        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());

        list.remove(1);
        System.out.println("After removal: " + list);

        System.out.println("Element at index 1: " + list.get(1));

        list.clear();
        System.out.println("cleared list: " + list);
        System.out.println("Size: " + list.size());
        LinkedList<String> list2 = new LinkedList<>();


        list2.addToFront("Hello");
        list2.addToFront("Hiiii");
        System.out.println("After addToFront: " + list2);

        list2.addToBack("loll");
        list2.addToBack("Moooveee");
        list2.addToBack("Java");
        System.out.println("After addToBack: " + list2);

        System.out.println("Element at index 2: " + list2.get(2));

        list2.remove(1);
        System.out.println("After remove(1): " + list2);

        System.out.println("Size of list: " + list2.size());

        list2.clear();
        System.out.println("After clear(): " + list2);
        System.out.println("Final size: " + list2.size());
    }
}

