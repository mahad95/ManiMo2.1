package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    @FXML
    public ToggleGroup Group;

    @FXML
    public ListView<String> sortObjectsList;

    @FXML
    public ListView<String> addObjectsList;

    @FXML
    public RadioButton linear;

    @FXML
    public RadioButton digressiv;

    @FXML
    public TextField txtLinear;

    @FXML
    public void setText(){
        linear.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> obs, Boolean wasPreviouslySelected, Boolean isNowSelected) {
                if (isNowSelected) {
                    txtLinear.setText("Linear");
                }
            }
        });
        digressiv.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> obs, Boolean wasPreviouslySelected, Boolean isNowSelected) {
                if (isNowSelected) {
                    txtLinear.setText("Degressiv");

                }}

            //     rb3.selectedProperty().addListener(new ChangeListener<String>() {
            //       public void changed(ObservableValue<? extends Boolean> obs, Boolean wasPreviouslySelected, Boolean isNowSelected) {
            //          if (isNowSelected) {
            //            txtLinear.setText("Value");
        });
    }

}
