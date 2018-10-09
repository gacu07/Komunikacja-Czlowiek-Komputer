/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Janek
 */
package Zadanie2;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.Insets;
import javafx.scene.paint.Color;



public class Zadanie2 extends Application {
    
    
    
    @Override
    public void start(Stage primaryStage) {
 
    BorderPane root = new BorderPane();
    root.setPadding(new Insets(8,8,8,8));
            
            //Lewy panel
            GridPane Left=new GridPane();
             
            Label titleLabel1 = new Label("Panel plików");
            titleLabel1.setBackground(new Background(new BackgroundFill(Color.rgb(244, 244, 244),CornerRadii.EMPTY,Insets.EMPTY)));
            titleLabel1.setTranslateY(-22);
            
            Left.getChildren().add(titleLabel1);
            Left.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(0),new BorderWidths(1.0),new Insets(10, 5, 5, 5))));
            Left.setPadding(new Insets(8,8,8,8));
   
    
            //Label 1
            Label label1 = new Label("Źródło");
            label1.setPadding(new Insets(0,70,0,10));
            //Pole tekstowe 1
            TextField textfield1= new TextField();
            //Przcisk 1
            Button button1 = new Button("Przeglądaj");
            //Label 2
            Label label2 = new Label("Wynik");
            label2.setPadding(new Insets(0,70,0,10));
            //Pole tekstowe 2
            TextField textfield2= new TextField();
            //Przcisk 2
            Button button2 = new Button("Przeglądaj");
            
            Left.setVgap(10);
            
            Left.add(label1,0,0);
            Left.add(textfield1,1,0);
            Left.add(button1,2,0);
    
            Left.add(label2,0,1);
            Left.add(textfield2,1,1);
            Left.add(button2,2,1);
    
    
             root.setLeft(Left);

        // Przyciski z prawej strony 
             GridPane Right=new GridPane();
             
            Label titleLabel = new Label("Opcje uruchomienia");
            titleLabel.setBackground(new Background(new BackgroundFill(Color.rgb(244, 244, 244),CornerRadii.EMPTY,Insets.EMPTY)));
            titleLabel.setTranslateY(-5);
            
            Right.getChildren().add(titleLabel);
            Right.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(0),new BorderWidths(1.0),new Insets(10, 5, 5, 5))));
            Right.setPadding(new Insets(-5,8,8,8));
           
            Button RightButton1 = new Button("Uruchom przetwarzanie");
            RightButton1.setPrefSize(2000, 2000);
            RightButton1.setMaxSize(120, Double.MAX_VALUE);
            Right.addRow(1, RightButton1);
            RightButton1.setDisable(true);
            
            Button RightButton2 = new Button("Pomoc");
            RightButton2.setPrefSize(2000, 2000);
            RightButton2.setMaxSize(120, Double.MAX_VALUE);
            Right.addRow(2, RightButton2);
            
            Button RightButton3 = new Button("O programie");
            RightButton3.setPrefSize(2000, 2000);
            RightButton3.setMaxSize(120, Double.MAX_VALUE);
            Right.addRow(3, RightButton3);
           
            Button RightButton4 = new Button("Zapisz i zakończ");
            RightButton4.setPrefSize(2000, 2000);
            RightButton4.setMaxSize(120, Double.MAX_VALUE);
            Right.addRow(4, RightButton4);
            
           
            root.setRight(Right);
            
    Scene scene = new Scene(root,700,350);
    primaryStage.setTitle("Narzędzie przetwarzania plików");
    primaryStage.setScene(scene);
    primaryStage.show();
    }

      public static void main(String[] args) {
        launch(args);
    }
}
    