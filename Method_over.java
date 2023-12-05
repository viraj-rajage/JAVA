class N {
    void test() {
        System.out.println("no parameter");
    }

    void test(int a) {
        System.out.println("Parameter a and value of a is:=" + a);
    }

    void test(double a, double b) {
        System.out.println("a&b=" + a + "" + b);
    }
}
public class Method_over {
    public static void main(String[] args) {
        N n = new N();
        n.test();
        n.test(34, 45);
        n.test(34);

    }
}
