package com.example.jotirmoymollick;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class ManageOrderViewController
{
    @javafx.fxml.FXML
    private TableColumn<Order, String> customerNameTableColumn;
    @javafx.fxml.FXML
    private DatePicker orderDatePicker;
    @javafx.fxml.FXML
    private TextField orderIdTextField1;
    @javafx.fxml.FXML
    private TableColumn<Order,Integer> orderIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Order, Integer> totalAmountTableColumn;
    @javafx.fxml.FXML
    private TextField productNameTextField;
    @javafx.fxml.FXML
    private TableColumn<Order, String> actionsColumn;
    @javafx.fxml.FXML
    private TextField customerNameTextField;
    @javafx.fxml.FXML
    private TableColumn<Order, String> productNameTableColumn;
    @javafx.fxml.FXML
    private TableView<Order> orderTable;
    @javafx.fxml.FXML
    private TableColumn<Order, Integer> priceTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Order,Integer> quantityTableColumn;
    @javafx.fxml.FXML
    private TextField priceTextField;
    @javafx.fxml.FXML
    private TextField quantityTextField;

    @javafx.fxml.FXML
    public void initialize() {
        //customerList = new ArrayList<Customer>();
        //orderList = new ArrayList<Order>();
        // initialize table columns and data
        customerNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("customerName"));
        orderIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        productNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("productName"));
        priceTableColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        quantityTableColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        actionsColumn.setCellValueFactory(new PropertyValueFactory<>("actions"));
        totalAmountTableColumn.setCellValueFactory(new PropertyValueFactory<>("totalAmount"));

        //orderTable.setItems(FXCollections.observableArrayList(orderList));

    }

    @javafx.fxml.FXML
    public void addOrderButtonOnAction(ActionEvent actionEvent) {

        Order order = new Order(Integer.parseInt(orderIdTextField1.getText()),
                customerNameTextField.getText(),
                productNameTextField.getText(),
                quantityTextField.getText(),
                priceTextField.getText(),
                orderDatePicker.getValue());
    }
}