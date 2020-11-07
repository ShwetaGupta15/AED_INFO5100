package A7;

public class HospitalRoom 
{
    //TODO: implement your code here
	int patients = 0;
	int doctors = 0;
	
    public boolean doctorEnter(Doctor d) throws InterruptedException 
    {
        //TODO: implement your code here
    	if (doctors == 0) {
            doctors++;
            System.out.println("Doctor " + d.dName + " Entered. number of doctor " + doctors);
            return true;
        }
    	else {
            System.out.println("Doctor " + d.dName + " is waiting to Enter. number of doctor " + doctors);
            Thread.sleep(700);
        }
        return false;    	
    }

    public boolean doctorLeave(Doctor d) throws InterruptedException 
    {
        //TODO: implement your code here
    	 doctors--;
    	 System.out.println("Doctor " + d.dName + " Left. number of doctor " + doctors);
    	 
         return true;
    }

    public boolean patientEnter(Patient p) throws InterruptedException 
    {
        //TODO: implement your code here
    	 if (patients < 3) {
             patients++;
             System.out.println("Patient " + p.pName + " Entered. number of patients " + patients);
             return true;
         } else {
             System.out.println("Patient " + p.pName + " is waiting to Enter. number of patients " + patients);
             Thread.sleep(500);
         }
         return false;
    	
    }

    public boolean patientLeave(Patient p) throws InterruptedException 
    {
        //TODO: implement your code here
    	patients--;
    	System.out.println("Patient " + p.pName + "left");
        
        return true;
    }

}

class Doctor 
{
    public String dName;
    public Doctor(String name) 
    {
        this.dName = name;
    }

}

class Patient 
{
    public String pName;
    public Patient(String name) 
    {
        this.pName = name;
    }

}


/*class Main2 {
    public static void main(String[] args) {
        HospitalRoom room = new HospitalRoom();
        Doctor siva = new Doctor("siva");
        Doctor john = new Doctor("john");
        Patient p1 = new Patient("p1");
        Patient p2 = new Patient("p2");
        Patient p3= new Patient("p3");
        Patient p4 = new Patient("p4");
        Patient p5 = new Patient("p5");
        Thread doctor1 = new Thread(() -> {
            try {
                while(!room.doctorEnter(siva)) {}
                Thread.sleep(500);
                while(!room.doctorLeave(siva)) {}

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread doctor2 = new Thread(() -> {
            try {
                while(!room.doctorEnter(john)) {}
                Thread.sleep(500);
                while(!room.doctorLeave(john)) {}
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient1 = new Thread(() -> {
            try {
                    while(!room.patientEnter(p1)) {}
                Thread.sleep(500);
                    while(!room.patientLeave(p1)) {}
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient2 = new Thread(() -> {
            try {
                while(!room.patientEnter(p2)) {};
                Thread.sleep(500);
                while(!room.patientLeave(p2)) {};
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient3 = new Thread(() -> {
            try {
                while(!room.patientEnter(p3)) {};
                Thread.sleep(500);
                while(!room.patientLeave(p3)) {};
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient4 = new Thread(() -> {
            try {
                while(!room.patientEnter(p4)) {};
                Thread.sleep(500);
                while(!room.patientLeave(p4)) {};
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient5 = new Thread(() -> {
            try {
                while(!room.patientEnter(p5)) {};
                Thread.sleep(500);
                while(!room.patientLeave(p5)) {};
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        doctor1.start();
        doctor2.start();
        patient1.start();
        patient2.start();
        patient3.start();
        patient4.start();
        patient5.start();
    }
}*/