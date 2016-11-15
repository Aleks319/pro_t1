package hw.task1;

public class MetSum {

    @MyAnn(a = 10, b = 20)
    public void sum(int a, int b) {
        System.out.println("a + b = " + (a + b));
    }
}
