import java.util.Scanner;
import LinkedListProject.ReferenceFunctionsClass;
public class ProjectMain {

    public static void main(String[] args) {
        ReferenceFunctionsClass rf= new ReferenceFunctionsClass();
        Scanner in= new Scanner(System.in);
        int choice;
        System.out.println("'1' for SinglyLinkedList\n'2' for doublyLinkedList\n'3' for circularLinkedList");
        choice=in.nextInt();
        switch (choice)
        {
            case 1:
               rf.DisplayDetails();
               choice=in.nextInt();
               rf.PerformOperations(choice);
                break;
            case 2:
               rf.DisplayDetails();
               choice=in.nextInt();
               rf.PerformOperations(choice);
                break;
            case 3:
                rf.DisplayDetails();
                choice=in.nextInt();
                rf.PerformOperations(choice);
                break;
            default:
                System.out.println("enter valid choice");

        }
    }
}
