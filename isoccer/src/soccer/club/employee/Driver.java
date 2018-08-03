package soccer.club.employee;
import static utilities.Utilities.*;
import java.util.ArrayList;

import static utilities.Utilities.askEmail;

public class Driver extends Employee {

    private String cnh;

    public Driver(double salary, String name, String cpf, String phone, String cnh, String email)
    {
        super(salary, name, cpf, phone, email);
        this.cnh = cnh;
    }

    public static Driver newDriver()
    {
        System.out.println("***** Cadastro de tecnico *****");
        double salary = askSalary();
        String name = askName();
        String cpf = askCpf();
        String phone = askPhone();
        String cnh = askCnh();
        String email = askEmail();

        return new Driver(salary, name, cpf, phone, cnh, email);

    }

    public static void showDrivers(ArrayList<Employee> listOfEmployee)
    {
        System.out.println("***** Lista de motoristas *****");
        for (Employee employee: listOfEmployee) {
            if(employee instanceof Driver)
            {
                System.out.println("*********************************************************************************");
                System.out.println("Motorista " + employee.getName() + ", cpf " + employee.getCpf() + ", cnh: " +
                ((Driver) employee).cnh);
                System.out.println("*********************************************************************************");
            }
        }
    }

}
