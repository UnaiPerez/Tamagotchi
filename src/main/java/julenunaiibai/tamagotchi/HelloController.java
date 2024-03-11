package julenunaiibai.tamagotchi;

import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

import java.util.Map;
import java.util.Objects;

public class HelloController {
    @FXML
    private Label status;

    @FXML
    private ImageView tamagotchiImage;
    private int felicidad = 0;
    private int hambre = 0;

    public void inicializar(){
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("kk.png")));
        tamagotchiImage.setImage(image);
        updateStatus();
    }
    void alimentar(ActionEvent event){
        hambre = Math.max(0, hambre-10);
        updateStatus();
    }
    void jugar(ActionEvent event){
        felicidad = Math.min(100,felicidad+10);
        updateStatus();
    }
    private void updateStatus(){
        status.setText("Felicidad: " + felicidad + "%, Hambre: "+ hambre + "%");
    }
}