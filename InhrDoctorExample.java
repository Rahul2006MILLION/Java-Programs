class Doctor {
    void treat(){ System.out.println("Doctor Treating"); }
}

public class InhrDoctorExample extends Doctor {
    public static void main(String[] args){
        new InhrDoctorExample().treat();
    }
}

