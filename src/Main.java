import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        int jos;
        do{
            System.out.println("1. Dodaj studenta");
            System.out.println("2. Pretraga po indeksu");
            System.out.println("3. Ispisi sve studente");
            System.out.println("4. Izlaz");
            Scanner scanner=new Scanner(System.in);
            jos=scanner.nextInt();
            switch(jos){
                case 1:
                    Evidencija evidencija=new Evidencija();
                    evidencija.addStudent();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    exit(0);
                    break;

            }
        }while(jos!=4);
    }
}