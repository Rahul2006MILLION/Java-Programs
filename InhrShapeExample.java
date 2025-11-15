class Shape {
    void draw(){ System.out.println("Drawing Shape"); }
}

public class InhrShapeExample extends Shape {
    public static void main(String[] args){
        new InhrShapeExample().draw();
    }
}

