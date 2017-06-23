package controller;

/**
 * @author Corentin RAGUENEAU
 * 
 * create a Observer
 */

import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;
import model.ModelObservable;


@SuppressWarnings("serial")
public class JPanelObserver extends JPanel implements Observer {
	
  public void Observer(){
	  ModelObservable oModel = new ModelObservable(0);
	  /** create a new watcher*/
		JPanelObserver watcher = new JPanelObserver();		
		
		oModel.addObserver(watcher);
  }

@Override
public void update(Observable o, Object arg) {
	// TODO Auto-generated method stub
	
}


	
}
	
	
	
	
