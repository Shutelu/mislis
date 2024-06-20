package com.mislis;

import javafx.geometry.Insets;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


//a voir si on gardera cette classe
public class CenterPage extends VBox{
    
  public CenterPage(Pane newPage){
    this.setPadding(new Insets(10));
    this.getChildren().add(newPage);
  }

}
