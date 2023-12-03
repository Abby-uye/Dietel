package Assignments;

public class NewJavaList {
    public int size = 0;
    String [] myList = new String[1];

public  boolean isEmpty(){
    if (myList[0] == null){
        return true;
    }
return false;
}
    public void add(String word) {
            myList[size] = word;
        ++size;

            if (size >= myList.length){
             myList =   copyOf(myList,size*2);
            }
    }

    public void add(String word,int index){
    if (myList[index] != null){
         myList[index+1] = myList[index];
        myList[index] = word;
    }
    myList[index] = word;
    ++size;
        if (size >= myList.length){
            myList =   copyOf(myList,size*2);
        }
    }

    public String get(int index){
        return myList[index];
    }
    public void remove(int index) {
        myList[index] = null;

    }

    public void set(int index, String element) {
        myList[index] = element;
    }

    public String [] copyOf(String [] oldArray, int size) {
    String [] newArray = new String[size];
    int count =0;
    for (String elements :oldArray){
        newArray[count] = elements;
        count++;
    }
return newArray;
    }
    public int indexOf(String word) {
        int count = 0;
        for (String elements: myList){
            if ((myList[count].equals(word))){
                break;
            }
            count++;
        }
        return count;
    }
    public boolean contains(String element) {
        int count = 0;
        for (String elements : myList){
            if (myList[count] == element){
                return true;
            }
            count++;
        }
        return false;
    }
    public String[] clear() {
        return myList = new  String[0];
    }
    public static void main(String[] args) {
        NewJavaList string = new NewJavaList();

    }


}
