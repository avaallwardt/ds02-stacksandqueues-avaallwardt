import java.util.ArrayList;
import java.util.LinkedList;

public class QueueArray<Type> {

    private ArrayList<Type> arrayList;

    public QueueArray(){
        arrayList = new ArrayList<Type>();
    }
    public Type enQueue(Type item){
        arrayList.add(item);
        return item;
    }

    public Type deQueue(){
        Type firstItem = arrayList.get(0);
        arrayList.remove(0);
        return firstItem;
    }

    public Type peek(){
        return arrayList.get(0);
    }

    public void display(){
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }

    public int size(){
        return arrayList.size();
    }

    public boolean isEmpty(){
        if(arrayList.size() == 0){
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
