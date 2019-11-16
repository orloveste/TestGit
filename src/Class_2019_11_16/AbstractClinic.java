package Class_2019_11_16;

//COMENTARII IN CLASA LA REVIZIE
public abstract class AbstractClinic {

    protected AbstractPatient[] curentPatient;

    public AbstractClinic(AbstractPatient[] curentPatient) {
        this.curentPatient = curentPatient;
    }

    public abstract void takeInNewPatient(AbstractPatient newPatient);
    public abstract void releasePatient(AbstractPatient existingPatient);
    public abstract void listCurrentPatients();

}
