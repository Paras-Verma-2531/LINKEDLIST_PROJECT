package LinkedListProject;
import java.util.Scanner;

public class ReferenceFunctionsClass {
    /*
    ReferenceFunctionsClass is a class which includes utility methods::
    such as displayDetails()[ which displays the details such as operations that can be performed etc]
    and performOperations (such as insertion,display, deletion ,reverse etc]
     */
    public void DisplayDetails() {
        System.out.println("'1' to add at the beginning\n'2' to add at the end\n'3' to add at the position\n'4' to delete from the beginning\n'5' to delete from end\n'6' to delete from position\n'7' to reverse the list\n'8' to Display\n'9' to exit");
    }

    public Boolean PerformOperations(int x,SinglyList sl) {
        Scanner in = new Scanner(System.in);
        int data, pos, deletedData,res;
        switch (x) {
            case 1:
                System.out.print("enter the data:");
                data = in.nextInt();
                sl.addAtBeg(data);
                System.out.println(data+" is successfully added");
                break;
            case 2:
                System.out.print("enter the data:");
                data = in.nextInt();
                sl.addAtEnd(data);
                System.out.println(data+" is successfully added");
                break;
            case 3:
                System.out.print("enter the data:");
                data = in.nextInt();
                System.out.print("Enter the position:");
                pos = in.nextInt();
                res=sl.addAtPos(pos, data);
                System.out.println(res==0?data+"is successfully added to the "+pos+ " positiion":"invalid position");
                break;
            case 4:
                res=sl.deleteFromBeg();
                System.out.println(res==-1?"List is Empty":" The deleted data is : "+res);
                break;
            case 5:
                res=sl.deleteFromEnd();
                System.out.println(res==-1?"List is Empty":" The deleted data is : "+res);
                break;
            case 6:
                System.out.println("successfully done");
                break;
            case 7:
                res=sl.reverse();
                System.out.println(res==-1?"List is Empty":"Successfully reversed");
                break;
            case 8:
                sl.Display();
               break;
            case 9:
                return false;
            default:
                System.out.println("Enter valid Input");
        }System.out.println("\t\t*****************************************");
        return true;
    }
}

