package com.mislis;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;

public class MenuManager extends MenuBar{

  public MenuManager(){

    SeparatorMenuItem separator = new SeparatorMenuItem();
    Menu menuFichier = new Menu("Fichier");
    Menu menuEdition = new Menu("Edition");

    MenuItem itemQuitter = createItemQuitter();

    menuFichier.getItems().addAll(itemQuitter);

    this.getMenus().addAll(menuFichier, menuEdition);
  }

  private MenuItem createItemQuitter(){
    MenuItem itemQuitter = new MenuItem("Quitter");
    itemQuitter.setOnAction(e -> System.exit(0));
    return itemQuitter;
  }
  
}
