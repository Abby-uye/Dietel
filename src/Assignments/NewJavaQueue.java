package Assignments;

public class NewJavaQueue  {
    int size = 0;
    String [] myList = new String[100];
    public boolean add(String element) {
        if (size == 100){
            throw  new IndexOutOfBoundsException("Can no longer add to queue");
        }
        myList[size] = element;
        size++;
        return true;
    }

    public String element() {
        return myList[size-1];
    }
}
