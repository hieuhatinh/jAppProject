package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.JAppController;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JAppView extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;

	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	/**
	 * Create the frame.
	 */
	public JAppView() {
		setTitle("JApp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 577);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		ActionListener action = new JAppController(this);

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Java Application World");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setForeground(Color.RED);
		
		btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("E:\\Workspace\\java\\onTapJavaSwing\\JAppProject\\src\\view\\notepad.jpg"));
		btnNewButton.addActionListener(action);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("E:\\Workspace\\java\\onTapJavaSwing\\JAppProject\\src\\view\\calculator.jpg"));
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("E:\\Workspace\\java\\onTapJavaSwing\\JAppProject\\src\\view\\ip.jpg"));
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon("E:\\Workspace\\java\\onTapJavaSwing\\JAppProject\\src\\view\\tic-tac-toe.jpg"));
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon("E:\\Workspace\\java\\onTapJavaSwing\\JAppProject\\src\\view\\picture-puzzle.jpg"));
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon("E:\\Workspace\\java\\onTapJavaSwing\\JAppProject\\src\\view\\wct.jpg"));
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setIcon(new ImageIcon("E:\\Workspace\\java\\onTapJavaSwing\\JAppProject\\src\\view\\puzzle-game.jpg"));
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setIcon(new ImageIcon("E:\\Workspace\\java\\onTapJavaSwing\\JAppProject\\src\\view\\exam-system.jpg"));
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setIcon(new ImageIcon("E:\\Workspace\\java\\onTapJavaSwing\\JAppProject\\src\\view\\source-code-generator.jpg"));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(258)
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(252))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_6, 0, 0, Short.MAX_VALUE)
								.addComponent(btnNewButton_3, Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 210, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_4, 0, 0, Short.MAX_VALUE)
								.addComponent(btnNewButton_7, 0, 0, Short.MAX_VALUE)
								.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 211, Short.MAX_VALUE))
							.addGap(10)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_5, 0, 213, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(btnNewButton_8, 0, 0, Short.MAX_VALUE)
									.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 213, Short.MAX_VALUE)))))
					.addGap(24))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(8)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_4, GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
						.addComponent(btnNewButton_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton_7, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
						.addComponent(btnNewButton_8, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
						.addComponent(btnNewButton_6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(0))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
