class Transport {
    void move(){ System.out.println("Transport Moving"); }
}

public class InhrTransportExample extends Transport {
    public static void main(String[] args){
        new InhrTransportExample().move();
    }
}
