import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        int choice;

        do {
            System.out.println("\n1.Add Marks");
            System.out.println("2.Update Mark");
            System.out.println("3.Subject Average");
            System.out.println("4.Student Average");
            System.out.println("5.Student Total");
            System.out.println("6.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Student ID: ");
                int s = sc.nextInt();

                System.out.print("Maths: ");
                marks[s - 1][0] = sc.nextInt();

                System.out.print("Chemistry: ");
                marks[s - 1][1] = sc.nextInt();

                System.out.print("Physics: ");
                marks[s - 1][2] = sc.nextInt();
            }

            else if (choice == 2) {
                System.out.print("Student ID: ");
                int s = sc.nextInt();

                System.out.print("Subject ID (1-3): ");
                int sub = sc.nextInt();

                System.out.print("New Mark: ");
                marks[s - 1][sub - 1] = sc.nextInt();
            }

            else if (choice == 3) {
                System.out.print("Subject ID (1-3): ");
                int sub = sc.nextInt();

                int sum = 0;
                for (int i = 0; i < n; i++) {
                    sum += marks[i][sub - 1];
                }

                System.out.println("Average = " + (sum / n));
            }

            else if (choice == 4) {
                System.out.print("Student ID: ");
                int s = sc.nextInt();

                int sum = 0;
                for (int i = 0; i < 3; i++) {
                    sum += marks[s - 1][i];
                }

                System.out.println("Average = " + (sum / 3));
            }

            else if (choice == 5) {
                System.out.print("Student ID: ");
                int s = sc.nextInt();

                int total = 0;
                for (int i = 0; i < 3; i++) {
                    total += marks[s - 1][i];
                }

                System.out.println("Total = " + total);
            }

        } while (choice != 6);

        sc.close();
    }
}