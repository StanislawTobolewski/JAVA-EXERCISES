package pl.brave_art;

/*"Cześć mam do wykonania takie zadanie, pomoże ktoś lub naprowadzi trochę ? Treść zadania:
Napisz program, który wczytuje od użytkownika liczbę oznaczającą, ile należy wylosować liczb z zakresu -100 do 100.
Następnie dokonuje obliczeń stosunku liczby wylosowanych liczb dodatnich (bez zera) do liczb ujemnych oraz wyświetla
najmniejszą i największą znalezioną liczbę. Wynikiem działania programu ma być informacja na temat wszystkich trzech wartości.
Przykład dla liczby podanej przez użytkownika 3, następuje losowanie, np:
11 -5 93
W wyniku na ekran zostaje wyświetlona informacja:
2 -5 93
// bo stosunek 2 (2 liczby dodatnie / 1 liczba ujemna) oraz min: -5, max: 93
Dzięki z góry!"*/

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {    //CATCH EXCEPTION IF USER INPUT IS NOT A NUMBER
            //-----------USER INPUT HERE -----------------
            int userInput = 0;
            System.out.print("Podaj ilość liczb do wylosowania: ");
            Scanner scan = new Scanner(System.in);

            userInput = scan.nextInt();

            userInput = Math.abs(userInput);  //USER INPUT ABSOLUT VALUE IF HE GIVE NEGATIVE NUMBER
            //----------- PLUS & MINUS NUMBERS COUNTERS
            int minus = 0, plus=0;
            //----------- MIN AND MAX VALUE TO FIND DEFINITION
            int max = 0, min = 0;

            int maxRandomValue = 100;       // RANDOM LIMIT
            Random random = new Random();
            int[] generatedNumbers = new int[userInput];

            //----------------RANDOM NUMBERS GENERATION --------------------

            System.out.printf("\nWylosowane liczby: ");
            for (int i = 0; i < userInput; i++)
            {
                generatedNumbers[i] = random.nextInt(maxRandomValue) * (random.nextBoolean() ? -1 : 1);         //GENERATE RANDOM * 1 OR -1
                if(generatedNumbers[i]>0)
                {
                    plus++;
                }else{
                    minus++;
                }
                System.out.print(generatedNumbers[i] + ", ");       //PRINT GENERATED NUMBER IN LOOP
            }
            //------------ FIND MIN AND MAX --------------
            for(int i=0;i<userInput;i++)
            {
                if(generatedNumbers[i]>max)
                {
                    max = generatedNumbers[i];
                }
                else if(generatedNumbers[i]<min)
                {
                    min = generatedNumbers[i];
                }
            }
            //------------ OUTPUT INFO ---------------
            System.out.println("\n\nStosunek wylosowanych liczb ( + / - ):  " + plus + " / " + minus);
            System.out.println("\nWartość MAX = " + max + "\nWartość MIN = " + min);

            scan.close();
            //------------ INFO IF INPUT VALUE IS NOT A NUMBER ----------------
        }catch (InputMismatchException e){
            System.out.println("Podana wartośc nie jest liczbą");
        }
    }
}