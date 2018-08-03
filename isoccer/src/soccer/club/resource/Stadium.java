package soccer.club.resource;

import java.util.ArrayList;

import static utilities.Utilities.*;

public class Stadium
{
    private int chairs;
    private int toilets;
    private int snackBar;
    private String name;
    private String address;

    public Stadium(int chairs, int toilets, int snackBar, String name, String address)
    {
        this.chairs = chairs;
        this.toilets = toilets;
        this.snackBar = snackBar;
        this.name = name;
        this.address = address;
    }

    public static void newStadium(ArrayList<Stadium> listOfStadium)
    {
        System.out.println("Digite o nome do estadio: ");
        String name = askName();
        int index = isThereStadiumByName(listOfStadium, name);
        while(index != -1)
        {
            System.out.println("Nome já cadastrado!");
            System.out.println("Digite o nome do estadio: ");
            name = askName();
            index = isThereStadiumByName(listOfStadium, name);
        }

        System.out.println("Digite o endereco: ");
        String address = askAddres();

        System.out.println("Digite o numero de cadeiras: ");
        int chairs = scanInt();
        while (chairs <= 0)
        {
            System.out.println("Digite o numero de cadeiras: ");
            chairs = scanInt();
        }


        System.out.println("Digite o numero de banheiros: ");
        int toilets = scanInt();
        while (toilets <= 0)
        {
            System.out.println("Digite o numero de banheiros: ");
            toilets = scanInt();
        }

        System.out.println("Digite o numero de lanchonetes: ");
        int snackBar = scanInt();
        while (snackBar <= 0)
        {
            System.out.println("Digite o numero de lanchonetes: ");
            snackBar = scanInt();
        }

        Stadium newStadium = new Stadium(chairs, toilets, snackBar, name, address);
        listOfStadium.add(newStadium);
    }

    public static void searchStadium(ArrayList<Stadium> listOfStadium)
    {
        System.out.println("Digite o nome do estadio: ");
        String name = askName();
        int index = isThereStadiumByName(listOfStadium, name);

        if(index != -1)
            System.out.println("Stadio: " + listOfStadium.get(index).name + ",cadeiras: " +
                    listOfStadium.get(index).chairs + ", banheiro: " + listOfStadium.get(index).toilets +
                    "lanchonetes: " + listOfStadium.get(index).snackBar);
        else
            System.out.println("Estadio nao encontrado!!");
    }

    public static void manageStadium(ArrayList<Stadium> listOfStadium)
    {
        System.out.println("***** Alterar dados do estadio *****");
        System.out.println("Digite o nome do estadio: ");
        String name = askName();
        int index = isThereStadiumByName(listOfStadium, name);

        if(index != -1)
        {
            System.out.println("Digite o numero de cadeiras: ");
            int chairs = scanInt();
            while (chairs <= 0)
            {
                System.out.println("Digite o numero de cadeiras: ");
                chairs = scanInt();
            }

            System.out.println("Digite o numero de banheiros: ");
            int toilets = scanInt();
            while (toilets <= 0)
            {
                System.out.println("Digite o numero de banheiros: ");
                toilets = scanInt();
            }

            System.out.println("Digite o numero de lanchonetes: ");
            int snackBar = scanInt();
            while (snackBar <= 0)
            {
                System.out.println("Digite o numero de lanchonetes: ");
                snackBar = scanInt();
            }

            listOfStadium.get(index).chairs = chairs;
            listOfStadium.get(index).toilets = toilets;
            listOfStadium.get(index).snackBar = snackBar;
        }
        else
            System.out.println("Estadio nao encontrado!!");
    }

    public static int isThereStadiumByName(ArrayList<Stadium> listOfStadium, String name)
    {
        Stadium stadium;
        for (int i = 0; i < listOfStadium.size(); i++) {
            stadium = listOfStadium.get(i);
            if (stadium.name.equals(name))
                return i;
        }
        return -1;
    }



}
