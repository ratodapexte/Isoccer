import soccer.club.employee.*;
import soccer.club.resource.Bus;
import soccer.club.resource.Stadium;
import soccer.club.resource.TrainingCenter;

import java.util.ArrayList;

import static utilities.Utilities.*;

public class Main
{

    public static void main(String[] args)
    {
        ArrayList<Admin> listOfAdmin = new ArrayList<>();
        ArrayList<Bus> listOfBus = new ArrayList<>();
        ArrayList<Employee> listOfEmployees = new ArrayList<>();
        ArrayList<FanSupporters> listOfFans = new ArrayList<>();
        ArrayList<Stadium> listOfStadium = new ArrayList<>();
        ArrayList<TrainingCenter> listOfCenter = new ArrayList<>();

        Admin admin = null;
        double junior = 0, senior = 0, elite = 0;
        int choice;

        while(true)
        {
            System.out.println("***** Menu de login *****");
            System.out.printf("1 - Entrar%n2 - Cadastrar%nOpcao: ");
            choice = scanInt();
            switch(choice)
            {
                case 1:
                    admin = Admin.signIn(listOfAdmin);
                    break;
                case 2:
                    Admin.signUp(listOfAdmin);
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }

            if(admin != null)
            {
                while(true)
                {
                    System.out.printf("\033[H\033[2J");
                    System.out.println("***** Menu do adm *****");
                    System.out.printf("1 - Adicionar funcuinario%n2 - Alterar contribuicao%n3 - Adicionar fa%n" +
                            "4 - Alterar tipo do fan%n5 - Verificar pagamento%n6 - Listar socios%n" +
                            "7 - Adicionar onibus%n8 - Quantidade de onibus%n9 - Listar onibus cadastrados%n" +
                            "10 - Verificar onibus%n11 - Adicionar estadio%n12 - Buscar estadio%n" +
                            "13 - Adiministrar estadio%n14 - Quantidade de estadios cadastrados%n" +
                            "15 - Adicionar centro de treinamento%n16 - Quantidade de centros%n" +
                            "17 - Buscar centros%n18 - Informações de treinadores e jogadores%n" +
                            "19 - Listar empregados%nOpcao: ");
                    choice = scanInt();
                    switch(choice)
                    {
                        case 1:
                            Employee.newEmployee(listOfEmployees);
                            break;
                        case 2:
                            System.out.print("Contribuicao Junior: ");
                            junior = scanDouble();
                            System.out.print("Contribuicao Senior: ");
                            senior = scanDouble();
                            System.out.print("Contribuicao Elite: ");
                            elite = scanDouble();
                            FanSupporters.changeContribuition(listOfFans, junior, senior, elite);
                            break;
                        case 3:
                            FanSupporters.newFanSupporter(listOfFans, junior, senior, elite);
                            break;
                        case 4:
                            FanSupporters.changeFanType(listOfFans, junior, senior, elite);
                            break;
                        case 5:
                            FanSupporters.verifyPayment(listOfFans);
                            break;
                        case 6:
                            FanSupporters.showFans(listOfFans);
                        case 7:
                            Bus.newBus(listOfBus, listOfEmployees);
                            break;
                        case 8:
                            System.out.println(listOfBus.size() + " onibus cadastrados.");
                            break;
                        case 9:
                            Bus.showBuses(listOfBus);
                            break;
                        case 10:
                            Bus.shearchBus(listOfBus);
                            break;
                        case 11:
                            Stadium.newStadium(listOfStadium);
                            break;
                        case 12:
                            Stadium.searchStadium(listOfStadium);
                            break;
                        case 13:
                            Stadium.manageStadium(listOfStadium);
                            break;
                        case 14:
                            System.out.println(listOfStadium.size() + " estadios cadastrados.");
                            break;
                        case 15:
                            TrainingCenter.newTrainingcenter(listOfCenter);
                            break;
                        case 16:
                            System.out.println(listOfCenter.size() + " centros cadastrados.");
                            break;
                        case 17:
                            TrainingCenter.searchCenter(listOfCenter);
                            break;
                        case 18:
                            Coach.showCoachs(listOfEmployees);
                            Player.showPlayers(listOfEmployees);
                            break;
                        case 19:
                            Cooker.showCookers(listOfEmployees);
                            Driver.showDrivers(listOfEmployees);
                            Lawyer.showLawyer(listOfEmployees);
                            Medic.showMedic(listOfEmployees);
                            PersonalTrainer.showPersonalTrainer(listOfEmployees);
                            President.showPrsident(listOfEmployees);
                            break;
                        case 99:
                            admin = null;
                            break;
                        default:
                            System.out.println("Opcao invalida!");
                    }
                    if(admin == null)
                        break;
                }
            }
        }

    }
}
