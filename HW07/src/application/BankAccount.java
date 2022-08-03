package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
/**
 *
 * @author 14918 Jiacheng Zhang
 * @version 1.0
 */
public class BankAccount extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        Rectangle rectangle = new Rectangle(150, 220, 200, 60);
        rectangle.setFill(Color.MEDIUMORCHID);
        rectangle.setStroke(Color.BLACK);
        Image image = new Image("D:\\Eclipse\\CS 1331\\HW07\\background.png");
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(500);
        imageView.setFitWidth(500);
        Circle circle = new Circle();
        circle.setCenterX(440);
        circle.setCenterY(60);
        circle.setRadius(50);
        circle.setStroke(Color.LIGHTYELLOW);
        circle.setFill(Color.ORANGE);
        Text text1 = new Text(418, 63, "$ 50.00");
        Font f1 = Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 20);
        text1.setFont(f1);
        primaryStage.setTitle("Bank Account");
        primaryStage.setScene(scene);
        pane.getChildren().addAll(imageView, rectangle, circle, text1);
        primaryStage.show();
    }
    /**
     * Main method.
     * @param args args.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
