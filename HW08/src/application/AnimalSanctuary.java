package application;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
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
public class AnimalSanctuary extends Application {
    private int roomNumber = 0;
    private int countAnimals = 0;
    private boolean isEmpty1 = true, isEmpty2 = true, isEmpty3 = true,
            isEmpty4 = true, isEmpty5 = true, isEmpty6 = true;
    private int[] textArea = {0, 0, 0, 0, 0, 0};
    private Group root = new Group();
    private GridPane grid = new GridPane();
    private Label label1 = new Label("Type name here:");
    private Label label2 = new Label("Type health here:");
    private Label label3 = new Label("Pick animal type:");
    private ComboBox<Animal> combo = new ComboBox<>();
    private TextField tf1 = new TextField();
    private TextField tf2 = new TextField();
    private Button btAdd = new Button("Add animal");
    private Text empty1 = new Text(428, 258, "Empty");
    private Text empty2 = new Text(558, 258, "Empty");
    private Text empty3 = new Text(688, 258, "Empty");
    private Text empty4 = new Text(428, 388, "Empty");
    private Text empty5 = new Text(558, 388, "Empty");
    private Text empty6 = new Text(688, 388, "Empty");
    private Rectangle rectangle = new Rectangle(200, 540, 750, 70);
    private Rectangle rectangle1 = new Rectangle(390, 200, 110, 110);
    private Rectangle rectangle2 = new Rectangle(520, 200, 110, 110);
    private Rectangle rectangle3 = new Rectangle(650, 200, 110, 110);
    private Rectangle rectangle4 = new Rectangle(390, 330, 110, 110);
    private Rectangle rectangle5 = new Rectangle(520, 330, 110, 110);
    private Rectangle rectangle6 = new Rectangle(650, 330, 110, 110);
    private Alert alert = new Alert(AlertType.INFORMATION);
    private Text text1 = new Text(340, 94, "The Animal Sanctuary");
    private Font f1 = Font.font("Comic Sans MS",
            FontWeight.SEMI_BOLD, FontPosture.REGULAR, 45);
    @Override
    public void start(Stage primaryStage) {
        grid.setPadding(new Insets(1));
        grid.setHgap(5.5);
        grid.setVgap(5.5);

        combo.setPrefSize(150, 20);
        combo.setPromptText("Select animal type");
        combo.getItems().addAll(Animal.DOG, Animal.CAT, Animal.SQUIRREL, Animal.BIRD);

        tf1.setPromptText("Type name here");
        tf2.setPromptText("Type health here");

        grid.add(label1, 44, 98);
        grid.add(tf1, 44, 99);
        grid.add(label2, 49, 98);
        grid.add(tf2, 49, 99);
        grid.add(label3, 54, 98);
        grid.add(combo, 54, 99);
        grid.add(btAdd, 59, 99);
        btAdd.setPrefSize(100, 25);

        GridPane.setHalignment(label1, HPos.CENTER);
        GridPane.setHalignment(label2, HPos.CENTER);
        GridPane.setHalignment(label3, HPos.CENTER);

        rectangle.setFill(Color.WHITE);
        rectangle1.setFill(Color.WHITE);
        rectangle1.setStroke(Color.BLACK);
        rectangle2.setFill(Color.WHITE);
        rectangle2.setStroke(Color.BLACK);
        rectangle3.setFill(Color.WHITE);
        rectangle3.setStroke(Color.BLACK);
        rectangle4.setFill(Color.WHITE);
        rectangle4.setStroke(Color.BLACK);
        rectangle5.setFill(Color.WHITE);
        rectangle5.setStroke(Color.BLACK);
        rectangle6.setFill(Color.WHITE);
        rectangle6.setStroke(Color.BLACK);

        Scene scene = new Scene(root, 1152, 648);

        Image image = new Image("animalImage.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(648);
        imageView.setFitWidth(1152);

        text1.setFill(Color.LIGHTGREEN);
        text1.setFont(f1);

        alert.setTitle("Alert");
        alert.setHeaderText("Warning!!!");
        alert.setContentText("There is no more room!");

        primaryStage.setTitle("My Animal Sanctuary");

        root.getChildren().add(imageView);
        root.getChildren().add(text1);
        root.getChildren().add(rectangle);
        root.getChildren().add(grid);
        root.getChildren().addAll(rectangle1, rectangle2, rectangle3, rectangle4, rectangle5, rectangle6);
        root.getChildren().addAll(empty1, empty2, empty3, empty4, empty5, empty6);

        btAddAction();

        rectangleAction();

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    /**
     * Button Action Event.
     */
    public void btAddAction() {
        btAdd.setOnAction(e -> {
            String name;
            String health;
            String type;
            if (tf1.getText() == null || tf1.getText().trim().isEmpty()) {
                name = "No Name Yet";
            } else {
                name = tf1.getText();
            }
            tf1.setText("");
            if (tf2.getText() == null || tf2.getText().trim().isEmpty()
                    || (!tf2.getText().equals("1") && !tf2.getText().equals("2")
                    && !tf2.getText().equals("3") && !tf2.getText().equals("4")
                    && !tf2.getText().equals("5"))) {
                health = "5";
            } else {
                health = tf2.getText();
            }
            tf2.setText("");
            if (combo.getValue() == null) {
                type = "Unknown Type";
            } else {
                type = combo.getValue().name();
            }
            combo.setValue(null);

            for (int i = 0; i < textArea.length; i++) {
                roomNumber = 0;
                if (countAnimals == 6) {
                    alert.showAndWait();
                    break;
                }
                if (textArea[i] == 0) {
                    textArea[i] = 1;
                    roomNumber = i + 1;
                    countAnimals++;
                    switch (i) {
                    case 0:
                        isEmpty1 = false;
                        break;
                    case 1:
                        isEmpty2 = false;
                        break;
                    case 2:
                        isEmpty3 = false;
                        break;
                    case 3:
                        isEmpty4 = false;
                        break;
                    case 4:
                        isEmpty5 = false;
                        break;
                    case 5:
                        isEmpty6 = false;
                        break;
                    default:
                        System.out.println("The value of i is invalid");
                    }
                    break;
                }
            }

            switch (roomNumber) {
            case 1:
                empty1.setText(name + "\n" + health + "\n" + type);
                empty1.setX(408);
                empty1.setY(248);
                rectangle1.setFill(Color.LIGHTGREEN);
                break;
            case 2:
                empty2.setText(name + "\n" + health + "\n" + type);
                empty2.setX(538);
                empty2.setY(248);
                rectangle2.setFill(Color.LIGHTGREEN);
                break;
            case 3:
                empty3.setText(name + "\n" + health + "\n" + type);
                empty3.setX(668);
                empty3.setY(248);
                rectangle3.setFill(Color.LIGHTGREEN);
                break;
            case 4:
                empty4.setText(name + "\n" + health + "\n" + type);
                empty4.setX(408);
                empty4.setY(378);
                rectangle4.setFill(Color.LIGHTGREEN);
                break;
            case 5:
                empty5.setText(name + "\n" + health + "\n" + type);
                empty5.setX(538);
                empty5.setY(378);
                rectangle5.setFill(Color.LIGHTGREEN);
                break;
            case 6:
                empty6.setText(name + "\n" + health + "\n" + type);
                empty6.setX(668);
                empty6.setY(378);
                rectangle6.setFill(Color.LIGHTGREEN);
                break;
            default:
                System.out.println("The value of roomNumber is invalid");
            }
        });
    }
    /**
     * Mouse click.
     */
    public void rectangleAction() {
        rectangle1.setOnMouseClicked(e -> {
            empty1.setText("Empty");
            empty1.setX(428);
            empty1.setY(258);
            rectangle1.setFill(Color.WHITE);
            textArea[0] = 0;
            if (!isEmpty1) {
                countAnimals--;
                if (countAnimals < 0) {
                    countAnimals = 0;
                }
                System.out.println(countAnimals);
            }
            isEmpty1 = true; });
        rectangle2.setOnMouseClicked(e -> {
            empty2.setText("Empty");
            empty2.setX(558);
            empty2.setY(258);
            rectangle2.setFill(Color.WHITE);
            textArea[1] = 0;
            if (!isEmpty2) {
                countAnimals--;
                if (countAnimals < 0) {
                    countAnimals = 0;
                }
                System.out.println(countAnimals);
            }
            isEmpty2 = true; });
        rectangle3.setOnMouseClicked(e -> {
            empty3.setText("Empty");
            empty3.setX(688);
            empty3.setY(258);
            rectangle3.setFill(Color.WHITE);
            textArea[2] = 0;
            if (!isEmpty3) {
                countAnimals--;
                if (countAnimals < 0) {
                    countAnimals = 0;
                }
                System.out.println(countAnimals);
            }
            isEmpty3 = true; });
        rectangle4.setOnMouseClicked(e -> {
            empty4.setText("Empty");
            empty4.setX(428);
            empty4.setY(388);
            rectangle4.setFill(Color.WHITE);
            textArea[3] = 0;
            if (!isEmpty4) {
                countAnimals--;
                if (countAnimals < 0) {
                    countAnimals = 0;
                }
                System.out.println(countAnimals);
            }
            isEmpty4 = true; });
        rectangle5.setOnMouseClicked(e -> {
            empty5.setText("Empty");
            empty5.setX(558);
            empty5.setY(388);
            rectangle5.setFill(Color.WHITE);
            textArea[4] = 0;
            if (!isEmpty5) {
                countAnimals--;
                if (countAnimals < 0) {
                    countAnimals = 0;
                }
                System.out.println(countAnimals);
            }
            isEmpty5 = true; });
        rectangle6.setOnMouseClicked(e -> {
            empty6.setText("Empty");
            empty6.setX(688);
            empty6.setY(388);
            rectangle6.setFill(Color.WHITE);
            textArea[5] = 0;
            if (!isEmpty6) {
                countAnimals--;
                if (countAnimals < 0) {
                    countAnimals = 0;
                }
                System.out.println(countAnimals);
            }
            isEmpty6 = true; });
    }
    /**
     * Launch.
     * @param args args.
     */
    public static void main(String[] args) {
        launch(args);
    }
}