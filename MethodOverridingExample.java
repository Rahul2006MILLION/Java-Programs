class A {
    void show(){ System.out.println("Parent"); }
}

public class MethodOverridingExample extends A {
    void show(){ System.out.println("Child"); }

    public static void main(String[] args){
        new MethodOverridingExample().show();
    }
}

