package gamestate;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CareTaker {
    //TODO caretaker
    private static CareTaker instance = new CareTaker();
    //private List<Memento> savePoint = new ArrayList<>();
    private Stack <Memento> undoStack = new Stack();
    private Stack <Memento> redoStack= new Stack();
    
    public static CareTaker getInstance() {
        return instance;
    }
    
    private CareTaker() {
    }
    public void createMemento(Memento memento){
           undoStack.push(memento);
    
    }
    
    public Memento undo(){
        if(undoStack.size() == 0)
            return null;
        Memento x = undoStack.pop();
        redoStack.push(x);
        return x;
    }
    public Memento redo(){
        if(redoStack.size()==0)
            return null;
        Memento y = redoStack.pop();
        undoStack.push(y);
        return y;
    }
}
