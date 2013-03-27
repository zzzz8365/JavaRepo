package wu.kuo.Editor;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import wu.kuo.Utilities.Constantable;

public class EditorGUI extends JFrame{
	private static EditorGUI instance;
	private JLabel label_Title = new JLabel(Constantable.LABEL_TITLE);
	private JLabel label_Description = new JLabel(Constantable.LABEL_DESCRIPTION);
	private JTextField text_Title = new JTextField(Constantable.EDITOR_TEXT_FIELD_WIDTH);
	private JTextField text_Description = new JTextField(Constantable.EDITOR_TEXT_FIELD_WIDTH);
	private JTextArea text_Report = new JTextArea();
	private JPanel panel_Title = new JPanel();
	private JPanel panel_Description = new JPanel();
	private JPanel panel_Report = new JPanel();
	private JPanel panel_North = new JPanel();
	
	public static JFrame getInstance(String actionTitle) {
		if (instance == null)
			instance = new EditorGUI();
		instance.setupFrame(instance, actionTitle);
		return instance;
	}
	private void setupFrame(JFrame instance, String actionTitle) {
		instance.setSize(Constantable.EDITOR_WINDOW_WIDTH, Constantable.EDITOR_WINDOW_HEIGHT);
		instance.setVisible(Constantable.WINDOW_VISIBILITY_TRUE);
		instance.setTitle(actionTitle);
		instance.setDefaultCloseOperation(HIDE_ON_CLOSE);
		
		panel_Title.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel_Title.add(label_Title);
		panel_Title.add(text_Title);
		
		panel_Description.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel_Description.add(label_Description);
		panel_Description.add(text_Description);
		
		panel_Report.setLayout(new BoxLayout(panel_Report, BoxLayout.LINE_AXIS));
		panel_Report.add(text_Report);
		
		panel_North.setLayout(new BoxLayout(panel_North, BoxLayout.PAGE_AXIS));
		panel_North.add(panel_Title, BorderLayout.NORTH);
		panel_North.add(panel_Description, BorderLayout.SOUTH);
		
		instance.setLayout(new BoxLayout(instance.getContentPane(), BoxLayout.PAGE_AXIS));
		instance.add(panel_North, BorderLayout.NORTH);
		instance.add(panel_Report, BorderLayout.SOUTH);
	}
	
	public void setTitle(String title) {
		text_Title.setText(title);
	}
	
	public String getTitle() {
		return text_Title.getText();
	}
	
	public void setDescription(String description) {
		text_Description.setText(description);
	}
	
	public String getDescription() {
		return text_Description.getText();
	}
	
	public void setReport(String report) {
		text_Report.setText(report);
	}
	
	public String getReport() {
		return text_Report.getText();
	}
}
