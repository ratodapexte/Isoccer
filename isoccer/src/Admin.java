import java.util.ArrayList;
import utilities.*;

public class Admin
{
    private String logIn;
    private String password;

    public Admin(String logIn, String password)
    {
        this.logIn = logIn;
        this.password = password;
    }

    public static void signUp(ArrayList<Admin> listOfAdmin)
    {
        String login = Utilities.askLogin();
        while (isThereAdmLogin(listOfAdmin, login) != -1)
        {
            System.out.println("Login já cadastrado!");
            login = Utilities.askLogin();
        }
        String password = Utilities.askPassword();

        Admin newAdm = new Admin(login, password);

        listOfAdmin.add(newAdm);
    }

    public static Admin signIn(ArrayList<Admin> listOfAdmin)
    {
        String login = Utilities.askLogin();
        int index = isThereAdmLogin(listOfAdmin, login);
        if(index != -1)
        {
            String password = Utilities.askPassword();
            if(listOfAdmin.get(index).password.equals(password))
                return listOfAdmin.get(index);
        }
        System.out.println("Adiministrador nao cadastrado");
        return null;
    }

    private static int isThereAdmLogin(ArrayList<Admin> list, String string)
    {
        for (int i = 0; i < list.size(); i++)
        {
            Admin adm = list.get(i);
            String login = adm.logIn;
            if(login.equals(string))
                return i;
        }
        return -1;
    }
}
