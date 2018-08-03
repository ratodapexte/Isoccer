package soccer.club.resource;

import soccer.club.employee.Driver;
import soccer.club.employee.Employee;
import utilities.Utilities;

import java.util.ArrayList;

import static utilities.Utilities.*;

public class Bus
{
    private Driver driver;
    private int number;
    private int seats;


    public Bus(Driver driver, int number, int seats)
    {
        this.driver = driver;
        this.number = number;
        this.seats = seats;
    }

    public int getNumber()
    {
        return this.number;
    }

    public Driver getDriver()
    {
        return this.driver;
    }

    public static void newBus(ArrayList<Bus> listOfBus, ArrayList<Employee> listOfEmployee)
    {
        System.out.println("***** Adicionar onibus *****");
        System.out.print("Cpf do motorista, ");
        int index = isThereEmployeeCpf(listOfEmployee);

        while (index == -1)
        {
            System.out.print("Cpf do motorista, ");
            index = isThereEmployeeCpf(listOfEmployee);
            if(index != -1)
            {
                if(listOfEmployee.get(index) instanceof Driver)
                    break;
                else
                {
                    System.out.println("Cpf nao eh de motorista");
                    index = -1;
                    return;
                }
            }
        }

        Driver driver = (Driver) listOfEmployee.get(index);
        int number = -1;
        while (number < 0)
        {
            System.out.print("Digite o numero do ônibus: ");
            number = scanInt();
        }

        int seats = -1;

        while (seats <= 0)
        {
            System.out.print("Digite a quantidade de cadeiras do ônibus: ");
            seats = scanInt();
        }

        Bus newBus = new Bus(driver, number, seats);

        listOfBus.add(newBus);
    }

    public static void showBuses(ArrayList<Bus> listOfBus)
    {
        System.out.println("***** Lista de todos os onibus *****");

        for (Bus bus: listOfBus) {
            System.out.printf("Motorista: " + bus.driver.getCpf() + ", onibus de numero" + bus.number + ". %n%n");
        }
        System.out.println("*****************************************************************************************");
    }

    public static void shearchBus(ArrayList<Bus> listOfBus)
    {
        int index = getBusIndex(listOfBus);

        if(index != -1)
            System.out.printf("Motorista: " + listOfBus.get(index).driver.getCpf() + ", onibus de numero" +
                    listOfBus.get(index).number + ". %n%n");
        else
            System.out.println("Onibus nao encontrado.");
        System.out.println("*****************************************************************************************");
    }
    public static int getBusIndex(ArrayList<Bus> listOfBus)
    {
        System.out.println("***** Busca onibus por numero *****");
        System.out.print("Numero do onibus: ");
        int number = scanInt();
        for (Bus bus : listOfBus){
            if (bus.number == number)
                return listOfBus.indexOf(bus);
        }
        return -1;
    }
}
