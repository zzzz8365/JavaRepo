package wu.kuo.Gui;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import wu.kuo.ActionListeners.SearchAction;
import wu.kuo.Controller.Controller;
import wu.kuo.Utilities.Constants;

public class Gui extends JFrame{
	private JTextField searchBar;
	private JButton button_Search;
	private JButton button_AddDefect;
	private JButton button_ModifyDefect;
	private JButton button_RemoveDefect;
	private JButton button_UpdateDefectList;
	private JPanel defectListPanel;
	private JPanel optionListPanel;
	private JPanel searchPanel;
	private static Controller controller;
	
	static {
		controller = new Controller();
	};
	
	
	public Gui() {
		super(Constants.APP_NAME);
		setSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
		setVisible(Constants.WINDOW_VISIBILITY_TRUE);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		defectListPanel = new JPanel();
		optionListPanel = new JPanel();
		searchPanel = new JPanel();
		searchBar = new JTextField(Constants.SEARCH_FIELD_INITIAL_VALUE, Constants.SEARCH_FIELD_WIDTH);
		button_Search = new JButton(Constants.BUTTON_SEARCH);
		button_AddDefect = new JButton(Constants.BUTTON_ADD_DEFECT);
		button_ModifyDefect = new JButton(Constants.BUTTON_MODIFY_DEFECT);
		button_RemoveDefect = new JButton(Constants.BUTTON_REMOVE_DEFECT);
		button_UpdateDefectList = new JButton(Constants.BUTTON_UPDATE_DEFECT_LIST);
		
		button_Search.setPreferredSize(new Dimension(100, 20));
		button_Search.addActionListener(controller);
		button_AddDefect.addActionListener(controller);
		button_ModifyDefect.addActionListener(controller);
		button_RemoveDefect.addActionListener(controller);
		button_UpdateDefectList.addActionListener(controller);
		
		searchPanel.setLayout(new BoxLayout(searchPanel, BoxLayout.LINE_AXIS));
		searchPanel.add(searchBar);
		searchPanel.add(button_Search);
		
		optionListPanel.setLayout(new BoxLayout(optionListPanel, BoxLayout.PAGE_AXIS));
		optionListPanel.setPreferredSize(new Dimension(100, 20));
		optionListPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		optionListPanel.add(button_AddDefect);
		optionListPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		optionListPanel.add(button_ModifyDefect);
		optionListPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		optionListPanel.add(button_RemoveDefect);
		optionListPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		optionListPanel.add(button_UpdateDefectList);
		
		add(searchPanel, BorderLayout.NORTH);
		add(defectListPanel, BorderLayout.CENTER);
		add(optionListPanel, BorderLayout.EAST);
	}
}
