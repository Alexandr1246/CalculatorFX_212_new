module com.example.calculatorfx_212 {
   requires javafx.controls;
   requires javafx.fxml;

   requires org.controlsfx.controls;
   requires com.dlsc.formsfx;

   opens com.example.calculatorfx_212 to javafx.fxml;
   exports com.example.calculatorfx_212;
}