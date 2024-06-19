package com.mislis;

import javafx.scene.layout.BorderPane;

public class RootManager extends BorderPane{
  
  public RootManager(){
    this.setTop(new MenuManager());
  }
}
