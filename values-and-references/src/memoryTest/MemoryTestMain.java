package memoryTest;

public class MemoryTestMain {

    public static void main(String[] args) {
        MemoryTestMain main = new MemoryTestMain();
        main.start();
    }

    private void start() {
        String last = "Z"; //New object and reference to that object
        Container container = new Container(); //New object and reference to that object
        container.setInitial("C");// New String object and change of reference for initial to that object
        another(container, last);
        System.out.println(container.getInitial());
    }

    private void another(Container initialHolder, String newInitial) {
        newInitial.toLowerCase(); //Creates new String object, but doesn't change reference to the object - NOT USED
        initialHolder.setInitial("B"); // New String object and change of reference for initial to that object
        Container initial2 = new Container(); //New object and reference to that object
        initialHolder = initial2; //Changes reference of initialHolder to initial2 object
        System.out.println(initialHolder.getInitial());
        System.out.println(newInitial);
    }
}
