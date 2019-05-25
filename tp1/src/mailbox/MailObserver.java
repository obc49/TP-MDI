package mailbox;

import javax.swing.JLabel;

public class MailObserver extends JLabel implements Observer{

	

	@Override
	public void update(Subject s) {
	
		Mail obj =(((MailBox) s).read());
		super.setText("\n"+obj);
	}
}
