package nl.mvdr.javafx8sandbox;

import javafx.application.Application;
import javafx.scene.Camera;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

/**
 * JavaFX application containing 3D graphics.
 * 
 * @author Martijn van de Rijdt
 */
public class ThreeDeeApplication extends Application {
    /** {@inheritDoc} */
    @Override
    public void start(Stage primaryStage) throws Exception {
        Sphere sphere = new Sphere(100);
        sphere.setTranslateX(200);
        sphere.setTranslateY(200);
        sphere.setMaterial(new PhongMaterial(Color.BLUE));

        Box box = new Box(120, 120, 120);
        box.setTranslateX(700);
        box.setTranslateY(400);
        box.setMaterial(new PhongMaterial(Color.RED));
        
        Cylinder cylinder = new Cylinder(100, 200);
        cylinder.setTranslateX(400);
        cylinder.setTranslateY(400);
        cylinder.setMaterial(new PhongMaterial(Color.ORANGE));

        Group root = new Group();
        root.getChildren().addAll(sphere, box, cylinder);
        
        Scene scene = new Scene(root, 1024, 768);
        scene.setFill(Color.GRAY);
        
        Camera camera = new PerspectiveCamera();
        scene.setCamera(camera);
        
        primaryStage.setTitle("3D");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Main method.
     * 
     * @param args
     *            commandline parameters; these are passed on to JavaFX
     */
    public static void main(String[] args) {
        launch(args);
    }
}
