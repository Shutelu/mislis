package com.mislis;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class LeftPage extends VBox{
  
  public LeftPage(){
    this.setPrefWidth(250);
    this.setPadding(new Insets(10));
    this.setAlignment(Pos.CENTER);

    VBox mainMenu = createMainMenu();
    
    Button buttonAccueil = new Button("Accueil");
    Button buttonHistorique = new Button("Historique");

     

    Text linksNumber = new Text("Nombre de liens existant : 0");
    linksNumber.setStyle("-fx-fill: white;");

    VBox.setMargin(buttonAccueil, new Insets(10, 0, 0, 0)); 
    VBox.setMargin(linksNumber, new Insets(0, 0, 10, 0));
    
    // Ajout d'une région vide pour pousser le texte vers le bas
    Region spacer = new Region();
    VBox.setVgrow(spacer, Priority.ALWAYS);
    // Utilisation de VBox.setVgrow() pour que mainMenu occupe tout l'espace disponible
    VBox.setVgrow(mainMenu, Priority.ALWAYS);

    mainMenu.getChildren().addAll(buttonAccueil, buttonHistorique, spacer,linksNumber);
    this.getChildren().add(mainMenu);
  }

  private VBox createMainMenu(){
    VBox mainMenu = new VBox();
    mainMenu.setSpacing(10);
    mainMenu.setAlignment(Pos.CENTER);
    mainMenu.setStyle("-fx-background-color: #4C4C4C;" +
                      "-fx-background-radius: 10px;");

    // Effet d'ombre en bas à droite
    DropShadow shadow = new DropShadow();
    shadow.setOffsetX(3);
    shadow.setOffsetY(3);
    shadow.setColor(Color.rgb(50, 50, 50, 0.6)); // Couleur et transparence de l'ombre
    mainMenu.setEffect(shadow);

    mainMenu.setPrefWidth(230);

    return mainMenu;
  }
}
