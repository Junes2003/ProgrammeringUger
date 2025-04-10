package Uge5;

public class IntegerDivisionTypeCasthjemmeopgave {
        public static void main(String[] args) {
            //Opgave 1
            // Variabel til minut (kan være et heltal eller decimaltal)
            double minutter = 59;

            // Beregner hvor mange procentdele af en time minutværdien svarer til
            double procentAfTime = (minutter / 60.0) * 100;

                // Udskriver resultatet
        System.out.println(procentAfTime);

                //Variabel: Jeg definerer minutter som en double, så jeg kan bruge både hele og decimaltal.
                //Beregning: JEg deler minuttene med 60 for at få brøkdelen af en time, og ganger derefter med 100 for at få procenten.
                //Udskrivning: Resultatet udskrives ved hjælp af System.out.println.

//Opgave 2
                // Den her gang bruger jeg int, så der ikke er decimaler på.
         int minutterInt = 59;

                // Udskriver brøkdel af timen ved at caste muniutterne til double
         System.out.println((double)minutterInt / 60);

                // Minutvariabel: Jeg starter med en int-variabel minutter sat til 59.
                // Type cast: Ved at bruge (double) foran minutter, konverterer jeg midlertidigt minutter til en double. Dette sikrer, at divisionen bliver udført med decimaler og ikke som heltalsdivision.
                // Beregning og udskrivning: Jeg deler de typecastede minuttene med 60 og udskriver resultatet som brøkdelen af en time.

//Opgave 3
                // Her definer jeg kontanten for minutter pr. time
         final int minutterPerTime = 60;

                // minutter som int
         int minutterInt2 = 59;

                 // Beregner brøkdelen af en time ved at caste minutterne til double i beregningen
         System.out.println((double)minutterInt2 / minutterPerTime);

                 // Konstanter: Jeg definerede minutterPerTime = 60 for at undgå "magic numbers" og gøre koden lettere at vedligeholde.
                 // Type casting: Jeg lavede type casting på minutter til double i beregningen for at få decimaler.
                 // Resultat: Resultatet er det samme som i opgave 2: Brøkdel af timen, der er gået: 0.9833333333333333


//Opgave 4
                // Her derfiner jeg kontanten for minutter pr. time
         final int minutterPerTime2 = 60;

                // Minutter som int
         int minutter2 = 59;

                // Nu beregner jeg brøkdelen af time ved at bruge konstanten
                System.out.println((double)minutter2 / minutterPerTime2);
}
}