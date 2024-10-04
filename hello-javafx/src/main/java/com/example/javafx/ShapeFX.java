package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class ShapeFX extends Application {
    enum Figure {ELLIPSE, CIRCLE, LINE, RECTANGLE}

    private CheckBox createCheckbox(Group picture) {
        CheckBox toggleStrokes = new CheckBox("Stroke on and off");
        toggleStrokes.setSelected(true);
        toggleStrokes.selectedProperty().addListener(
                (prop, oldValue, newValue) -> {
                    for (var node : picture.getChildren()) {
                        ((Shape)node).setStroke(newValue ? Color.BLACK : Color.TRANSPARENT);
                    }
                });
        return toggleStrokes;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println(System.getProperty("user.dir"));

        // Circle Radius
        double radius = Math.random() * 100;

        // Picture
        Group picture = new Group();
        createShape(Figure.CIRCLE, 50, 50, radius, radius, Color.YELLOW, picture);
        createShape(Figure.ELLIPSE, 200, 100, 30, 120, Color.RED, picture);
        createShape(Figure.RECTANGLE, 120, 100, 30, 100, Color.BLUE, picture);
        createShape(Figure.CIRCLE, 180, 150, 30, 30, Color.GREEN, picture);
        var line = createShape(Figure.LINE, 200, 100, 380, 170, Color.BLACK, picture);
        line.setStrokeWidth(5);
        picture.setRotate(20);
        picture.setTranslateX(10);
        picture.setTranslateY(50);

        // Image
        Image image = new Image(new FileInputStream("src/main/resources/images/hello.png"));
        ImageView imageView = new ImageView(image);
        imageView.setX(280);
        imageView.setY(110);
        imageView.setFitWidth(100);
        imageView.setFitHeight(100);

        // Root
        Shape sky = createShape(Figure.RECTANGLE, 0, 0, 500, 250, Color.STEELBLUE, null);
        sky.setStroke(Color.LIGHTSKYBLUE);
        Text text = new Text(400, 30, "Hello FX");
        text.setFont(Font.font(20));
        BorderPane root = new BorderPane(); // back to front order
        root.setBackground(Background.fill(Color.LIGHTBLUE));
        root.getChildren().add(sky);
        root.setCenter(picture);
        root.setTop(createCheckbox(picture));
        root.setRight(imageView);
        root.setBottom(text);

        // Scene
        Scene scene = new Scene(root, 500, 350);
        primaryStage.setTitle("ShapeFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Shape createShape(
            Figure figure,
            double x,
            double y,
            double width,
            double height,
            Color color,
            Group group) {
        Shape shape = switch (figure) {
            case ELLIPSE -> new Ellipse(x, y, width, height);
            case CIRCLE -> new Circle(x, y, width);
            case LINE -> new Line(x, y, width, height);
            case RECTANGLE -> new Rectangle(x, y, width, height);
        };
        shape.setFill(color);
        shape.setStroke(Color.BLACK);
        shape.setStrokeWidth(3);
        shape.setStrokeType(StrokeType.OUTSIDE);
        if (group != null) {
            group.getChildren().add(shape);
        }
        return shape;
    }

    /// Run with `./gradlew run -PmainClass=ShapeFX`
    public static void main(String[] args) {
        launch(args);
    }
}
