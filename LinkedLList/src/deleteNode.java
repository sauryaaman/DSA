

    public class deleteNode {


        public  CreateCircularLinkedList execute(int data, CreateCircularLinkedList head) {

            if (head == null) {
                System.out.println("emty node");
                return null;
            }

            CreateCircularLinkedList temp = head;
            CreateCircularLinkedList prev = null;


            if (temp.data == data) {

                if (head.next == head) {
                    return null;
                }


                CreateCircularLinkedList tail = head;
                while (tail.next != head) {
                    tail = tail.next;
                }

                head = head.next;
                tail.next = head;
                return head;
            }


            do {
                prev = temp;
                temp = temp.next;

                if (temp.data == data) {
                    prev.next = temp.next;
                    break;
                }
            } while (temp != head);

            return head;
        }
    }




