package com.alesandro.ejercicio15o;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

/**
 * Clase Controladora de Producto Label
 */
public class ProductoLabel extends AnchorPane {
    @FXML // fx:id="imagenProductoImageView"
    private ImageView imagenProductoImageView; // Value injected by FXMLLoader

    @FXML // fx:id="nombreProductoLabel"
    private Label nombreProductoLabel; // Value injected by FXMLLoader

    @FXML // fx:id="stockProductoLabel"
    private Label stockProductoLabel; // Value injected by FXMLLoader

    /**
     * Constructor de la clase
     */
    public ProductoLabel() {
        FXMLLoader fxmlLoader = new FXMLLoader(ProductoLabel.class.getResource("/fxml/ProductoLabel.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Función que asigna la cantidad del label
     *
     * @param cantidad del label
     */
    public void setStock(double cantidad) {
        String style;
        if (cantidad > 100) {
            style = "verde";
        } else if (cantidad > 20) {
            style = "azul";
        } else {
            style = "rojo";
        }
        stockProductoLabel.setText(cantidad + "");
        this.getStyleClass().clear();
        this.getStyleClass().add(style);
    }

    /**
     * Función que asigna la imagen del label
     *
     * @param imagen del label
     */
    public void setImage(Image imagen) {
        imagenProductoImageView.setImage(imagen);
    }

    /**
     * Función que asigna el nombre del label
     *
     * @param nombre del label
     */
    public void setNombre(String nombre) {
        nombreProductoLabel.setText(nombre);
    }

}