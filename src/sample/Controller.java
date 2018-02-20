package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button nullOperation;

    @FXML
    private Label outputOperation;

    @FXML
    private Button equalilyClick;

    @FXML
    private Button constFalseClick;

    @FXML
    private Button obernNotImplicationClick;

    @FXML
    private Button strilkaPirsaClick;

    @FXML
    private Button notSecondClick;

    @FXML
    private Button notFirstClick;

    @FXML
    private Button xOrClick;

    @FXML
    private Button obernImplicationClick;

    @FXML
    private Button constTrueClick;

    @FXML
    private Button repeatFirstClick;

    @FXML
    private Button notImplicationClick;

    @FXML
    private Label output;

    @FXML
    private Button implicationClick;

    @FXML
    private Button equalsClick;

    @FXML
    private Button andClick;

    @FXML
    private Button strihShafferaClick;

    @FXML
    private Button repeatSecondClick;

    @FXML
    private Button orClick;

    @FXML
    private Button falseOperation;

    @FXML
    private Button trueOperation;

    @FXML
    private Button clearClick;

    BooleanOperations operations = new BooleanOperations();

    String value1;
    String value2;
    String valueTemp;

    int operator;

    @FXML
    void initialize() {
        trueOperation.setOnAction(event -> {
            valueTemp = "true";
            outputOperation.setText("true");
        });
        nullOperation.setOnAction(event -> {
            valueTemp = "null";
            outputOperation.setText("null");
        });
        falseOperation.setOnAction(event -> {
            valueTemp = "false";
            outputOperation.setText("false");
        });

        andClick.setOnAction(event -> {
            operator = 1;
            value1 = outputOperation.getText();
            outputOperation.setText("");
            //output.setText("");
        });
        orClick.setOnAction(event -> {
            operator = 2;
            value1 = outputOperation.getText();
            outputOperation.setText("");
            //output.setText("");
        });
        equalilyClick.setOnAction(event -> {
            operator = 3;
            value1 = outputOperation.getText();
            outputOperation.setText("");
            //output.setText("");
        });
        xOrClick.setOnAction(event -> {
            operator = 4;
            value1 = outputOperation.getText();
            outputOperation.setText("");
            //output.setText("");
        });
        strilkaPirsaClick.setOnAction(event -> {
            operator = 5;
            value1 = outputOperation.getText();
            outputOperation.setText("");
            //output.setText("");
        });
        strihShafferaClick.setOnAction(event -> {
            operator = 6;
            value1 = outputOperation.getText();
            outputOperation.setText("");
            //output.setText("");
        });
        implicationClick.setOnAction(event -> {
            operator = 7;
            value1 = outputOperation.getText();
            outputOperation.setText("");
            //output.setText("");
        });
        obernImplicationClick.setOnAction(event -> {
            operator = 8;
            value1 = outputOperation.getText();
            outputOperation.setText("");
            //output.setText("");
        });
        notImplicationClick.setOnAction(event -> {
            operator = 9;
            value1 = outputOperation.getText();
            outputOperation.setText("");
            //output.setText("");
        });
        obernNotImplicationClick.setOnAction(event -> {
            operator = 10;
            value1 = outputOperation.getText();
            outputOperation.setText("");
            //output.setText("");
        });
        repeatFirstClick.setOnAction(event -> {
            operator = 11;
            value1 = outputOperation.getText();
            outputOperation.setText("");
            //output.setText("");
        });
        repeatSecondClick.setOnAction(event -> {
            operator = 12;
            value1 = outputOperation.getText();
            outputOperation.setText("");
            //output.setText("");
        });
        notFirstClick.setOnAction(event -> {
            operator = 13;
            value1 = outputOperation.getText();
            outputOperation.setText("");
            //output.setText("");
        });
        notSecondClick.setOnAction(event -> {
            operator = 14;
            value1 = outputOperation.getText();
            outputOperation.setText("");
            //output.setText("");
        });
        constTrueClick.setOnAction(event -> {
            operator = 15;
            value1 = outputOperation.getText();
            outputOperation.setText("");
            //output.setText("");
        });
        constFalseClick.setOnAction(event -> {
            operator = 16;
            value1 = outputOperation.getText();
            outputOperation.setText("");
            //output.setText("");
        });

        clearClick.setOnAction(event -> {
            outputOperation.setText("");
            output.setText("");
            operator = 0;
        });

        equalsClick.setOnAction(event -> {
            switch (operator) {
                case 1:
                    //value2 = output.getText();
                    value2 = valueTemp;
                    output.setText(String.valueOf(operations.conjunction(value1, value2)));
                    break;
                case 2:
                    //value2 = output.getText();
                    value2 = valueTemp;
                    output.setText(String.valueOf(operations.disjunction(value1, value2)));
                    break;
                case 3:
                    //value2 = output.getText();
                    value2 = valueTemp;
                    output.setText(String.valueOf(operations.equality(value1, value2)));
                    break;
                case 4:
                    //value2 = output.getText();
                    value2 = valueTemp;
                    output.setText(String.valueOf(operations.exclusiveOr(value1, value2)));
                    break;
                case 5:
                    //value2 = output.getText();
                    value2 = valueTemp;
                    output.setText(String.valueOf(operations.notOr(value1, value2)));
                    break;
                case 6:
                    //value2 = output.getText();
                    value2 = valueTemp;
                    output.setText(String.valueOf(operations.notAnd(value1, value2)));
                    break;
                case 7:
                    //value2 = output.getText();
                    value2 = valueTemp;
                    output.setText(String.valueOf(operations.implication(value1, value2)));
                    break;
                case 8:
                    //value2 = output.getText();
                    value2 = valueTemp;
                    output.setText(String.valueOf(operations.converseImplication(value1, value2)));
                    break;
                case 9:
                    //value2 = output.getText();
                    value2 = valueTemp;
                    output.setText(String.valueOf(operations.notImplication(value1, value2)));
                    break;
                case 10:
                    //value2 = output.getText();
                    value2 = valueTemp;
                    output.setText(String.valueOf(operations.notConverseImplication(value1, value2)));
                    break;
                case 11:
                    //value2 = output.getText();
                    value2 = valueTemp;
                    output.setText(String.valueOf(operations.repeatTheFirstArgument(value1, value2)));
                    break;
                case 12:
                    //value2 = output.getText();
                    value2 = valueTemp;
                    output.setText(String.valueOf(operations.repeatTheSecondArgument(value1, value2)));
                    break;
                case 13:
                    //value2 = output.getText();
                    value2 = valueTemp;
                    output.setText(String.valueOf(operations.notTheFirstArgument(value1, value2)));
                    break;
                case 14:
                    //value2 = output.getText();
                    value2 = valueTemp;
                    output.setText(String.valueOf(operations.notTheSecondArgument(value1, value2)));
                    break;
                case 15:
                    //value2 = output.getText();
                    value2 = valueTemp;
                    output.setText(String.valueOf(operations.constTrue(value1, value2)));
                    break;
                case 16:
                    // value2 = output.getText();
                    value2 = valueTemp;
                    output.setText(String.valueOf(operations.constFalse(value1, value2)));
                    break;

                default: break;
            }
        });
    }
}