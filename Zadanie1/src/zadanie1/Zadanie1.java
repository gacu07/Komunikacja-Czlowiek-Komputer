/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 *
 * @author Janek
 */
public class Zadanie1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
      BorderPane root = new BorderPane();
     
        
       //Pola tekstowe
        GridPane Left = new GridPane();
         root.setLeft(Left);
         
        TextArea Upper = new TextArea();
        Left.addRow(0,new Label("Źródło"));
        Upper.setText("OLA");
        Left.addRow(1,Upper);
        Upper.setMaxWidth(300.00);
        Upper.setMinWidth(100.00);
        
        Left.addRow(2,new Label("Wynik"));
        TextArea Lower = new TextArea();
        Lower.setText("ola");
        Left.addRow(3,Lower);
        Lower.setMaxWidth(300.00);
        Lower.setMinWidth(100.00);

        
     
       

        // Przyciski z prawej strony 
        GridPane Right = new GridPane();
        Right.addRow(0,new Label("Narzędzia"));
        root.setCenter(Right);

            Button RightButton1 = new Button("Przetwarzaj!");
            RightButton1.setPrefSize(2000, 2000);
            Right.addRow(1, RightButton1);
            
            Button RightButton2 = new Button("Wyczyść źródło");
            RightButton2.setPrefSize(2000, 2000);
            Right.addRow(2, RightButton2);
            
            Button RightButton3 = new Button("Pomoc");
            RightButton3.setPrefSize(2000, 2000);
            Right.addRow(3, RightButton3);
            RightButton3.setDisable(true);
            
            Button RightButton4 = new Button("O programie");
            RightButton4.setPrefSize(2000, 2000);
            Right.addRow(4, RightButton4);
            
            Button RightButton5 = new Button("Zapisz i zakończ");
            RightButton5.setPrefSize(2000, 2000);
            Right.addRow(5, RightButton5);

            
Scene scene = new Scene(root,300,250);
primaryStage.setTitle("Zmiana wielkości liter");
primaryStage.setScene(scene);
primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}


/*


border	anchor grid

grid 2 wiersze
grid 5 wierszy

minSize
_prefSize_
maxSize


package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
/*
GridPane root=new GridPane();
for(int i=0; i<5;i++)
{
    for(int j=0; j<3;j++) {
        root.add(new Button("Przycisk nr" + i+""+j));
    }
}

        BorderPane root = new BorderPane();
        // Button b1=new Button("Top");
        // b1.setPrefWidth(Double.MAX_VALUE);root.setTop(b1);

        //  Button b2=new Button("Bottom");
        //  b2.setPrefWidth(Double.MAX_VALUE);root.setTop(b2));
        GridPane left = new GridPane();
        Button b3 = new Button("BottomLeft");
        b3.setPrefSize(200, 200);
        root.setLeft(b3);
        left.addRow(0,new Label("Source"));
        Button b4 = new Button("TopLeft");
        b4.setPrefSize(400, 400);
        root.setLeft(b4);
       //TextArea abcd=new TextArea();
        // Button b4=new Button("Right");
        // b4.setPrefWidth(Double.MAX_VALUE);root.setTop(b4));
        //Button b5 = new Button("Center");
        //b5.setPrefWidth(Double.MAX_VALUE);
        //root.setTop(b5);

        GridPane center = new GridPane();
       center.addRow(0,new Label("Narzedzia"));


        for (int i = 1; i < 6; i++) {
            Button b = new Button("Przycisk nr " + i);
            b.setPrefSize(2000, 2000);
            center.addRow(i, b);
        }

        root.setCenter(center);

       /* root.setTop(new Button(Top));
        root.setBottom(new Button(Top));
        root.setLeft(new Button(Top));
        root.setRight(new Button(Top));

      

Scene scene = new Scene(root,300,250);
primaryStage.setTitle("Hello World");
primaryStage.setScene(scene);
primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}


//StackPane root=new StackPane();
//Scene scene = new Scene(root,300,250);
//primaryStage.setTitle("Hello World");
//primaryStage.setScene(scene);
//primaryStage.show();



//BoarderPane root=new BoarderPane();
//Scene scene = new Scene(root,300,250);
//primaryStage.setTitle("Hello World");
//primaryStage.setScene(scene);
//primaryStage.show();


   // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
       // primaryStage.setTitle("Hello World");
           //     primaryStage.setScene(new Scene(root, 300, 275));
            //    primaryStage.show();

*/