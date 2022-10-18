import java.util.LinkedList;
import java.util.Queue;

public class QueueLL<Type> {
    //QueueLL<String> myQ = new QueueLL();


    private LinkedList<Type> linkedList;

    public QueueLL(){
        // the Type in the initialization of linkedList is optional bc it was put in the declaration
        linkedList = new LinkedList<Type>();
    }

    public Type enQueue(Type item) {
        linkedList.add(item);
        return item;
    }

    public Type deQueue(){
        Type firstItem = linkedList.getFirst();
        linkedList.removeFirst();
        return firstItem;
    }

    public Type peek(){
        // for this, do i need to still follow the: can only add and remove objects rule by trying to add an object to a new LL and seeing if it is null?

        // can only use getFirst or get the object at index 0, but can get objects from any index with a stack
        return linkedList.getFirst();
    }

    public void display(){
        for(int i = 0; i < linkedList.size(); i++){
            System.out.println(linkedList.get(i));
        }
        /*
        LinkedList<Type> newLL = new LinkedList<Type>();
        while(peek() != null){
            // does this automatically print out the memory location for the data of the object? -- yes it would do the node's data
            System.out.println(newLL.add(linkedList.removeFirst()));
        }
        // can i use getFirst here??? - does this follow the queue rules?
        while(newLL.getFirst() != null){
            linkedList.add(newLL.removeFirst());
        }
         */
    }

    public int size(){
        return linkedList.size();
        /*
        int numElements = 0;
        LinkedList<Type> newLL = new LinkedList<Type>();
        while(peek() != null){
            // does this automatically print out the memory location for the data of the object?
            newLL.add(linkedList.removeFirst());
            numElements++;
        }
        // can i use getFirst here??? - does this follow the queue rules?
        while(newLL.getFirst() != null){
            linkedList.add(newLL.removeFirst());
        }
        return numElements;

         */
    }

    public boolean isEmpty(){
        if(linkedList.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }

}


/*
E enqueue(E item) - Pushes an item onto the bottom/back of this queue.
E dequeue() - Removes the object at the top of this queue and returns that object as the value of this function.
E peek()- Looks at the object at the top of this queue without removing it from the queue.
void display() - Outputs the queue order
int size() - Returns number of items in the queue
boolean isEmpty - Checks if queue is currently empty
 */