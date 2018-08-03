package soccer.club.employee;
import java.util.ArrayList;
import static utilities.Utilities.*;


public class Lawyer extends Employee
{
    public Lawyer(double salary, String name, String cpf, String phone, String email)
    {
        super(salary, name, cpf, phone, email);
    }

    public static Lawyer newLawyer()
    {
        System.out.println("***** Cadastro de advogado *****");
        double salary = askSalary();
        String name = askName();
        String cpf = askCpf();
        String phone = askPhone();
        String email = askEmail();

        return new Lawyer(salary, name, cpf, phone, email);

    }

    public static void showLawyer(ArrayList<Employee> listOfEmployee)
    {
        System.out.println("***** Lista de advogados *****");
        for (Employee employee: listOfEmployee) {
            if(employee instanceof Lawyer)
            {
                System.out.println("*********************************************************************************");
                System.out.println("Advogado " + employee.getName() + ", cpf " + employee.getCpf() + ".");
                System.out.println("*********************************************************************************");
            }
        }
    }

}
