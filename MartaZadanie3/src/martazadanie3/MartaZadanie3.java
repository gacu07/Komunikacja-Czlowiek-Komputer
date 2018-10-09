/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martazadanie3;


import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.application.Application;
import javafx.scene.control.TextArea;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.*;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

class Ramka extends GridPane {

    public Ramka(String title) {
        Label titleLabel = new Label(title);
        titleLabel.setBackground(new Background(new BackgroundFill(
                Color.rgb(244, 244, 244),
                CornerRadii.EMPTY,
                Insets.EMPTY)));
        titleLabel.setTranslateY(-23);
getChildren().addAll(titleLabel);
        setPadding(new Insets(10, 5, 5, 5));
        setBorder(new Border(new BorderStroke(
                Color.BLACK,
                BorderStrokeStyle.SOLID,
                new CornerRadii(0),
                new BorderWidths(1),
                new Insets(-5, 5, 5, 5))));


    }
}



public class MartaZadanie3 extends Application {
    @Override
    public void start (Stage primaryStage) {


        BorderPane root = new BorderPane();
        root.setPadding(new Insets(5,2,2,2));

        GridPane ramka= new Ramka("Panel plików");
        TextArea jeden = new TextArea();
        //ramka.addRow(1,jeden);
        //jeden.setPrefSize(400, Double.MAX_VALUE);
        ramka.add(jeden,0,1);
  
        jeden.setPrefSize(350,900);
        root.setLeft(ramka);
        // TextArea textArea = new TextArea();
        //        left.addRow(1, textArea);


        GridPane ramka2= new Ramka("Opcje uruchomienia");
        ramka2.setPrefSize(170,Double.MAX_VALUE);
        Button bbp1 = new Button("Uruchom przetwarzanie");
        bbp1.setPrefSize(150, Double.MAX_VALUE);
        bbp1.setMaxSize(150,200);
        bbp1.setDisable(true);
        ramka2.add(bbp1,0,1);
        Button bbp2 = new Button("Pomoc");
        bbp2.setPrefSize(150, Double.MAX_VALUE);
        bbp2.setMaxSize(150,200);
        ramka2.add(bbp2,0,2);
        Button bbp3 = new Button("O programie");
        bbp3.setPrefSize(150,Double.MAX_VALUE);
        bbp3.setMaxSize(150,200);
        ramka2.add(bbp3,0,3);
        Button bbp4 = new Button("Zapisz i zakończ");
        bbp4.setPrefSize(150,Double.MAX_VALUE);
        bbp4.setMaxSize(150,200);
        ramka2.add(bbp4,0,4);


        root.setRight(ramka2);



        Scene scene = new Scene(root, 600, 500);
        primaryStage.setTitle("Narzędzia przetwarzania plików");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main (String [] args) {
        launch(args);
    }
}
