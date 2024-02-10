import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShowImages extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setHgap(5);
        pane.setVgap(5);




        ImageView usa = new ImageView(new Image("flag1.gif"));
        ImageView uk = new ImageView(new Image("flag2.gif"));
        ImageView frc = new ImageView(new Image("flag6.gif"));
        ImageView ch = new ImageView(new Image("flag7.gif"));


        usa.setFitWidth(250);
        usa.setFitHeight(150);


        uk.setFitWidth(250);
        uk.setFitHeight(150);


        frc.setFitWidth(250);
        frc.setFitHeight(150);


        ch.setFitWidth(250);
        ch.setFitHeight(150);




        pane.add(uk, 0, 0);
        pane.add(frc, 1, 0);
        pane.add(usa, 1, 1);
        pane.add(ch, 0, 1);


        Scene scene = new Scene(pane, 505, 305);
        primaryStage.setTitle("test");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args)
    {
        launch();
    }
}