package LinkedListProject;
import java.util.Scanner;

public class ReferenceFunctionsClass {
    public  void DisplayDetails()
    {
        System.out.println("'1' to add at the beginning\n'2' to add at the end\n'3' to add at the position\n'4' to delete from the beginning\n'5' to delete from end\n'6' to delete from position\n'7' to reverse the list\n'8' to exit");
    }
    public void PerformOperations(int x)
    {
        Scanner in = new Scanner(System.in);
        int data,pos,deletedData;Boolean val=true;
        SinglyList sl =new SinglyList();
        while(val) {
            switch (x) {
                case 1:
                    System.out.print("enter the data:");
                    data = in.nextInt();
                    sl.addAtBeg(data);
                    System.out.println("successfully done");
                    break;
                case 2:
                    System.out.print("enter the data:");
                    data = in.nextInt();
                    sl.addAtEnd(data);
                    System.out.println("successfully done");
                    break;
                case 3:
                    System.out.print("enter the data:");
                    data = in.nextInt();
                    System.out.print("Enter the position:");
                    pos=in.nextInt();
                    sl.addAtPos(pos,data);
                    System.out.println("successfully done");
                    break;
                case 4:
                    System.out.println("successfully done");
                    break;
                case 5:
                    System.out.println("successfully done");
                    break;
                case 6:
                    System.out.println("successfully done");
                    break;
                case 7:
                    System.out.println("successfully done");
                    break;
                case 8:
                    val=false;
                default:
                    System.out.println("Enter valid Input");
            }
        }
    }

}
