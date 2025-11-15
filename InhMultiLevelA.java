class X { void showX(){ System.out.println("X"); }}
class Y extends X { void showY(){ System.out.println("Y"); }}
public class InhMultiLevelA extends Y {
    public static void main(String[] args) {
        InhMultiLevelA obj = new InhMultiLevelA();
        obj.showX();
        obj.showY();
    }
}

