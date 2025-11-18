package com.example.wintertime;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;




public class wintertime  extends Application{
    @Override
    public void start(Stage stage) throws  Exception{
        Group group = new Group();



        // add img
        Image image = new Image("file:oceansnow.jpg");

        ImageView imageViews = new ImageView();
        imageViews.setImage(image);
        imageViews.setPreserveRatio(true);
        imageViews.setFitWidth(875);

        group.getChildren().addAll(imageViews);
        int  MaxVaule = 875;
        int  MaxVauley = 480;

        for (int i = 0; i < 30; i++) {
            drawSnowflake((int) (Math.random()*(MaxVaule)+1) , (int) (Math.random()*(MaxVauley)+1), 50, group);

        }
        drawSnowflake(220 ,220 ,50, group);


        Scene scene= new Scene(group,875,480);

        stage.setScene(scene);
        stage.setTitle("Wintertime");
        stage.show();
    }

    /**
     *  draw a snowflake with middle line at x,y the size is size
     * @param x start of middle line
     * @param y start of middle line
     * @param size with of snowflake
     * @param g  group for snowflake
     */
    public void  drawSnowflake(double x,double  y, double  size ,Group g) {


        Line horizontal = new Line(x,y,x+size,y);
        horizontal.setStrokeWidth(3);
        horizontal.setStroke(Color.WHITE);
        g.getChildren().addAll(horizontal);

        Line vertical = new Line(x,y-size/2,x+size,y+size/2);
        vertical.setStrokeWidth(3);
        vertical.setStroke(Color.WHITE);
        g.getChildren().addAll(vertical);

        Line Slant = new Line(x,y+size/2,x+size,y-size/2);
        Slant.setStrokeWidth(3);
        Slant.setStroke(Color.WHITE);
        g.getChildren().addAll(Slant);


    }

}






