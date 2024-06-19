package com.mislis;

import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class CenterPage extends VBox{
    
    public CenterPage(Pane newPage){
      this.getChildren().add(newPage);
    }
  
}
