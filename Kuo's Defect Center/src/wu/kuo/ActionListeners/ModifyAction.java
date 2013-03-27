package wu.kuo.ActionListeners;

import wu.kuo.Editor.EditorGUI;

public class ModifyAction implements Actionable{
	public void execute() {
		EditorGUI.getInstance("Modify Action");
	}
	
}
