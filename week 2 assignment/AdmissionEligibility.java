import java.util.Scanner;

public class AdmissionEligibility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Arrays to store the marks of the students
        int[] mathMarks = new int[n];
        int[] physicsMarks = new int[n];
        int[] chemistryMarks = new int[n];

        // Reading marks for each student
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");

            System.out.print("Mathematics: ");
            mathMarks[i] = scanner.nextInt();

            System.out.print("Physics: ");
            physicsMarks[i] = scanner.nextInt();

            System.out.print("Chemistry: ");
            chemistryMarks[i] = scanner.nextInt();
        }

        // student's marks to determine eligibility
        System.out.println("\nEligible candidates:");
        for (int i = 0; i < n; i++) {
            int math = mathMarks[i];
            int physics = physicsMarks[i];
            int chemistry = chemistryMarks[i];
            
            int total = math + physics + chemistry;
            int mathPhysicsTotal = math + physics;

            if (math >= 60 && physics >= 50 && chemistry >= 40 && (total >= 200 || mathPhysicsTotal >= 150)) {
                System.out.println("Student " + (i + 1) + ": Mathematics=" + math +
                                   ", Physics=" + physics + ", Chemistry=" + chemistry);
            }
        }

        scanner.close();
    }
}
