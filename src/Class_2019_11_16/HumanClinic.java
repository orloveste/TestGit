package Class_2019_11_16;

public class HumanClinic extends AbstractClinic{
    public HumanClinic(AbstractPatient[] curentPatient) { super(curentPatient); }
    @Override
    public void takeInNewPatient(AbstractPatient newPatient) {
        for (int i = 0; i < curentPatient.length ; i++) {
            if (curentPatient[i] == null){
                curentPatient[i] = newPatient;// patul liber va fi ocupat de noul pacient
                break;// ca sa nu ocupi toate paturile cu acelas pacient
            }
        }
    }
    @Override
    public void releasePatient(AbstractPatient existingPatient) {
        for (int i =0; i < curentPatient.length; i++){
            if (curentPatient[i] == existingPatient) {
                curentPatient[i] = null;
            }
        }
    }
    @Override
    public void listCurrentPatients() {
        for (int i = 0; i < curentPatient.length ; i++) {
        if (curentPatient[i] != null){//printeaza in run si locurile libere
            System.out.println(i + " " + curentPatient[i]);// se va apela metoda tostring
        //i + " " + = printeaza si locul in run din array
        }
        }
    }
}
