package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import view.NotepadView;

// làm open file -> ok
// làm save as -> ok
// tạo phím tắt -> tạm ổn
// hiển thị tên file ở header -> ok
// menu chuột phải
// show các dialog hiển thị thông báo hoặc lỗi khi save file, ...
// làm line đếm số dòng ở footer
// làm new, new window

public class NotepadController implements ActionListener {
	JFileChooser fc = new JFileChooser();
	private NotepadView notepadView;

	public NotepadController(NotepadView nopadView) {
		this.notepadView = nopadView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == this.notepadView.getMenuItemSave()) {
			if (this.notepadView.notepadModel.getFileName().length() > 0) {
				saveFile(this.notepadView.notepadModel.getFileName());
			} else {
				int returnValue = fc.showSaveDialog(this.notepadView);
				if (returnValue == JFileChooser.APPROVE_OPTION) {
					File file = fc.getSelectedFile();
					String fileName = file.getAbsolutePath();
					saveFile(fileName);
				}
			}
		} else if (e.getSource() == this.notepadView.getMenuItemOpen()) {
			int resultValue = fc.showOpenDialog(this.notepadView);
			if (resultValue == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				String fileName = file.getAbsolutePath();
				setTitle(fileName);
				if (fileName.endsWith(".txt")) {
					try {
						FileReader fr = new FileReader(fileName);
						BufferedReader br = new BufferedReader(fr);
						String line = br.readLine();
						String result = "";
						while (line != null) {
							result += line;
							result += "\n";
							line = br.readLine();
						}
						this.notepadView.notepadModel.setContent(result);
						this.notepadView.textArea.setText(this.notepadView.notepadModel.getContent());
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		} else if (e.getSource() == this.notepadView.getMenuItemSaveAs()) {
			int resultValue = fc.showSaveDialog(this.notepadView);
			if (resultValue == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				String fileName = file.getAbsolutePath();
				int result = JOptionPane.showConfirmDialog(fc,
						fileName + " already exists." + "\n Do you want to replace it?", "Confirm Save As",
						JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if (result == JOptionPane.YES_OPTION) {
					saveFile(fileName);
				}
			}
		}
	}

	public void saveFile(String fileName) {
		try {
			PrintWriter pw = new PrintWriter(fileName, "UTF-8");
			String data = this.notepadView.textArea.getText();
			pw.write(data);
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void setTitle(String pathFile) {
		int index = pathFile.lastIndexOf("\\");
		String fileName = pathFile.substring(index + 1);
		this.notepadView.setTitle(fileName + " - Notepad");
	}

}
