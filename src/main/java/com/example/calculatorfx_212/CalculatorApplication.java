package com.example.calculatorfx_212;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorApplication extends Application {
   public static Calculator calculator;
   @Override
   public void start(Stage stage) throws IOException {
      FXMLLoader fxmlLoader = new FXMLLoader(CalculatorApplication.class.getResource("hello-view.fxml"));
      Scene scene = new Scene(fxmlLoader.load(), 300, 400);
      stage.setTitle("CalculatorFX");
      stage.getIcons().add(new Image("https://www.iconsdb.com/icons/preview/green/calculator-xxl.png"));
      stage.setScene(scene);
      stage.show();
   }

   public static void main(String[] args) {
      calculator = new Calculator();
      launch();
   }
}