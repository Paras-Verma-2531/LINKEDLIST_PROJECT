import java.util.Scanner;
import LinkedListProject.ReferenceFunctionsClass;
import LinkedListProject.SinglyList;
public class ProjectMain {

    public static void main(String[] args) {
        ReferenceFunctionsClass rf= new ReferenceFunctionsClass();
        Scanner in= new Scanner(System.in);
        int choice;
        System.out.println("'1' for SinglyLinkedList\n'2' for doublyLinkedList\n'3' for circularLinkedList");
        choice=in.nextInt();Boolean val =true;
        switch (choice)
        {
            case 1:
                SinglyList sl= new SinglyList();
                while (val) {
                    rf.DisplayDetails();
                    choice = in.nextInt();
                    val=rf.PerformOperations(choice,sl);
                }
                break;
            case 2:
               rf.DisplayDetails();
               choice=in.nextInt();
               //rf.PerformOperations(choice,sl);
                break;
            case 3:
                rf.DisplayDetails();
                choice=in.nextInt();
                //rf.PerformOperations(choice,sl);
                break;
            default:
                System.out.println("enter valid choice");

        }
    }
}
