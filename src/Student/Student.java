package Student;

import javax.lang.model.util.Elements;

public class Student
{
    private String Name;
    private int Status = 0;


    public Student()
    {
        System.out.println("Konstruktor super klasy Student() . ");
    }

    public void setName(String name)
    {
        Name = name;
    }

    public void setStatus(int status)
    {
        Status = status;
    }

    public String getName()
    {
        return Name;
    }

    public int getStatus()
    {
        return Status;
    }

    public String toString()
    {
        return "Name: " + Name + ", Status: " + Status;
    }
}
