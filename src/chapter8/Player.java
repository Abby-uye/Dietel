package chapter8;

public class Player implements move {
    private final String name;
    public  Player(String name){
        this.name = name;

    }

    public String getName() {
        return this.name;
    }
    @Override
    public int move(int index) {
        return index;
    }
}
