package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.NotepadModel;

import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Toolkit;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class NodepadView extends JFrame {

	private JPanel contentPane;
	private NotepadModel notepadModel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] s) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					NodepadView frame = new NodepadView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NodepadView() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\Workspace\\java\\onTapJavaSwing\\JAppProject\\src\\view\\notepad-icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JMenuBar menuBar = new JMenuBar();
		contentPane.add(menuBar, BorderLayout.NORTH);
		
		JMenu MenuFile = new JMenu("File");
		menuBar.add(MenuFile);
		
		JMenuItem menuItemNew = new JMenuItem("New");
		MenuFile.add(menuItemNew);
		
		JMenuItem menuItemNewWindow = new JMenuItem("New Window");
		MenuFile.add(menuItemNewWindow);
		
		JMenuItem menuItemOpen = new JMenuItem("Open...");
		MenuFile.add(menuItemOpen);
		
		JMenuItem menuItemSave = new JMenuItem("Save");
		MenuFile.add(menuItemSave);
		
		JMenuItem menuItemSaveAs = new JMenuItem("Save As...");
		MenuFile.add(menuItemSaveAs);
		
		JSeparator separator = new JSeparator();
		MenuFile.add(separator);
		
		JMenuItem menuItemPageSetup = new JMenuItem("Page Setup...");
		MenuFile.add(menuItemPageSetup);
		
		JMenuItem menuItemPrint = new JMenuItem("Print...");
		MenuFile.add(menuItemPrint);
		
		JSeparator separator_1 = new JSeparator();
		MenuFile.add(separator_1);
		
		JMenuItem menuItemExit = new JMenuItem("Exit");
		MenuFile.add(menuItemExit);
		
		JMenu menuEdit = new JMenu("Edit");
		menuBar.add(menuEdit);
		
		JMenuItem menuItemUndo = new JMenuItem("Undo");
		menuEdit.add(menuItemUndo);
		
		JSeparator separator_2 = new JSeparator();
		menuEdit.add(separator_2);
		
		JMenuItem menuItemCut = new JMenuItem("Cut");
		menuEdit.add(menuItemCut);
		
		JMenuItem menuItemCopy = new JMenuItem("Copy");
		menuEdit.add(menuItemCopy);
		
		JMenuItem menuItemPaste = new JMenuItem("Paste");
		menuEdit.add(menuItemPaste);
		
		JMenuItem menuItemDelete = new JMenuItem("Delete");
		menuEdit.add(menuItemDelete);
		
		JSeparator separator_3 = new JSeparator();
		menuEdit.add(separator_3);
		
		JMenuItem menuItemSearch = new JMenuItem("Search with Bing...");
		menuEdit.add(menuItemSearch);
		
		JMenuItem menuItemFind = new JMenuItem("Find...");
		menuEdit.add(menuItemFind);
		
		JMenuItem menuItemFindNext = new JMenuItem("Find Next");
		menuEdit.add(menuItemFindNext);
		
		JMenuItem menuItemFindPrevious = new JMenuItem("Find Previous");
		menuEdit.add(menuItemFindPrevious);
		
		JMenuItem menuItemReplace = new JMenuItem("Replace...");
		menuEdit.add(menuItemReplace);
		
		JMenuItem menuItemGoTo = new JMenuItem("Go To...");
		menuEdit.add(menuItemGoTo);
		
		JSeparator separator_4 = new JSeparator();
		menuEdit.add(separator_4);
		
		JMenuItem menuItemSelectAll = new JMenuItem("Select All");
		menuEdit.add(menuItemSelectAll);
		
		JMenuItem menuItemTime = new JMenuItem("Time/Date");
		menuEdit.add(menuItemTime);
		
		JMenu menuFormat = new JMenu("Format");
		menuBar.add(menuFormat);
		
		JCheckBoxMenuItem menuItemWW = new JCheckBoxMenuItem("Word Wrap");
		menuItemWW.setSelected(true);
		menuFormat.add(menuItemWW);
		
		JMenuItem menuItemFont = new JMenuItem("Font...");
		menuFormat.add(menuItemFont);
		
		JMenu menuView = new JMenu("View");
		menuBar.add(menuView);
		
		JMenu menuView_zoom = new JMenu("Zoom");
		menuView.add(menuView_zoom);
		
		JMenuItem menuItemZoomIn = new JMenuItem("Zoom In");
		menuView_zoom.add(menuItemZoomIn);
		
		JMenuItem menuItemZoomOut = new JMenuItem("Zoom Out");
		menuView_zoom.add(menuItemZoomOut);
		
		JMenuItem menuItemRestore = new JMenuItem("Restore Default Zoom");
		menuView_zoom.add(menuItemRestore);
		
		JCheckBoxMenuItem menuItemStatus = new JCheckBoxMenuItem("Status Bar");
		menuItemStatus.setSelected(true);
		menuView.add(menuItemStatus);
		
		JMenu menuHelp = new JMenu("Help");
		menuBar.add(menuHelp);
		
		JMenuItem menuItemViewHelp = new JMenuItem("View Help");
		menuHelp.add(menuItemViewHelp);
		
		JMenuItem menuItemSend = new JMenuItem("Send Feedback");
		menuHelp.add(menuItemSend);
		
		JSeparator separator_5 = new JSeparator();
		menuHelp.add(separator_5);
		
		JMenuItem menuItemAbout = new JMenuItem("About Notepad");
		menuHelp.add(menuItemAbout);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, BorderLayout.CENTER);
	}

}
