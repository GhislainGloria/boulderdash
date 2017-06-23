package view;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class InfoPanel extends JPanel{
	
	private JTextArea text;

	/**
	 * 
	 */
	private static final long serialVersionUID = -1423883146461933433L;
	
	public InfoPanel(){
		
		this.text = new JTextArea();
		this.text.setEditable(false);
		this.text.setText("Informations");
		
		this.add(this.text);
	}
	
	public void update(String text){
		this.text.setText(text);
	}

}