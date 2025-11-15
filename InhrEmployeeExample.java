class Employee {
    void work(){ System.out.println("Employee Working"); }
}

public class InhrEmployeeExample extends Employee {
    public static void main(String[] args){
        new InhrEmployeeExample().work();
    }
}

