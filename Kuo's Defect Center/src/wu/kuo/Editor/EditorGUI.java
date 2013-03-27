package wu.kuo.Editor;

import javax.swing.JFrame;

import wu.kuo.Utilities.Constantable;

public class EditorGUI extends JFrame{
	private static JFrame instance;
	
	public static JFrame getInstance(String actionTitle) {
		if (instance == null)
			instance = new EditorGUI();
		instance.setSize(Constantable.EDITOR_WINDOW_WIDTH, Constantable.EDITOR_WINDOW_HEIGHT);
		instance.setVisible(true);
		instance.setTitle(actionTitle);
		instance.setDefaultCloseOperation(HIDE_ON_CLOSE);
		return instance;
	}
}
