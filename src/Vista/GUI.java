package Vista;

import Controlador.Controlador;
import Controlador.AlgoritmosDTO;
import Modelo.Alfabeto;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.util.List;

public class GUI extends Application {

    @FXML private ListView lv_algoritmos;
    @FXML private ComboBox <Alfabeto> cb_alfabetos;
    @FXML private TextArea ta_textoEntrada, ta_textoProcesado;
    @FXML private CheckBox cb_codificar;
    @FXML private Button bt_procesar;

    private Controlador miControlador = new Controlador();

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("GUI.fxml"));
        primaryStage.setTitle("Procesamiento textual");

        primaryStage.setScene(new Scene(root, 600, 340));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @FXML
    void initialize(){
        initComp();
    }

    public void bt_action_procesar()
    {

        if (!ta_textoEntrada.getText().equals(""))
        {

        }
        else
        {
            // se debe insertar una entrada de texto
        }
    }

    private List<String> ObtenerAlgorimosMarcados()
    {
        return null;
    }

    private void initComp()
    {
        cb_alfabetos.getItems().addAll(miControlador.CargarAlfabetos());
        Callback<ListView<Alfabeto>, ListCell<Alfabeto>> factory = lv -> new ListCell<Alfabeto>() {

            @Override
            protected void updateItem(Alfabeto item, boolean empty) {
                super.updateItem(item, empty);
                setText(empty ? "" : item.getSimbolos());
            }

        };

        cb_alfabetos.setCellFactory(factory);
        cb_alfabetos.setButtonCell(factory.call(null));
    }

}
