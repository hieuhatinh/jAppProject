package test;

import java.awt.EventQueue;

import javax.swing.LookAndFeel;
import javax.swing.UIManager;

import view.JAppView;

public class Test {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					JAppView frame = new JAppView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
