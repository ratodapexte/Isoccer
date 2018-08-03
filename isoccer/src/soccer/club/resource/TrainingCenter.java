package soccer.club.resource;

import static utilities.Utilities.*;

import java.util.ArrayList;

public class TrainingCenter
{
    private int rooms;
    private String name;
    private String address;

    public TrainingCenter(int rooms,String name, String address)
    {
        this.rooms = rooms;
        this.name = name;
        this.address = address;
    }

    public static void newTrainingcenter(ArrayList<TrainingCenter> listOfCenters)
    {
        int rooms = -1;
        while (rooms <= 0)
        {
            System.out.print("Entre o numero de quartos: ");
            rooms = scanInt();
        }

        String name = askName();
        String address = askAddres();

        TrainingCenter newCenter = new TrainingCenter(rooms, name, address);

        listOfCenters.add(newCenter);
    }

    public static void searchCenter(ArrayList<TrainingCenter> listOfCenters)
    {
        System.out.println("***** Busca de centro de treinamento *****");
        String name = askName();
        for (TrainingCenter center: listOfCenters)
        {
            if(center.name.equals(name))
                System.out.printf("Centro de treinamento " + name + ".%nEndereco: " + center.address +
                        ".%nTotal de quartos: " + center.rooms + "%n");
        }
    }

    public String getName() {
        return name;
    }
}
