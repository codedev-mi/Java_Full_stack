import java.util.Scanner;

public class StudentManagementSystem{
    static Scanner sc = new Scanner(System.in);
    static final int MAX = 10;
    static int[] ids = new int[MAX];
    static String[] names = new String[MAX];
    static int[] marks = new int[MAX];
    static String[] course= new String[MAX];
    static int count = 0;
    public static void main(String args[]){
    boolean isRunning = true;
    int choice;

    while(isRunning){
    System.out.println("-------------------------");
    System.out.println("Student Management System");
    System.out.println("-------------------------");
    System.out.println("1.Add Student");
    System.out.println("2.Show Student");
    System.out.println("3.Update Student");
    System.out.println("4.Delete Student");
    System.out.println("5.Search Student");
    System.out.println("6.Exit");
    System.out.println("-------------------------");

    System.out.println("Enter your choice (1-6): ");
    choice = sc.nextInt();

    switch (choice) {
        case 1 -> add();
        case 2 -> show();
        case 3 -> update();
        case 4 -> delete();
        case 5 -> search();
        case 6 -> System.out.println("Exit Successfully.");
        default -> System.out.println("INVALID CHOICE");
    }
    }
    sc.close();
    }

    static void add(){
        if(count >= MAX){
            System.err.println("Student array is full.");
            return;
        }

        System.out.print("Enter ID: ");
        ids[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        names[count] = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        course[count] = sc.nextLine();

        count++;
        System.err.println("Student added successfully.\n");
    }

    static void show(){
        if(count == 0){
            System.out.println("No student present.");
        return;
        }

        System.out.println("-----Student List-----");
        for(int i = 0; i < count; i++){
            System.out.println("ID: " + ids[i] + ", Name: " + names[i] + ", Marks: " + marks[i] + ", Course: " + course[i]);
        }
    }

    static void update(){
        System.out.println("Enter Id to update");
        int targetId = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < count; i++){
            if(ids[i] == targetId){
                System.out.print("New ID: ");
                ids[i] = sc.nextInt();
                sc.nextLine();

                System.out.println("New Name: ");
                names[i] = sc.nextLine();

                System.out.println("New Marks: ");
                marks[i] = sc.nextInt();
                sc.nextLine();

                System.out.println("New course: ");
                course[i] = sc.nextLine();

                System.out.println("Updated successfully.\n");
                return;
            }
        }
    }

    static void delete(){
        System.out.println("Enter ID to Delete: ");
        int targetId = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < count; i++) {
            if(ids[i] == targetId){
                for(int j = i; j < count - 1; j++){
                ids[j] = ids[j+1];
                names[j] = names[j+1];
                marks[j] = marks[j+1];
                course[j] = course[j+1];
            }
            count--;
            System.out.println("Deleted successfully.\n");
            return;
            }
        }
        System.out.println("ID not found.\n");
    }

    static void search(){
        System.out.println("Enter ID to search: ");
        int targetId = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < count; i++) {
            if(ids[i] == targetId) {
                System.out.println("ID: " + ids[i] + ", Name: " + names[i] + ", Marks: " + marks[i] + ", Course: " + course[i]);
                return;
            }
        }
        System.out.println("ID not found.\n");
    }
}