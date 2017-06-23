package view;

import javax.swing.JPanel;
import javax.swing.JTextArea;

// TODO: Auto-generated Javadoc
/**
 * The Class InfoPanel.
 * Panel where the infos are shown, such as the diamonds remaining,
 *   diamonds dug, etc.
 */
public class InfoPanel extends JPanel{
	
	/** The text. */
	private JTextArea text;

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1423883146461933433L;
	
	/**
	 * Instantiates a new info panel.
	 */
	public InfoPanel(){
		
		this.text = new JTextArea();
		this.text.setEditable(false);
		this.text.setText("Informations");
		
		this.add(this.text);
	}
	
	/**
	 * Update.
	 *
	 * @param text the text
	 */
	public void update(String text){
		this.text.setText(text);
	}

}