//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        Node header= new Node(10);

       Node secondNode= new Node(20);

       Node thirdNode=new Node(30);


       header.next=secondNode;

       secondNode.prev=header;

       secondNode.next=thirdNode;


       thirdNode.prev=secondNode;


       Node temp= header;
       while(temp != null)
       {

           if(temp.data== thirdNode.data)
           {


               System.out.print(" third node data "+ thirdNode.data +" changed to ");
               temp.data=70;


           }
           System.out.print(temp.data);
           if(temp.next != null)
           {
               System.out.print(" ");
           }
           temp=temp.next;

       }







    }
}