package Student;

public class StudentInt_NK extends StudentInt
{
    public StudentInt_NK()
    {
        System.out.println("Konstruktor su-sub-klasy StudentInt_NK().");
    }

    @Override
    public void setStatus(int status)
    {
        super.setStatus(status);
    }
}
