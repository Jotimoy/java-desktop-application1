package com.example.jotirmoymollick;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class ProductController
{
    @javafx.fxml.FXML
    private TextField productNameTextField;
    @javafx.fxml.FXML
    private TextField setPricingTextField;
    @javafx.fxml.FXML
    private TextField updateDescriptionsTextField;

    @javafx.fxml.FXML
    private TableColumn<Product,String> productnameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Product,Integer> priceTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Product,String> categoryTableColumn;

    @javafx.fxml.FXML
    private TableColumn<Product,LocalDate> manufactureDateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Product, LocalDate> expireDateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Product,String> updateDescriptionsTableColumn;

    private ArrayList<String> productList;
    private ArrayList<Product> productArrayList;
    private ArrayList<String> priceList;
    private ArrayList<String> categoryList;
    private ArrayList<LocalDate> manufactureDateList;
    private ArrayList<LocalDate> expireDateList;
    private ArrayList<String> updateDescriptionsList;




    @javafx.fxml.FXML
    private ComboBox<String> categoryComboBox;

    @javafx.fxml.FXML
    public void initialize() {

        productList = new ArrayList<>();
        productArrayList = new ArrayList<>();
        priceList = new ArrayList<>();
        categoryList = new ArrayList<>();
        manufactureDateList = new ArrayList<>();
        expireDateList = new ArrayList<>();
        updateDescriptionsList = new ArrayList<>();

        productnameTableColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("productName"));
        priceTableColumn.setCellValueFactory(new PropertyValueFactory<Product, Integer>("price"));
        categoryTableColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("category"));
        manufactureDateTableColumn.setCellValueFactory(new PropertyValueFactory<Product,LocalDate>(LocalDate.));
        expireDateTableColumn.setCellValueFactory(new PropertyValueFactory<Product, LocalDate>("expiryDate"));
        updateDescriptionsTableColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("description"));

        categoryComboBox.getItems().addAll("Creatine","Amino Acids","Carb Supplements","Carb Supplements","L-Arginine","Dietary supplements", "including vitamins", "minerals", "Protein Powder");

    }

    @javafx.fxml.FXML
    public void importButtonOnAction(ActionEvent actionEvent) {

        String str="";
        for (String product : productList){
            str+= product +"\n";
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setTitle("Information Alert");
            a.setHeaderText("Product Data");
            a.setContentText(str);
            a.showAndWait();
        }

    }
}