import static utilities.Utilities.*;
import java.util.ArrayList;

public class FanSupporters
{
    private double contribuition;
    private int paymentDay;
    private String addres;
    private String cpf;
    private String name;
    private String phone;
    private String status;
    private FanType type;

    public FanSupporters(double contribuition, int paymentDay, String addres, String cpf, String name, String phone,
                         FanType type, String status)
    {
        this.paymentDay = paymentDay;
        this.contribuition = contribuition;
        this.addres = addres;
        this.cpf = cpf;
        this.name = name;
        this.phone = phone;
        this.type = type;
        this.status = status;
    }

    public static void changeContribuition(ArrayList<FanSupporters> listOfFan, double junior, double senior,
                                           double elite)
    {
        for (FanSupporters fan: listOfFan) {
            switch (fan.type)
            {
                case JUNIOR:
                    fan.contribuition = junior;
                    break;
                case SENIOR:
                    fan.contribuition = senior;
                    break;
                case ELITE:
                    fan.contribuition = elite;
            }
        }
    }

    public static void newFanSupporter(ArrayList<FanSupporters> listOfFan, double junior, double senior, double elite) {
        System.out.println("***** Cadastro do socio *****");
        String name = askName();
        String cpf = askCpf();
        String phone = askPhone();
        String addres = askAddres();
        FanType type;
        System.out.printf("Escolha o tipo do socio:%n1 - Junior%2 - Senior%n3 - Elite%nOpcao: ");
        int choice;
        double contribuition;
        while(true)
        {
            choice = scanInt();

            if(choice == 1)
            {
                type = FanType.JUNIOR;
                contribuition = junior;
                break;
            }
            else if(choice == 2)
            {
                type = FanType.SENIOR;
                contribuition = senior;
                break;
            }
            else if(choice == 3)
            {
                type = FanType.ELITE;
                contribuition = elite;
                break;
            }
            else
                System.out.printf("Entre com a opcao correta!!!%nOpcao: ");
        }

        String status = "ADIPLENTE";

        System.out.println("Entre o dia de pagamento: ");
        int paymentDay = scanInt();

        FanSupporters fan = new FanSupporters(contribuition, paymentDay, addres, cpf, name, phone, type, status);

        listOfFan.add(fan);
    }

    public static void changeFanType(ArrayList<FanSupporters> listOfFan, double junior, double senior, double elite)
    {
        int index = getFanByCpf(listOfFan);
        if(index != -1)
        {
            System.out.printf("Status do fan sera alterado!" +
                    "%n Deseja continuar? (s/N)");
            String choice = scanString();

            if(choice.toUpperCase().equals("S"))
            {
                System.out.print("Digite uma das opcoes: junior, senior ou elite");
                choice = scanString();

                if(choice.toUpperCase().equals("JUNIOR")){
                    listOfFan.get(index).type = FanType.JUNIOR;
                    listOfFan.get(index).contribuition = junior;
                }
                else if(choice.toUpperCase().equals("SENIOR")){
                    listOfFan.get(index).type = FanType.SENIOR;
                    listOfFan.get(index).contribuition = senior;
                }
                else if(choice.toUpperCase().equals("ELITE")){
                    listOfFan.get(index).type = FanType.ELITE;
                    listOfFan.get(index).contribuition = elite;
                }
                else
                    System.out.println("Escolha inválida! Dados mantidos.");
            }
            else
                System.out.println("Escolha inválida! Dados mantidos.");
        }
        else
            System.out.println("Socio nao encontrado.");
    }

    public static  void verifyPayment(ArrayList<FanSupporters> listOfFan)
    {
        int index = getFanByCpf(listOfFan);
        if(index != -1) {
            System.out.printf("Socio faz o pagamento no dia " + listOfFan.get(index).paymentDay +
                    ". Verificar se foi pago.");
            System.out.print("Foi feito o pagamento? (s/N)");
            String choice = scanString();

            if (choice.toUpperCase().equals("S")) {
                listOfFan.get(index).status = "ADIPLENTE";
            } else if (choice.toUpperCase().equals("N")) {
                listOfFan.get(index).status = "INADIPLENTE";
            } else
                System.out.println("Escolha inválida! Dados mantidos.");
        }
        else
            System.out.println("Socio nao encontrado.");
    }

    public static void showFans(ArrayList<FanSupporters> listOfFan)
    {
        System.out.println("***** Socios *****");

        System.out.printf("Clube tem um total de " + listOfFan.size() + " socios.%n%n");

        System.out.printf("Socios Inadiplentes: %n%n");

        for (FanSupporters fan: listOfFan){
            if (fan.status.equals("INADIPLENTE"))
                System.out.printf("Nome: " + fan.name + ", cpf: " + fan.cpf + ", contribuicao: " + fan.contribuition
                        + "%n%n");
        }

        System.out.printf("Socios Adiplentes: %n%n");

        for (FanSupporters fan: listOfFan){
            if (fan.status.equals("ADIPLENTE"))
                System.out.printf("Nome: " + fan.name + ", cpf: " + fan.cpf + ", contribuicao: " + fan.contribuition
                        + "%n%n");
        }
    }

    public  static int getFanByCpf(ArrayList<FanSupporters> listOfFan)
    {
        System.out.println("***** Busca socio por cpf *****");
        String cpf = askCpf();
        for (FanSupporters fan: listOfFan) {
            if (fan.cpf.equals(cpf))
                return listOfFan.indexOf(fan);
        }
        return -1;
    }
}
