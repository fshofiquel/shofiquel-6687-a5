/*
 *  UCF COP3330 Summer 2021 Assignment 5 Solution
 *  Copyright 2021 Fazlur Shofiquel
 */
package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

// This controller will allow the user to remove and edit each invetory item.
// Since this is a TableView then there will be no need to impliment a sorting method as the TableView can do that
// itself.
// An active search bar would be a good idea to search otherwise enter or a button can be used. Will most
// Likely need a FilterList to do this.
public class TrackingInventoryController
{
	@FXML
	private TextField searchTextArea;
	@FXML
	public TableView InventoryTable;
	@FXML
	public TableColumn ValCol;
	@FXML
	public TableColumn SerialNumCol;
	@FXML
	public TableColumn NameCol;


	// This will open the windo to the InputNewItemController
	@FXML
	public void searchClick(ActionEvent actionEvent)
	{
	}

	// Removes and item that is selected from the TableView
	@FXML
	public void removeItemClick(ActionEvent actionEvent)
	{
	}

	// propmpt opening the InputNewItem window.
	@FXML
	public void addItemClick(ActionEvent actionEvent)
	{
		openNewWindow("InputNewItem.fxml", "Input New Item");
	}

	// Causes the button to launch a new window for save and import.
	@FXML
	public void openSaveFileController(ActionEvent actionEvent)
	{
		openNewWindow("saveFileAs.fxml", "Save As / Import File");
	}

	public void openHelpClick(ActionEvent actionEvent)
	{
	}

	// Helper method to reduce clutting when a new window needs to be called.
	public void openNewWindow(String fileName, String windowTitle)
	{
		try
		{
			Parent root = FXMLLoader.load(getClass().getResource(fileName));
			Stage stage = new Stage();

			stage.setTitle(windowTitle);
			stage.setScene(new Scene(root));
			stage.show();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}


}
