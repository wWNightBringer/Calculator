package com.example.controllers;

import com.example.MainApplication;
import com.example.Solution;
import com.example.model.InitializeArray;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class MainFieldController {
    private Solution solution;
    private InitializeArray example;
    private MainApplication main;

    public MainFieldController() {
        solution = new Solution();
        example = new InitializeArray();

    }


    @FXML
    private TextField textField;
    @FXML
    private Button zero;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button AC;
    @FXML
    private Button enter;
    @FXML
    private Button point;
    @FXML
    private Button divide;
    @FXML
    private Button multiply;
    @FXML
    private Button plus;
    @FXML
    private Button minus;
    @FXML
    private Button pow;

    @FXML
    private void initZero() {
        zero.setOnAction(event -> textField.appendText("0"));
    }

    @FXML
    private void initOne() {
        one.setOnAction(event -> textField.appendText("1"));
    }

    @FXML
    private void initTwo() {
        two.setOnAction(event -> textField.appendText("2"));
    }

    @FXML
    private void initThree() {
        three.setOnAction(event -> textField.appendText("3"));
    }

    @FXML
    private void initFour() {
        four.setOnAction(event -> textField.appendText("4"));
    }

    @FXML
    private void initFive() {
        five.setOnAction(event -> textField.appendText("5"));
    }

    @FXML
    private void initSix() {
        six.setOnAction(event -> textField.appendText("6"));
    }

    @FXML
    private void initSeven() {
        seven.setOnAction(event -> textField.appendText("7"));
    }

    @FXML
    private void initEight() {
        eight.setOnAction(event -> textField.appendText("8"));
    }

    @FXML
    private void initNine() {
        nine.setOnAction(event -> textField.appendText("9"));
    }

    @FXML
    private void initPoint() {
        point.setOnAction(event -> textField.appendText("."));
    }

    @FXML
    private void initPow() {
        pow.setOnAction(event -> textField.appendText("^"));
    }

    @FXML
    private void initPlus() {
        plus.setOnAction(event -> textField.appendText("+"));
    }

    @FXML
    private void initMinus() {
        minus.setOnAction(event -> textField.appendText("-"));
    }

    @FXML
    private void initMultiply() {
        multiply.setOnAction(event -> textField.appendText("*"));
    }

    @FXML
    private void initDivide() {
        divide.setOnAction(event -> textField.appendText("/"));
    }

    @FXML
    private void initAC() {
        AC.setOnAction(event -> textField.setText(""));
    }

    @FXML
    private void initEnter() {
        enter.setOnAction(event -> {
            example.init(textField.getText());
            textField.setText(solution.getResult(example.getCharacterList(), example.getStringList()));
        });

    }

    public void setMain(MainApplication main) {
        this.main = main;
    }

    public MainApplication getMain() {
        return main;
    }

    @FXML
    private void keyPressed(KeyEvent event) {
        switch (event.getCode()) {
            case ENTER:{
                example.init(textField.getText());
                textField.setText(solution.getResult(example.getCharacterList(), example.getStringList()));
                break;
            }
            case ESCAPE:{
                getMain().getStage().close();
                break;
            }
            default:
                textField.setText("Err");
        }

    }


}
