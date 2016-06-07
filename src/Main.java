import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {


    public static void main(String[] args) {

        ArrayList<String> disneyLadies = new ArrayList<String>();
        disneyLadies.add("Aurora");
        disneyLadies.add("Cinderella");
        disneyLadies.add("Belle");
        disneyLadies.add("Pocahontas");
        disneyLadies.add("Ariel");
        disneyLadies.add("Belle");

        System.out.println("Number of Disney Ladies listed: " + disneyLadies.size() + System.lineSeparator());

        System.out.println("The Disney Ladies listed are: " + System.lineSeparator() + disneyLadies.get(0));
        System.out.println(disneyLadies.get(1));
        System.out.println(disneyLadies.get(2));
        System.out.println(disneyLadies.get(3));
        System.out.println(disneyLadies.get(4));
        System.out.println(disneyLadies.get(5));

        System.out.println(System.lineSeparator() + "* removing Belle from list *");
        disneyLadies.remove(2);
        System.out.println("Number of Disney Ladies now: " + disneyLadies.size() + System.lineSeparator());

        for (int i = 0; i < disneyLadies.size(); i++) {
            System.out.println(disneyLadies.get(i) + System.lineSeparator());
        }


        System.out.println("* clearing list entirely *");

        disneyLadies.clear();
        System.out.println("Number of Disney Ladies listed after clear: " + disneyLadies.size() + System.lineSeparator());


        StringBuilder myString = new StringBuilder();
        myString.append("andrea ");
        myString.append("is ");
        myString.append("learning ");
        myString.append("lots ");

        System.out.println(myString);

    }




}
// yay!!
