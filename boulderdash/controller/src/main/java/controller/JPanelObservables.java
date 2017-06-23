package controller;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;
import model.ModelObservable;

@SuppressWarnings("serial")
public class JPanelObservables extends JPanel implements Observer {
	
	
	ModelObservable oModel = new ModelObservable(0);
	JPanelObservables watcher = new JPanelObservables();
	oModel.addObserver(watcher);
	
	
	
}