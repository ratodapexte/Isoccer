package soccer.club.employee;

import utilities.Utilities;

import java.util.ArrayList;

import static utilities.Utilities.scanInt;

public abstract class Employee
{
    private double salary;
    private String name;
    private String cpf;
    private String phone;
    private String email;

    public Employee(double salary, String name, String cpf, String phone, String email)
    {
        this.salary = salary;
        this.name = name;
        this.cpf = cpf;
        this.phone = phone;
        this.email = email;
    }

    public String getCpf()
    {
        return this.cpf;
    }

    public String getName() {
        return name;
    }

    public static void newEmployee(ArrayList<Employee> listOfEmployee)
    {
        System.out.println("***** Cadastro de empregado *****");
        System.out.printf("Tipos:%n1 - Presidente%2 - Medico%n3 - Tecnico%n4 - Preparador Fisico%n5 - Motorista%n" +
                "6 - Cozinheiro%n7 - Advogado%n8 - Jogador");
        int choice = scanInt();

        switch(choice) {
            case 1:
                President newPresident = President.newPresident();
                listOfEmployee.add(newPresident);
                break;
            case 2:
                Medic newMedic = Medic.newMedic();
                listOfEmployee.add(newMedic);
                break;
            case 3:
                Coach newCoach = Coach.newCoach();
                listOfEmployee.add(newCoach);
                break;
            case 4:
                PersonalTrainer newTrainer = PersonalTrainer.newPersonalTrainer();
                listOfEmployee.add(newTrainer);
                break;
            case 5:
                Driver newDriver  = Driver.newDriver();
                listOfEmployee.add(newDriver);
                break;
            case 6:
                Cooker newCooker = Cooker.newCooker();
                listOfEmployee.add(newCooker);
                break;
            case 7:
                Lawyer newLawyer = Lawyer.newLawyer();
                listOfEmployee.add(newLawyer);
                break;
            case 8:
                Player newPlayer = Player.newPlayer();
                listOfEmployee.add(newPlayer);
                break;
            default:
                System.out.println("Opcao invalida, operacao cancelada!");
        }
    }
}
