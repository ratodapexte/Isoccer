package soccer.club.employee;
import java.util.ArrayList;
import static utilities.Utilities.*;


public class Player extends Employee
{
    private String role;
    private boolean apt;

    public Player(String role, double salary, String name, String cpf, String phone, String email)
    {
        super(salary, name, cpf, phone, email);
        this.role = role;
    }

    public String getRole()
    {
        return this.role;
    }

    public static Player newPlayer()
    {
        System.out.println("***** Cadastro de treinador fisico *****");
        double salary = askSalary();
        String name = askName();
        String cpf = askCpf();
        String phone = askPhone();
        String role = askRole().toUpperCase();
        String email = askEmail();

        return new Player(role, salary, name, cpf, phone, email);
    }

    public static void showPlayers(ArrayList<Employee> listOfEmployee)
    {
        System.out.println("***** Lista de jogadores *****");
        for (Employee employee: listOfEmployee) {
            if(employee instanceof Player)
            {
                System.out.println("*********************************************************************************");
                System.out.println("Jogador " + employee.getName() + ", cpf " + employee.getCpf() + ", " +
                        ((Player) employee).role);
                if(((Player) employee).apt)
                    System.out.println("jogador apto.");
                else
                    System.out.println("jogador inapto.");
                System.out.println("*********************************************************************************");
            }
        }
    }


}
