import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses="";
    private int tuitionBalance = 0;
    private int costOfCourse = 600;
    private static int id = 1000;

    Scanner sc = new Scanner(System.in);

    // Constructor : prompt user to enter name and year
    public Student(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez votre prénom : ");
        this.firstName = sc.nextLine();

        System.out.println("Entrez votre nom : ");
        this.lastName = sc.nextLine();

        System.out.println("Entrez votre grade :\n 1 - pour Junior \n 2 - pour Amateur \n 3 - pour Senior \n 4 - pour Expert");
        this.gradeYear = sc.nextInt();

        setStudentID();
        System.out.println(firstName+" "+lastName+" "+gradeYear +" "+ studentID);


    }

    // Genere un ID
    private void setStudentID(){
        id++;
        this.studentID = gradeYear + " " + id;
    }

    // Enroll in courses
    public void enroll(){
        do {
            System.out.println("Entrer le cour que vous souhaitez suivre (Q to quit) :");
            String course = sc.nextLine();
            if (!course.equals("Q")) {  // Important to equals
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else { break ;}
        } while (1 != 0);
//        System.out.println("INSCRIT A : " + courses);
        System.out.println("BALANCE CREDIT : " + tuitionBalance);
    }

    // View balance
    public void viewBalance(){
        System.out.println("Votre solde est de : "+tuitionBalance+" €");
    }

    // Pay frais scolarité
    public void payTuition(){
        viewBalance();
        System.out.println("Entrez votre payment");
        int payment = sc.nextInt();
        tuitionBalance -= payment;
        System.out.println("Merci pour votre payment de : " + payment + " €");
        viewBalance();
    }

    // Show status
    public String toString(){
        return "Nom : " + firstName + " " + lastName +
                "\n Niveaux : " + gradeYear +
                "\n ID Etudiant : " + studentID+
                "\n Cours Inscrit : " + courses +
                "\n Balance : "+tuitionBalance + " €";
    }
}
