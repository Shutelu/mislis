package com.mislis;

import com.mislis.components.Accueil;

import javafx.scene.layout.BorderPane;

public class RootManager extends BorderPane{
  
  public RootManager(){
    this.setTop(new MenuManager());
    this.setLeft(new LeftPage());
    this.setCenter(new CenterPage(new Accueil()));
  }
}
