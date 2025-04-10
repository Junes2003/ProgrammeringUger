package Uge5;

public class Tid {
    public static void main(String[] args) {
       final int seconds = 25;
       final int minutes = 18;
       final int hours = 14;

        System.out.println("sekunder: "+seconds);
        System.out.println("minutes: "+minutes);
        System.out.println("hours:"+hours);

        int sekunderSidenMidnat = (hours*60*60+minutes*60+seconds);
        System.out.println(sekunderSidenMidnat);
        int sekunderIEtDøgn = 24*60*60;
        int indtilNæsteMidnat = sekunderIEtDøgn - sekunderSidenMidnat;
        System.out.println(indtilNæsteMidnat);

        final int secondsNow = 20;
        final int minutesNow = 17;
        final int hoursNow = 15;

        System.out.println("secondsNow:"+seconds);
        System.out.println("minutesNow:"+minutes);
        System.out.println("hoursNow:"+hoursNow);

        int sekunderSidenMidnatNow = (hoursNow*60*60+minutesNow*60+secondsNow);
        System.out.println(sekunderSidenMidnatNow);
        int sekunderIEtDøgnNow = 24*60*60;
        int indtilNæsteMidnatNow = sekunderIEtDøgnNow - sekunderSidenMidnatNow;


        System.out.println();
    }

}
