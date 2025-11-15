class A1 { void showA(){ System.out.println("A1"); }}
interface B1 { void showB(); }

public class InhHybridA extends A1 implements B1 {
    public void showB(){ System.out.println("B1"); }

    public static void main(String[] args){
        InhHybridA obj = new InhHybridA();
        obj.showA();
        obj.showB();
    }
}

