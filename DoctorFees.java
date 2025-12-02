class Doctor {
    int consultationFee() { return 0; }
}

class Dentist extends Doctor {
    int consultationFee() { return 300; }
}

class Cardiologist extends Doctor {
    int consultationFee() { return 500; }
}

class Surgeon extends Doctor {
    int consultationFee() { return 800; }
}

public class DoctorFees {
    public static void main(String[] args) {
        Doctor d1 = new Dentist();
        Doctor d2 = new Cardiologist();
        Doctor d3 = new Surgeon();

        System.out.println("Dentist Fee: " + d1.consultationFee());
        System.out.println("Cardiologist Fee: " + d2.consultationFee());
        System.out.println("Surgeon Fee: " + d3.consultationFee());
    }
}

