package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.JAppView;
import view.NotepadView;

public class JAppController implements ActionListener {
	private JAppView jAppView;
	private NotepadView notepadView;
	
	public JAppController(JAppView jAppView) {
		this.jAppView = jAppView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.jAppView.getBtnNewButton()) {
			this.notepadView.main(new String[] {});
		}
		
	}

}
