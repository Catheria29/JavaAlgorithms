package lab4;

public class Stack<T> {
    private LinkedList<T> list;

    public Stack() {
        list = new LinkedList<>();
    }


    public void push(T data) {
        list.addToFront(data);
    }


    public T pop() {

        T data = list.get(0);
        list.remove(0);
        return data;
    }


    public boolean hasItems() {
        return list.size() > 0;
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public static void main(String[] args) {

        System.out.println("\n=== Stack Demonstration ===");


        Stack<Integer> stack = new Stack<>();


        System.out.println("\n1. Pushing elements onto the stack:");
        stack.push(10);
        System.out.println("Pushed 10. Stack: " + stack);

        stack.push(20);
        System.out.println("Pushed 20. Stack: " + stack);

        stack.push(30);
        System.out.println("Pushed 30. Stack: " + stack);

        stack.push(40);
        System.out.println("Pushed 40. Stack: " + stack);

        System.out.println("\n2. Checking if stack has items:");
        System.out.println("Stack has items: " + stack.hasItems());
        System.out.println("Current stack: " + stack);

        System.out.println("\n3. Popping elements from the stack :");
        Integer popped1 = stack.pop();
        System.out.println("Popped: " + popped1 + " and now Stack: " + stack);

        Integer popped2 = stack.pop();
        System.out.println("Popped: " + popped2 + " and now Stack: " + stack);

        Integer popped3 = stack.pop();
        System.out.println("Popped: " + popped3 + " and now Stack: " + stack);

        Integer popped4 = stack.pop();
        System.out.println("Popped: " + popped4 + " and now Stack: " + stack);

        System.out.println("\n4. Empty stack ");
        System.out.println("Stack has items: " + stack.hasItems());
        System.out.println("Current stack: " + stack);



    }
}