package com.mislis.components;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ButtonFactory extends Button{

  public ButtonFactory(String text){
    this.setText(text);
    this.setPrefWidth(200);
    this.setPrefHeight(50);
    this.setMaxWidth(200);
    this.setMaxHeight(50);
    this.setMinWidth(200);
    this.setMinHeight(50);
    this.setStyle("-fx-background-color: #4C4C4C;" +
                  "-fx-background-radius: 10px;" +
                  "-fx-text-fill: white;");
  }

  public static Button ButtonWithImage(Image img){
    Button button = new Button();
    ImageView imageView = new ImageView(img);
    imageView.setFitWidth(25);
    imageView.setFitHeight(25);
    button.setGraphic(imageView);
    return button;
  }

  public static Button ButtonWithSize(String text, int width, int height){
    Button but = new Button();
    but.setText(text);
    but.setPrefWidth(width);
    but.setPrefHeight(height);
    but.setMaxWidth(width);
    but.setMaxHeight(height);
    but.setMinWidth(width);
    but.setMinHeight(height);
    return but;
    // this.setStyle("-fx-background-color: #4C4C4C;" +
    //               "-fx-background-radius: 10px;" +
    //               "-fx-text-fill: white;");
  }
}
