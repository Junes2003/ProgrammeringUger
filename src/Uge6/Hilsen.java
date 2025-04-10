package Uge6;

public class Hilsen {
    public static void main(String[] args) {
        String Name= "Signe";
        String word = "hej";
        String fullTekst = getFullTekst (Name,word);
        String hej = getFullTekst("Ali","Mo");
        System.out.println(hej);
        System.out.println(fullTekst);
    }
    public static String getFullTekst (String Name, String Word){
        String fullTekst= Word + " " + Name;
        return fullTekst;
    }

}