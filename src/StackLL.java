import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StackLL<Type> {

    private LinkedList<Type> linkedList;
    public StackLL(){
        linkedList = new LinkedList<Type>();
    }

    public Type push(Type item){
        linkedList.add(item);
        return item;
    }
    //commit3
    public Type pop(){
        Type lastObject = linkedList.getLast();
        linkedList.removeLast(); // i can use this method, right? bc we didnt code it in the 1st LL project
        return lastObject;
    }

    public Type peek(){
        return linkedList.getLast();
    }

    // stacks and queues -- can only add/remove objects -- can't iterate through so need to remove from og lnked list, put it all into a new linked list then put it back
    public void display(){
        for(int i = linkedList.size() - 1; i > -1; i--){
            System.out.println(linkedList.get(i));
        }
        /*
        LinkedList<Type> newLL = new LinkedList<Type>();
        while(peek() != null){
            // does this automatically print out the memory location for the data of the object?
            System.out.println(newLL.add(linkedList.removeLast()));
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
        LinkedList<Type> newLL = new LinkedList<Type>();
        int numElements = 0;
        while(peek() != null){
            // does this automatically print out the memory location for the data of the object?
            newLL.add(linkedList.removeLast());
            numElements++;
        }
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
E push(E item) - Pushes an item onto the top of this stack.
E pop() - Removes the object at the top of this stack and returns that object as the value of this function.
E peek()- Looks at the object at the top of this stack without removing it from the stack.
void display() - Outputs the stack order
int size() - Returns number of items in the stack
boolean isEmpty - Checks if stack is currently empty
 */