package edu.vanier.ufo.ui;

import edu.vanier.ufo.engine.GameEngine;
import edu.vanier.ufo.helpers.ResourcesManager;
import java.util.Map;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

/**
 * The main driver of the game.
 *
 * @author cdea
 */
public class SpaceInvadersApp extends Application {

    GameEngine gameWorld;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        gameWorld = new GameWorld(ResourcesManager.FRAMES_PER_SECOND, "JavaFX Space Invaders");
        // Setup title, scene, stats, controls, and actors.
        gameWorld.initialize(primaryStage);
        // kick off the game loop
        gameWorld.beginGameLoop();
        
       /* Map<String, AudioClip> newmap = gameWorld.getSoundManager().getSoundEffectsMap();
        
        for(String key : newmap.keySet()){
            System.out.println(key);
        }*/
        
        // display window
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        Platform.exit();
        gameWorld.shutdown();
    }

}
