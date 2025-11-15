interface I1 { void a(); }
interface I2 { void b(); }

public class InhMultipleA implements I1, I2 {
    public void a(){ System.out.println("A"); }
    public void b(){ System.out.println("B"); }

    public static void main(String[] args){
        new InhMultipleA().a();
        new InhMultipleA().b();
    }
}

