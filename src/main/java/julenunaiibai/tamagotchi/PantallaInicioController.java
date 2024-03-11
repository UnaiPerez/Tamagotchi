package julenunaiibai.tamagotchi;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PantallaInicioController extends Application {

    @FXML
    private Button exitBoton;

    @FXML
    private ImageView huevo;

    @FXML
    private TextField iniciales;

    @FXML
    private ImageView marutchi;

    @FXML
    private Text nombre;

    @FXML
    private Button playBoton;

    @FXML
    private ImageView titulo;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }
}
