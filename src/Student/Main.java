package Student;

public class Main
{
    public static void main(String[] args)
    {
        Student student = new Student();

        student.setName("Tomek");
        String name = student.getName();
        student.setStatus(1);
        int status = student.getStatus();
        System.out.println(student);

        StudentInt studentInt = new StudentInt();

        studentInt.setName("Marek");
        name = studentInt.getName();

        studentInt.setStatus(1);
        status = student.getStatus();

        studentInt.setOrigin("Korea Północna");
        String origin = studentInt.getOrigin();

        System.out.println(origin);

        StudentInt_NK studentInt_NK = new StudentInt_NK();
        studentInt_NK.setStatus(0);
        status = studentInt_NK.getStatus();
        System.out.println(status);

    }
}
