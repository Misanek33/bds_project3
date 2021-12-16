package org.but.feec.bds_project3.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.but.feec.bds_project3.api.PersonBasicView;
import org.but.feec.bds_project3.data.PersonRepository;
import org.but.feec.bds_project3.services.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class AppController {
    private static final Logger logger = LoggerFactory.getLogger(AppController.class);
    @FXML
    private TableView<PersonBasicView> personTableView;
    @FXML
    private TableColumn<PersonBasicView, Long> columnId;
    @FXML
    private TableColumn<PersonBasicView, String> columnName;
    @FXML
    private TableColumn<PersonBasicView, String> columnSurname;
    @FXML
    private Button btnRefresh;

    private PersonRepository personRepository;
    private PersonService personService;

    public AppController() {

    }

    @FXML
    private void initialize() {
        personRepository = new PersonRepository();
        personService = new PersonService(personRepository);

        columnId.setCellValueFactory(new PropertyValueFactory<PersonBasicView, Long>("id"));
        columnName.setCellValueFactory(new PropertyValueFactory<PersonBasicView, String>("name"));
        columnSurname.setCellValueFactory(new PropertyValueFactory<PersonBasicView, String>("surname"));

        personTableView.getSortOrder().add(columnId);

        ObservableList<PersonBasicView> observablePersonList = initializePerson();
        personTableView.setItems(observablePersonList);

        logger.info("Application initialized");

    }

    private ObservableList<PersonBasicView> initializePerson() {
        List<PersonBasicView> personBasicViewList = personService.getPersonBasicView();
        return FXCollections.observableArrayList(personBasicViewList);
    }

    @FXML
    public void onRefreshButtonClick(ActionEvent event) {
        ObservableList<PersonBasicView> observablePersonList = initializePerson();
        personTableView.setItems(observablePersonList);
        personTableView.refresh();
        personTableView.sort();
    }


}
