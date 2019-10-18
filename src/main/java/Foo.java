public class Foo {
    public int[] X = new int[]{1, 3, 5, 7, 9, 11};

    public void foo(boolean a, int x, int y, int z) {
        label1:
        do {
            try {
                if (x > 0) {
                    int someVariable = a ? x : y;
                    int anotherVariable = a ? x : y;
                } else if (x < 0) {
                    int someVariable = (y + z);
                    someVariable = x = x + y;
                } else {
                    label2:
                    for (int i = 0; i < 5; i++) doSomething(i);
                }
                switch (x) {
                    case 0:
                        doCase0();
                        break;
                    default:
                        doDefault();
                }
            } catch (Exception e) {
                processException(e.getMessage(), x + y, z, a);
            } finally {
                processFinally();
            }
        }
        while (a);

        if (2 < 3) return;
        if (3 < 4) return;
        do {
            x++;
        }
        while (x < 10000);
        while (x < 50000) x++;
        for (int i = 0; i < 5; i++) System.out.println(i);
    }

    private class InnerClass implements I1, I2 {
        public void bar() throws E1, E2 {
        }
    }

    void doSomething(int i) {}
    void doCase0(){}
    void doDefault(){}
    void processException(String m, int i, int a, boolean b){}
    void processFinally(){}
    interface I1{}
    interface I2{}
    class E1 extends Throwable{}
    class E2 extends Throwable{}
}