package mailbox;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MailBox extends Subject{

	
	private MailBox(){
		
	}
	private static MailBox instance = null;
	
	
	public static MailBox getInstance() {
		if (instance==null)
			instance = new MailBox();
		return instance;
	}
	List<Mail> mail = new ArrayList<Mail>();
	
	
	public void newMessage(Mail m ){
		
		this.mail.add(m);
		this.notifyObservers();
		
		}


	public Mail read() {
		return this.mail.get(mail.size()-1);
	}


	public Integer getNumberOfMessages() {
		return mail.size();
	}
	
	public boolean isEmpty() {
		boolean rep;
		if (mail.size()==0) {
			rep=true;
		}else
			rep = false;
		return rep;
	}
	
}
