package com.example.calculatorfx_212;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class CalculatorGUIController {
   @FXML
   TextArea display;
   @FXML
   private Label welcomeText;
   private boolean isFirstNumber = true;

   @FXML
   protected void onHelloButtonClick() {
      welcomeText.setText("Welcome to JavaFX Application!");
   }

   public void btnNumberClick(ActionEvent actionEvent) {
      if (display.getText().equals("0") || !isFirstNumber)
         display.setText(((Button) actionEvent.getSource()).getText());
      else
         display.setText(display.getText() + ((Button) actionEvent.getSource()).getText());

   }

   public void btnOperationClick(ActionEvent actionEvent) {
      switch (((Button) actionEvent.getSource()).getText()) {
         case "+":
            CalculatorApplication.calculator.setOperation(Operation.plus);
            break;
         case "-":
            CalculatorApplication.calculator.setOperation(Operation.minus);
            break;
         case "*":
            CalculatorApplication.calculator.setOperation(Operation.mult);
            break;
         case "/":
            CalculatorApplication.calculator.setOperation(Operation.division);
            break;
         case "√":
            CalculatorApplication.calculator.setOperation(Operation.sqrt);
            break;
      }
      CalculatorApplication.calculator.setNumber1(Double.parseDouble(display.getText()));
      isFirstNumber = false;
   }

   public void btnCalculateClick(ActionEvent actionEvent) {
      CalculatorApplication.calculator.setNumber2(Double.parseDouble(display.getText()));
      CalculatorApplication.calculator.calculate();
      display.setText("" + CalculatorApplication.calculator.getResult());
      isFirstNumber = true;
   }
}