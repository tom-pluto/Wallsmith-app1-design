/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;

public class MenuController {

    @FXML private ResourceBundle resources;
    @FXML private URL location;

    @FXML private TabPane tabPane;

    @FXML void addList(ActionEvent event) throws IOException {

        // Create a new tab from tab.fxml
        // Set the name of the tab to "New Tab"
        // Add the tab to the tabPane

    }

    @FXML void deleteCurrentList(ActionEvent event) {

        // Get the currently selected tab
        // Remove that tab from the list

    }

    @FXML void exitApp(ActionEvent event) {

        // Exit the program

    }

    @FXML void loadFromFile(ActionEvent event) {

        // Prompt the user to enter a .csv file (might change to .json)
        // Parse the file into a List, where each element is a List of ToDoEntrys
        // Add each list as a new tab, giving the appropriate name

    }

    @FXML void saveToFile(ActionEvent event) {

        // Convert each tab into a list of ToDoEntrys and add them to another list
        // Convert this list of lists of ToDoEntrys into a .csv file (might end up being .json)
        // Ask the user where they want to save the file, and then put it there

    }

    @FXML void showAbout(ActionEvent event) {

        // Show an about tab, talking about me because I'm a narcissist

    }

    @FXML void showGuide(ActionEvent event) {

        // Show a guide to using the program

    }

    @FXML void initialize() throws IOException {

        // Load tab.fxml to create an AnchorPane called pane
        AnchorPane pane = FXMLLoader.load(this.getClass().getResource("tab.fxml"));

        // Create a new Tab called tab
        Tab tab = new Tab();

        // Set the content of the tab to pane
        tab.setContent(pane);

        // Set the title of the tab to "Tab 1"
        tab.setText("Tab 1");

        // Add the tab to the tabPane
        tabPane.getTabs().add(tab);

    }

}