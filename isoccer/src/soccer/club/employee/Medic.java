package soccer.club.employee;

import utilities.Utilities.*;

import java.util.ArrayList;

import static utilities.Utilities.*;


public class Medic extends Employee
{
    private String crm;

    public Medic(String crm, double salary, String name, String cpf, String phone, String email)
    {
        super(salary, name, cpf, phone, email);
        this.crm = crm;
    }

    public static Medic newMedic()
    {
        System.out.println("***** Cadastro de medico *****");
        double salary = askSalary();
        String name = askName();
        String cpf = askCpf();
        String phone = askPhone();
        String crm = askCrm();
        String email = askEmail();
        return new Medic(crm, salary, name, cpf, phone, email);
    }

    public static void showMedic(ArrayList<Employee> listOfEmployee)
    {
        System.out.println("***** Lista de medicos *****");
        for (Employee employee: listOfEmployee) {
            if(employee instanceof Medic)
            {
                System.out.println("*********************************************************************************");
                System.out.println("Medico " + employee.getName() + ", cpf " + employee.getCpf() + ", crm: " +
                ((Medic) employee).crm);
                System.out.println("*********************************************************************************");
            }
        }
    }
}
