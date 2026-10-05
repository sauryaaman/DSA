public class TraversalCircularSingleLinkedList {

    public TraversalCircularSingleLinkedList(CreateCircularLinkedList head) {
        CreateCircularLinkedList temp = head;
        do

        {
            if (temp != null) {
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
        }while(temp!=head);
    }


}

