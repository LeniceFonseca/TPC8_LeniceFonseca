package com.example.tpc8_lenicefonseca;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {

        VBox vBox = new VBox();

        Rectangle rectangle = new Rectangle(100, 100);
        rectangle.setFill(Color.BLUE);
        rectangle.setTranslateX(120);
        rectangle.setTranslateY(120);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.BLACK);

        Circle circle = new Circle(100, 150, 50);
        circle.setFill(Color.ORANGE);
        circle.setTranslateX(375);
        circle.setTranslateY(120);

        Polygon triangle = new Polygon();
        triangle.setFill(Color.YELLOW);
        triangle.getPoints().addAll(
                150.0, 0.0,
                0.0, 0.0,
                0.0, -130.0
        );
        triangle.setTranslateX(230);
        triangle.setTranslateY(130);

        Line line = new Line(50, 50, 250, 250);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        line.setTranslateX(300);
        line.setTranslateY(-210);

        Image image = new Image("file:/home/lenice/Documents/POO-23/TPC8_LeniceFonseca/src/main/resources/com/example/tpc8_lenicefonseca/uta-logo.png");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(500);
        imageView.setFitHeight(100);
        imageView.setTranslateX(50);
        imageView.setTranslateY(-80);

        Text text = new Text("TPC8");
        text.setFill(Color.GREEN);
        text.setFont(Font.font(72));
        text.setTranslateX(50);
        text.setTranslateY(50);

        vBox.getChildren().addAll(text, rectangle, triangle, circle, line, imageView);

        Scene scene = new Scene(vBox, 600, 650);
        scene.setFill(Color.LIGHTSKYBLUE);
        stage.setScene(scene);
        stage.setTitle("TPC 8 - Trabalhar com scene");
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}