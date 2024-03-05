module julenunaiibai.tamagotchi {
    requires javafx.controls;
    requires javafx.fxml;


    opens julenunaiibai.tamagotchi to javafx.fxml;
    exports julenunaiibai.tamagotchi;
}