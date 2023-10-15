public class Strings {
    public static void main(String[] args) {
        int sum = 0;
        String name = "268368682479427";
        for (int i = 0; i < name.length() ; i++) {
            //System.out.println(name.charAt(0));
            String number = String.valueOf(name.charAt(i));
            sum += Integer.parseInt(number);
        }
        System.out.println(sum);
    }
}
