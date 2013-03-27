package wu.kuo.ActionListeners;

import wu.kuo.Editor.EditorGUI;

public class AddAction implements Actionable {
	public void execute() {
		EditorGUI.getInstance("Add Action");
	}

}
