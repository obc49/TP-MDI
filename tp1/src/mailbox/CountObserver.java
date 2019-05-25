package mailbox;

import javax.swing.JLabel;

public class CountObserver extends JLabel implements Observer {
	private int count=0;

	@Override
	public void update(Subject s) {
	
		count =(((MailBox) s).getNumberOfMessages());
		super.setText(" "+count);
	}
	

}
