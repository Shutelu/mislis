package com.mislis.components;

import com.mislis.Settings;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class Accueil extends VBox{
  
  public Accueil(){
    this.setPadding(new Insets(20, 10, 10, 10));
    this.setSpacing(10);

    HBox addLinkSection = createAddLinkSection();
    HBox genSection = createGenSection();
    HBox editSection = createEditSection();
    HBox tagsSection = createTagsSection();
    VBox commentSection = createCommentSection();
    
    Text systemMessage = new Text("Ceci est un message systeme");
    Separator separator = new Separator();

    VBox image = new VBox();
    image.setMaxWidth(500);
    image.setMaxHeight(250);
    image.setMinWidth(500);
    image.setMinHeight(250);
    image. setStyle("-fx-background-color: #4C4C4C;" +
                       "-fx-background-radius: 10px;");

    addLinkSection.setAlignment(Pos.CENTER);

    this.getChildren().addAll(addLinkSection, 
    systemMessage, 
    genSection,
    separator, 
    editSection, 
    image, 
    tagsSection,
    commentSection);
  }

  private HBox createAddLinkSection(){
    HBox addLinkSection = new HBox();
    Button sendButton = ButtonFactory.ButtonWithImage(new Image(Settings.SEND_BUTTON_FILEPATH));
    TextField linkTextField = new LinkTextField(sendButton);

    sendButton.setOnAction(e -> {
      String text_from_field = linkTextField.getText();

      linkTextField.clear();
      linkTextField.requestFocus();
      System.out.println(text_from_field);
    });

    addLinkSection.setSpacing(10);
    addLinkSection.getChildren().addAll(linkTextField, sendButton);
    return addLinkSection;
  }

  private HBox createGenSection(){
    HBox hbox = new HBox();
    Button buttonGeneration = ButtonFactory.ButtonWithSize("Generer", 100, 50);
    // Ajouter un espace flexible avant le bouton
    Region spacer = new Region();
    HBox.setHgrow(spacer, Priority.ALWAYS);
    hbox.getChildren().addAll(spacer, buttonGeneration);
    return hbox;
  }

  private HBox createEditSection(){
    HBox hbox = new HBox();
    Button buttonLike = ButtonFactory.ButtonWithSize("Like", 70, 30);
    Button buttonDislike = ButtonFactory.ButtonWithSize("Dislike", 70, 30);
    Button buttonRemove = ButtonFactory.ButtonWithSize("Remove", 70, 30);
    hbox.setSpacing(10);
    hbox.getChildren().addAll(buttonLike, buttonDislike, buttonRemove);
    return hbox;
  }

  private HBox createTagsSection(){
    HBox hbox = new HBox();
    Text tags = new Text("Tags: ");
    Text placeholder = new Text("placeholder");
    hbox.getChildren().addAll(tags, placeholder);
    return hbox;
  }

  private VBox createCommentSection(){
    VBox vbox = new VBox();
    Text comment = new Text("Commentaires: ");
    TextField commentTextField = new TextField();
    vbox.getChildren().addAll(comment, commentTextField);
    return vbox;
  }
}
