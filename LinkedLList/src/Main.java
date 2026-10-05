//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



//        Node header= new Node(10);
//
//       Node secondNode= new Node(20);
//
//       Node thirdNode=new Node(30);
//
//
//       header.next=secondNode;
//
//       secondNode.prev=header;
//
//       secondNode.next=thirdNode;
//
//
//       thirdNode.prev=secondNode;
//
//
//       Node temp= header;
//       while(temp != null)
//       {
//
//           if(temp.data== thirdNode.data)
//           {
//
//
//               System.out.print(" third node data "+ thirdNode.data +" changed to ");
//               temp.data=70;
//
//
//           }
//           System.out.print(temp.data);
//           if(temp.next != null)
//           {
//               System.out.print(" ");
//           }
//           temp=temp.next;
//
//       }





        //Circular LinkedList

        CreateCircularLinkedList node1=new CreateCircularLinkedList(100);


        CreateCircularLinkedList node2=new CreateCircularLinkedList(200);
        CreateCircularLinkedList node3=new CreateCircularLinkedList(300);
        CreateCircularLinkedList node4=new CreateCircularLinkedList(400);
        CreateCircularLinkedList node5=new CreateCircularLinkedList(500);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node1;

        //traversal circulerLInkedList

        TraversalCircularSingleLinkedList traversal =new TraversalCircularSingleLinkedList(node1);


  //insertNode at Beginning

        CreateCircularLinkedList newNode= new CreateCircularLinkedList(600);
        node5.next=newNode;
        newNode.next=node1;
        System.out.println();
        System.out.println(" inserting node at begining");

        TraversalCircularSingleLinkedList traversal1= new TraversalCircularSingleLinkedList(newNode);




        //insert node at End

        CreateCircularLinkedList lastNode= new CreateCircularLinkedList(700);
        node5.next= lastNode;
        lastNode.next=newNode;

        System.out.println();
        System.out.println(" inserting node at last");

        TraversalCircularSingleLinkedList traversal2= new TraversalCircularSingleLinkedList(newNode);





        //delete a node by value
        System.out.println();
        System.out.println("Delete Node");
        int deletevalue= 400;

     deleteNode d= new deleteNode();
        System.out.println(d.execute(deletevalue,newNode));
        TraversalCircularSingleLinkedList traversalDelete = new TraversalCircularSingleLinkedList(newNode);


    }
}