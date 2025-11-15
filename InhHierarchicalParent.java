class Parent { void display(){ System.out.println("Parent"); }}
class C1 extends Parent {}
class C2 extends Parent {}

public class InhHierarchicalParent {
    public static void main(String[] args) {
        new C1().display();
        new C2().display();
    }
}

