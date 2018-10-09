/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Janek
 */
package Zadanie3;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.Insets;
import javafx.scene.paint.Color;



public class Zadanie3 extends Application {
    
    
    
    @Override
    public void start(Stage primaryStage) {
 
    BorderPane root = new BorderPane();
    root.setPadding(new Insets(8,8,8,8));
            
            //Lewy panel
            GridPane Left=new GridPane();
             
            Label titleLabel1 = new Label("Pole tekstowe");
            titleLabel1.setBackground(new Background(new BackgroundFill(Color.rgb(244, 244, 244),CornerRadii.EMPTY,Insets.EMPTY)));
            titleLabel1.setTranslateY(-4);
            
            Left.getChildren().add(titleLabel1);
            Left.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(0),new BorderWidths(1.0),new Insets(10, 5, 5, 5))));
            Left.setPadding(new Insets(-5,8,8,8));
            
            //Pole tekstowe
            TextArea text=new TextArea("To jest przykładowy tekst");
            text.setPrefSize(300,800);
            
            Left.add(text,0,1);
    
            root.setLeft(Left);

        // Przyciski z prawej strony 
             GridPane Right=new GridPane();
             
            Label titleLabel2 = new Label("Narzędzia");
            titleLabel2.setBackground(new Background(new BackgroundFill(Color.rgb(244, 244, 244),CornerRadii.EMPTY,Insets.EMPTY)));
            titleLabel2.setTranslateY(-5);
            
            Right.getChildren().add(titleLabel2);
            Right.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(0),new BorderWidths(1.0),new Insets(10, 5, 5, 5))));
            Right.setPadding(new Insets(-5,8,8,8));
           
            Button RightButton1 = new Button("Wstaw plik");
            RightButton1.setPrefSize(2000, 2000);
            RightButton1.setMaxSize(120, 40);
            Right.addRow(1, RightButton1);
          
            
            Button RightButton2 = new Button("Usuń tekst");
            RightButton2.setPrefSize(2000, 2000);
            RightButton2.setMaxSize(120, 40);
            Right.addRow(2, RightButton2);
            
            Button RightButton3 = new Button("Uruchom");
            RightButton3.setPrefSize(2000, 2000);
            RightButton3.setMaxSize(120, 40);
            Right.addRow(3, RightButton3);
            RightButton3.setDisable(true);
           
            Button RightButton4 = new Button("Zapisz plik");
            RightButton4.setPrefSize(2000, 2000);
            RightButton4.setMaxSize(120, 40);
            Right.addRow(4, RightButton4);
            
            Button RightButton5 = new Button("Pomoc");
            RightButton5.setPrefSize(2000, 2000);
            RightButton5.setMaxSize(120, 40);
            Right.addRow(5, RightButton5);
            
            Button RightButton6 = new Button("O programie");
            RightButton6.setPrefSize(2000, 2000);
            RightButton6.setMaxSize(120, 40);
            Right.addRow(6, RightButton6);
            
             Button RightButton7 = new Button("Zapisz i zakończ");
            RightButton7.setPrefSize(2000, 2000);
            RightButton7.setMaxSize(120, 40);
            Right.addRow(7, RightButton7);
            
           
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