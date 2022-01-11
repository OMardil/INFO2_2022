package app;

public class SuperClass {
    public void method1() {
        System.out.println("superclass method1");
        this.method2();
    }

    public void method2() {
        System.out.println("superclass method2");
    }
}

class SubClass extends SuperClass {
    @Override
    public void method1() {
        System.out.println("subclass method1");
        super.method1();
    }

    @Override
    public void method2() {
        System.out.println("superclass method2");
    }
}

class Demo {
    public static void main(String[] args) {
        SubClass mSubClass = new SubClass();
        mSubClass.method1();
    }
}


