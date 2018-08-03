package soccer.club.employee;
import java.util.ArrayList;
import static utilities.Utilities.*;

public class Coach extends Employee
{
    public Coach(double salary, String name, String cpf, String phone, String email)
    {
        super(salary, name, cpf, phone, email);
    }

    public static Coach newCoach()
    {
        System.out.println("***** Cadastro de tecnico *****");
        double salary = askSalary();
        String name = askName();
        String cpf = askCpf();
        String phone = askPhone();
        String email = askEmail();
        return new Coach(salary, name, cpf, phone, email);

    }

    public static void showCoachs(ArrayList<Employee> listOfEmployee)
    {
        System.out.println("***** Lista de treinadores *****");
        for (Employee employee: listOfEmployee) {
            if(employee instanceof Coach)
            {
                System.out.println("*********************************************************************************");
                System.out.println("Tecnico " + employee.getName() + ", cpf " + employee.getCpf() + ".");
                System.out.println("*********************************************************************************");
            }
        }
    }
}
