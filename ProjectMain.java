import java.util.Scanner;

public class ProjectMain {
    public static void DisplayDetails()
    {
        System.out.println("'1' to add at the beginning\n'2' to add at the end\n'3' to add at the position\n'4' to delete from the beginning\n'5' to delete from end\n'6' to delete from position\n'7' to reverse the list");
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int choice;
        System.out.println("'1' for SinglyLinkedList\n'2' for doublyLinkedList\n'3' for circularLinkedList");
        choice=in.nextInt();
        switch (choice)
        {
            case 1:
                DisplayDetails();
                break;
            case 2:
                DisplayDetails();
                break;
            case 3:
                DisplayDetails();
                break;
            default:
                System.out.println("enter valid choice");

        }
    }
}
