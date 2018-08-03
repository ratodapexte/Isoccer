package soccer.club.employee;

import static utilities.Utilities.*;

import java.util.ArrayList;

public class Cooker extends Employee
{
    public Cooker(double salary, String name, String cpf, String phone, String email)
    {
        super(salary, name, cpf, phone, email);
    }

    public static Cooker newCooker()
    {
        System.out.println("***** Cadastro de cozinheiro *****");
        double salary = askSalary();
        String name = askName();
        String cpf = askCpf();
        String phone = askPhone();
        String email = askEmail();

        return new Cooker(salary, name, cpf, phone, email);

    }

    public static void showCookers(ArrayList<Employee> listOfEmployee)
    {
        System.out.println("***** Lista de cozinheiros *****");
        for (Employee employee: listOfEmployee) {
            if(employee instanceof Cooker)
            {
                System.out.println("*********************************************************************************");
                System.out.println("Cozinheiro " + employee.getName() + ", cpf " + employee.getCpf() + ".");
                System.out.println("*********************************************************************************");
            }
         }
    }
}
