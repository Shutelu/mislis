package com.mislis.components;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LinkTextField extends TextField{
  
  /**
   * Texte de saisi pour un lien
   * @param button Le bouton qui sera déclenché lorsqu'on appuie sur la touche entrée
   */
  public LinkTextField(Button button){
    this.setPromptText("Entrez votre lien ici ...");
    this.setAlignment(javafx.geometry.Pos.CENTER);
    
    this.setPrefWidth(500);
    this.setPrefHeight(50); 
    this.setMaxWidth(500);
    this.setMaxHeight(50);
    this.setMinWidth(500);
    this.setMinHeight(50);

    this.setStyle("-fx-background-radius: 25; -fx-border-radius: 25;");

    this.setOnAction(e -> {
      button.fire();
    });
  }
}
