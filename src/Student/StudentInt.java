package Student;

public class StudentInt extends Student
{
    private String Origin;

    public StudentInt()
    {
        System.out.println("Konstruktor sub-klasy StudentInt().");
    }

    public void setOrigin(String origin)
    {
        Origin = origin;
    }

    public String getOrigin()
    {
        return Origin;
    }
}
