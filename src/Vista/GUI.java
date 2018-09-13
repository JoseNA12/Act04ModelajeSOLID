package Vista;

import Controlador.Controlador;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class GUI extends Application {

    @FXML private ListView lv_algoritmos;
    @FXML private ComboBox <String> cb_alfabetos;
    @FXML private TextArea ta_textoEntrada, ta_textoProcesado;
    @FXML private CheckBox cb_codificar;
    @FXML private Button bt_procesar;

    private Controlador miControlador;

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("GUI.fxml"));
        primaryStage.setTitle("Procesamiento textual");

        // cb_alfabetos.getItems().addAll("Alfabeto 1");

        primaryStage.setScene(new Scene(root, 600, 340));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void bt_action_procesar()
    {
        if (!ta_textoEntrada.getText().equals(""))
        {

        }
        else
        {
            // se bede insertar una entrada de texto
        }

    }

}
