package de.hdm.client.gui;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.VerticalPanel;



public class EditorPanel extends HorizontalPanel {
	
	
	
	HorizontalPanel test = new HorizontalPanel();
		
	Button schmeckt = new Button("add");
	
	ProduktForm produkt= null;
	
	
	public EditorPanel() {
		
	}
    
    
	

   
		
		
	
public void onLoad() {
	
	 
   
	
	this.add(schmeckt);

	
	test.add(schmeckt);
	
	
	schmeckt.addClickHandler(new OpenUpClickHandler());
	
	
	schmeckt.addStyleName("ss");   
   
	this.add(test);

	

	}


		

    class OpenUpClickHandler implements ClickHandler {
    	
    
    	
		public void onClick(ClickEvent event) {
			
			ProduktForm produkt = new ProduktForm();
			produkt.openCommentEditForm();
			

    }
		
		
		
		
    }
}



