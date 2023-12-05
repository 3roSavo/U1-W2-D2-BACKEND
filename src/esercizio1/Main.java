package esercizio1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero di elementi da inserire");
        int num = scanner.nextInt();
        scanner.nextLine(); //così svuoto il buffer, perchè nextInt non consuma completamente la riga dopo l'input del numero, lasciando un carattere nella nuova linea
        // oppure fai direttamente --> int num = Integer.parseInt(scanner.nextLine());

        Set<String> listaParole = new HashSet<>();
        Set<String> listaParoleDuplicate = new HashSet<>();

        for (int i = 1; i <= num; i++) {
            System.out.println("Inserisci la parola per  l'elemento " + i);
            String parolaScelta = scanner.nextLine();
            boolean added = listaParole.add(parolaScelta); // due cose succedono qua : se parolaScelta non è presente nella lista viene aggiunta
            if (added == false) {                          //alla lista e ritorna true, al contrario non viene aggiunta e ritorna false
                listaParoleDuplicate.add(parolaScelta);    // QUINDI non serve un else con listaParole.add(parolaScelta);
            }
            System.out.println(added);
        }



        System.out.println("numero parole distinte : " + listaParole.size());
        System.out.println("lista parole distinte : " + listaParole);
        System.out.println("lista parole duplicate : " + listaParoleDuplicate);
        scanner.close();


















        /*
        Student matteo = new Student("Matteo", "Poretti", 23);
        Student giovanni = new Student("Giovanni", "Rizzo",48);
        Student vincenzo = new Student("Vincenzo", "Portesan", 36);

        Student[] listaStudenti = {matteo,giovanni,vincenzo};



        //Student[] listaStudenti = new Student[3];
        //listaStudenti[0] = matteo;
        //listaStudenti[1] = giovanni;
        //listaStudenti[2] = vincenzo;

        //OPPURE IN MANIERA PIU' VELOCE
        Student[] listaStudenti = {matteo,giovanni,vincenzo};

        System.out.println(Arrays.toString(listaStudenti));

        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int numRandom = random.nextInt(1,11);
            int deded = random.nextInt();
            System.out.println(numRandom);
            System.out.println(deded);
        }


        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(giovanni);
        studentList.add(vincenzo);
        studentList.add(0, new Student("Eros", "Savogin", 26));
        studentList.add(new Student("Renato", "Businaro", 44));

        System.out.println(studentList);

        System.out.println(studentList.size());

        ArrayList<Student> listaStudenti2 = new ArrayList<>(Arrays.asList(listaStudenti));
        System.out.println(listaStudenti2);

        //FOR ALTERNATIVO
        for (Student alunno : studentList) {
            System.out.println("provaa");
        }


        //GET
        try {
            Student terzoStudente = studentList.get(2); //eros l'ho innestato al primo posto quindi gli altri elementi slittano in avanti
            System.out.println("il terzo studente è " + terzoStudente);
            System.out.println("l'indice dello studente Vincenzo è : " + studentList.indexOf(vincenzo));
        } catch (IndexOutOfBoundsException ex) {
            System.err.println(ex.getMessage());
        }


        //CONTAINS
        studentList.add(matteo);

        if (studentList.contains(matteo)) {
            System.out.println("la lista contiene " + matteo.name);
        } else {
            System.out.println("la lista non contiene " + matteo.name);
        }

         */
    }

}
