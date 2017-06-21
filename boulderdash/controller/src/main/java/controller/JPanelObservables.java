package controller;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;
import 

public class JPanelObservables extends JPanel implements Observer {

	void init(ModelObservable lSigAObserver) {
		lSigAObserver.addObserver(this);
	}

	public void update(Observable observable, Object objectConcerne) {
		repaint();
	}
}