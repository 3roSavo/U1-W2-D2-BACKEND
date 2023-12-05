package esercizio2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        listRandomNumbers();
    }

    public static void listRandomNumbers() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listRandoms = new ArrayList<>();
        System.out.println("Inserisci il numero di interi da allocare nella lista");
        int listLength = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < listLength; i++) {
            Random rndm = new Random();
            listRandoms.add(rndm.nextInt(101));
        }
        Collections.sort(listRandoms);
        System.out.println(listRandoms);
    }
}
