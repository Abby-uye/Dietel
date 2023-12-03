package Assignments;

public class NewJavaSet {
    NewJavaList list = new NewJavaList();
    int size = 0;
    String [] myList = new String[1];
    public boolean add(String element) {
        if (!list.contains(element)) {
            list.add(element);




//        myList[size] = element;
//        size++;
//        if (size >= myList.length) {
//            myList = list.copyOf(myList, myList.length * 2);
//        }
//        for (String elements : myList) {
//            if (elements.equals(element)) {
//                return false;
//            }
        }

        return true;
    }

        public String[] clear(){
            return myList = new  String[0];
    }

    public boolean contains(String element) {
        for (String elements : myList) {
            if (elements.equals(element)) {
                return true;
            }
        }
        return false;
    }
}
