import java.util.Scanner;

public class studentdatabaseapp {
    public static void main(String[] args) {
//        Student stu1 = new Student();
//        stu1.enroll();
//        stu1.payTuition();
//        System.out.println(stu1.toString());


        // Demander combien d'uilisateur on veut ajouter
        System.out.println("Entrez le nombre d'eleves a incrire : ");
        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        Student[] etudiants = new Student[numOfStudents];

        // Creer n nombre de nouveau etudiants
        for ( int n = 0 ; n < numOfStudents; n++){
            etudiants[n] = new Student();
            etudiants[n].enroll();
            etudiants[n].payTuition();



        }

        for ( int n = 0 ; n < numOfStudents; n++){
            System.out.println("");
            System.out.println(etudiants[n].toString());
            System.out.println("");
        }

    }
}