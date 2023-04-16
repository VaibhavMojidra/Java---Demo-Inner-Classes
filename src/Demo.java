class OuterClass {
    private int x = 10;
    
    public void outerMethod() {
        InnerClass inner = new InnerClass();
        inner.innerMethod();
    }
    
    public class InnerClass {
        public void innerMethod() {
            System.out.println("The value of x is " + x);
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.outerMethod();
    }
}
