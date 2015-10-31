package ui;

import java.io.IOException;

import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Constants {
	static final String MESSAGE_MORNING = "Good morning, Jim!";
	static final String MESSAGE_AFTERNOON = "Good afternoon, Jim!";
	static final String MESSAGE_EVENING = "Good evening, Jim!";
	static final String MESSAGE_TODAY = "Today's tasks: ";
	static final String MESSAGE_PROMPT = "How may i help you?";
	static final String MESSAGE_SUCCESS = "Success! ";
	static final String MESSAGE_FAIL = "Failed! ";
	static final String MESSAGE_ERROR = "ERROR! WRONG INPUT! Type \"help\" for the list of commands.";
	static final String MESSAGE_ADDED = " is added to your schedule:)";
	static final String MESSAGE_ADD_FAIL = "Sorry but we are unable to add this event please check the input and try again!";
	static final String MESSAGE_DELETED = " is deleted from your schedule!";
	static final String MESSAGE_DELETE_FAIL = "Sadly there is no such event to delete";
	static final String MESSAGE_SEARCHED = " is found in your schedule!";
	static final String MESSAGE_SEARCH_FAIL = "Sadly no such event is not found:(";
	static final String MESSAGE_UPDATED = "Your event has been successfully updated!";
	static final String MESSAGE_COMPLETED = " is complete :)";
	static final String MESSAGE_UPDATE_FAIL = "Update failed!";
	static final String MESSAGE_HELP = "The commands that can be used are: ";
	static final String MESSAGE_SHOW = "These are the events on the date you requested for: ";
	static final String MESSAGE_SHOW_NOTHING = "You have no upcoming events or tasks!";
	static final String MESSAGE_SHOW_FAIL = "There was an error in showing your events, please try again!";
	static final String MESSAGE_DONE = "Well done you completed this task!";
	static final String MESSAGE_EXIT = "Goodbye!:)";
	static final String MESSAGE_CFP = " is your new file path!";
	static final String MESSAGE_CFP_FAIL = "Your request has failed. Please check the name of your file path";
	static final String MESSAGE_SHOW_FP = " is your file path.";
	static final String MESSAGE_SHOW_FP_FAIL = "Sorry we are unable to find your file path.";
	static final String MESSAGE_UNDO = " Your last action has been undone!";
	
	static final String COMMAND_EXIT = "exit";
	static final String COMMAND_ADD = "add";
	static final String COMMAND_DELETE = "delete";
	static final String COMMAND_SHOW = "show";
	static final String COMMAND_UPDATE = "update";
	static final String COMMAND_SEARCH = "search";
	static final String COMMAND_UNDO = "undo";
	static final String COMMAND_HELP = "help";
	static final String COMMAND_DONE = "done";
	


}
