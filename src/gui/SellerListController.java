package gui;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Seller;
import model.services.SellerService;

public class SellerListController implements Initializable {
	
	private SellerService service;

	@FXML
	private TableView<Seller> tableViewSeller;

	@FXML
	private TableColumn<Seller, Integer> tableColumnId;

	@FXML
	private TableColumn<Seller, String> tableColumnQra;

	@FXML
	private TableColumn<Seller, String> tableColumnMatricula;

	@FXML
	private Button btNovo;
	
	private ObservableList<Seller> obsList;

	@FXML
	public void onBtNovo() {
		System.out.println("BTNOVO");
	}
	
	public void setSellerService(SellerService service) {
		this.service = service;
		

	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
	}

	private void initializeNodes() {
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
		tableColumnQra.setCellValueFactory(new PropertyValueFactory<>("qragm"));
		tableColumnMatricula.setCellValueFactory(new PropertyValueFactory<>("matgm"));

		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewSeller.prefHeightProperty().bind(stage.heightProperty());
	}
	
	public void updateTableView() {
		if (service == null) {
			throw new IllegalStateException("Service was null");
		}
		List<Seller> list = service.findAll();
		obsList = FXCollections.observableArrayList(list);
		tableViewSeller.setItems(obsList);
		//initEditButtons();
		//initRemoveButtons();
	}

}
