package utilities;

import soccer.club.employee.Employee;
import soccer.club.resource.TrainingCenter;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Utilities {

    public static String askLogin()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o login: ");
        String login = scanner.nextLine();

        return login;
    }

    public static String askPassword()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o password: ");
        String password = scanner.nextLine();

        return password;
    }

    public static String askCnh()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com a cnh: ");
        String cnh = scanner.nextLine();

        return cnh;
    }

    public static String askCpf()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o cpf: ");
        String cpf = scanner.nextLine();

        return cpf;
    }

    public static String askCrm()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o crm: ");
        String crm = scanner.nextLine();

        return crm;
    }

    public static String askEmail()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o email: ");
        String email = scanner.nextLine();

        return email;
    }

    public static String askAddres()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o endereço: ");
        String addres = scanner.nextLine();

        return addres;
    }

    public static String askPhone()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o telefone: ");
        String phone = scanner.nextLine();

        return phone;
    }

    public static String askName()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o nome: ");
        String name = scanner.nextLine();

        return name;
    }

    public static String askRole()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o nome: ");
        String role = scanner.nextLine();

        return role;
    }

    public static int scanInt()
    {
        Scanner scanner = new Scanner(System.in);
        try
        {
            int i = scanner.nextInt();
            return i;
        }catch(InputMismatchException e)
        {
            System.out.println("Entre apenas inteiros!!");
            return -1;
        }
    }
    public static double scanDouble()
    {
        Scanner scanner = new Scanner(System.in);
        try
        {
            double i = scanner.nextDouble();
            return i;
        }catch(InputMismatchException e)
        {
            System.out.println("Entre apenas numeros reais!!");
            return -1;
        }
    }

    public static double askSalary()
    {
        System.out.print("Entre com o salario: ");
        return scanDouble();
    }

    public static String scanString()
    {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        return string;
    }
    public static int isThereEmployeeCpf(ArrayList<Employee> listOfEmployee)
    {
        System.out.println("***** Busca empregado por cpf *****");
        String cpf = askCpf();
        for (Employee employee : listOfEmployee){
            if (employee.getCpf().equals(cpf))
                return listOfEmployee.indexOf(employee);
        }
        return -1;
    }
    public static int getCenterIndex(ArrayList<TrainingCenter> listOfCenter, String name)
    {
        TrainingCenter center;
        for (int i = 0; i < listOfCenter.size(); i++) {
            center = listOfCenter.get(i);
            if (center.getName().equals(name))
                return i;
        }
        return -1;
    }
}
