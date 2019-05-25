package mailbox;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject  {
	
	List<Observer> observer = new ArrayList<Observer>();
	
	void attach (Observer o){
		
		this.observer.add(o);
		
		}
	
    void detach (Observer o){
    	
    	this.observer.remove(o);
		
	}
    public void notifyObservers(){
    	for(Observer b : observer){
    		b.update(this);
   	}
    }
}
