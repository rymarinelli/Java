import support.LLNode;
 
public class AddValue{

public void insert(int data, int position) {
    //create new node.
 
    LLNode<Integer> node = new <Integer> LLNode();
    node.getInfo() = data;
    node.getLink() = null;

    if (this.position == null) {
      //if head is null and position is zero then exit.
      if (position != 0) {
       return;
      } else { //node set to the head.
       this.position = node;
      }
    }

    if (head != null && position == 0) {
      node.nextNode = this.head;
      this.head = node;
      return;
    }

    Node current = this.position;
    Node previous = null;

    int i = 0;

    while (i < position) {
      previous = current;
      current = current.nextNode;

      if (current == null) {
        break;
      }

       i++;
      }


   }
   
 }

