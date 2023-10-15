package Chapter5;

public class DeMorganLaw {
    public static void main(String[] args) {
        int a = 7;
        int b = 7;
        boolean c = (!(a < 5 )&& !(b>7));
        System.out.println(c);
        boolean d = (!(a < 5 || b > 7));
        System.out.println(d);
        int e =10;
        int f = 10;
        int g = 5;
       boolean h = (!(e == f) || !(g!=5));
       boolean i = (!(e==f && g!=5));
        System.out.println(i);
        System.out.println(h);
        int j = 8;
        int k = 6;
        boolean l = !(j<=8)&& (k<=6);
        boolean m = !(j<=8)||!(k<=6);
        System.out.println(l);
        System.out.println(m);
        int n = 4;
        int o = 6;
        boolean p = !(n>4) || (o>6);
        boolean q = !(n >4) && !(o>6);
        System.out.println(p);
        System.out.println(q);

        int r = 2;
        int s = 3;
        System.out.println(r==s);


    }
    }


