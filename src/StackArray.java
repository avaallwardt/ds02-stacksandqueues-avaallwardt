import java.util.ArrayList;

public class StackArray<Type> {

    private ArrayList<Type> arrayList;

    public StackArray(){
        arrayList = new ArrayList<Type>();
    }

    public Type push(Type item){
        arrayList.add(item);
        return item;
    }

    public Type pop(){
        Type lastItem = arrayList.get(arrayList.size() - 1);
        arrayList.remove(arrayList.size() - 1);
        return lastItem;
    }

    public Type peek(){
        return arrayList.get(arrayList.size() - 1);
    }

    public void display(){
        for(int i = arrayList.size() - 1; i > -1; i--){
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
E push(E item) - Pushes an item onto the top of this stack.
E pop() - Removes the object at the top of this stack and returns that object as the value of this function.
E peek()- Looks at the object at the top of this stack without removing it from the stack.
void display() - Outputs the stack order
int size() - Returns number of items in the stack
boolean isEmpty - Checks if stack is currently empty
 */