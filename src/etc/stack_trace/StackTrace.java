package etc.stack_trace;

public class StackTrace {
    public static void main(String[] args) {
        Class1.method1();
    }
    static class Class1 {
        public static void method1() {
            Class2.method2();
        }
    }
    static class Class2{
        public static void method2() {
            Class3.method3();
        }
    }
    static class Class3 {
        public static void method3() {
            throw new NullPointerException();
        }
    }
}
