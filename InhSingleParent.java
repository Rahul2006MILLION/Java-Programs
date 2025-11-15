class A {
    void show() { System.out.println("Parent"); }
}

public class InhSingleParent extends A {
    public static void main(String[] args) {
        new InhSingleParent().show();
    }
}

