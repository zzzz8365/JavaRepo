package wu.kuo.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import java.util.Map;

import wu.kuo.ActionListeners.Actionable;
import wu.kuo.ActionListeners.AddAction;
import wu.kuo.ActionListeners.ModifyAction;
import wu.kuo.ActionListeners.RemoveAction;
import wu.kuo.ActionListeners.SearchAction;
import wu.kuo.ActionListeners.UpdateAction;
import wu.kuo.Utilities.Constants;

public class Controller implements ActionListener {
	Map<String, Actionable> actions = new Hashtable<String, Actionable>();
	
	public Controller() {
		actions.put(Constants.BUTTON_SEARCH, new SearchAction());
		actions.put(Constants.BUTTON_ADD_DEFECT, new AddAction());
		actions.put(Constants.BUTTON_MODIFY_DEFECT, new ModifyAction());
		actions.put(Constants.BUTTON_REMOVE_DEFECT, new RemoveAction());
		actions.put(Constants.BUTTON_UPDATE_DEFECT_LIST, new UpdateAction());
	}
	
	public void actionPerformed(ActionEvent e) {
		actions.get(e.getActionCommand()).execute();
	}
	
}
