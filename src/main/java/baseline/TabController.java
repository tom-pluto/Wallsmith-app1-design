/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.util.List;

public class TabController {

    @FXML private TableView<ToDoEntry> table;
    @FXML private TableColumn<?, ?> columnDescription;
    @FXML private TableColumn<?, ?> columnDueDate;

    @FXML private Button addButton;
    @FXML private TextField descriptionTextField;
    @FXML private DatePicker dueDatePicker;

    private ObservableList<ToDoEntry> entryList;

    @FXML void addNewEntry(ActionEvent event) {

        // If one or both of the input fields is empty, return from the method without doing anything
        // Get String from descriptionTextField
        // Get String from dueDatePicker
        // Create a new ToDoEntry with the data from the input fields
        // Add the entry to the entryList
        // Add that ToDoEntry to the table

    }

    @FXML void deleteSelectedEntry(ActionEvent event) {

        // Get selected entry
        // Delete it from the TableView

    }

    @FXML void initialize() {

        // Initalize entryList
        // Set columnDescription to pull out the description attribute from the ToDoEntry object
        // Set columnDueDate to pull out the dueDate attribute from the ToDoEntry object

    }

}
