package Class_2019_11_16;

public class ClinicRunner {
    public static void main(String[] args) {
        AbstractClinic humanClinic = new HumanClinic(new HumanPatient[10]);
        AbstractClinic petClinic = new PetClinic(new PetPatient[10]);// AM CREAT CLINICILE SI AM FACUT CAPACITATEA

        AbstractPatient salam = new HumanPatient("salam");
        AbstractPatient vali = new HumanPatient("vali");

        humanClinic.takeInNewPatient(salam);
        humanClinic.takeInNewPatient(vali);

        humanClinic.listCurrentPatients();
        humanClinic.releasePatient(salam);
        System.out.println("_____");
        humanClinic.listCurrentPatients();
        AbstractPatient daniMocanu = new HumanPatient("Dani Mocanu");
        System.out.println("adding new patients");
        humanClinic.takeInNewPatient(daniMocanu);
        System.out.println("+++++++");
        humanClinic.listCurrentPatients();
    }
}
