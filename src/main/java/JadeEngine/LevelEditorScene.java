package JadeEngine;

import java.awt.event.KeyEvent;

public class LevelEditorScene extends Scene {

    private boolean isChangingScene = false;
    private float timeToChangeScene = 1.5f;

    public LevelEditorScene() {
        System.out.println("Inside Level Editor Scene...");
    }

    @Override
    public void update(float dt) {
        if (!isChangingScene && KeyListener.isKeyPressed(KeyEvent.VK_SPACE)) {
            isChangingScene = true;
        }

        if (isChangingScene && timeToChangeScene > 0) {
            timeToChangeScene -= dt;
            Window.get().r -= dt * 3.0f;
            Window.get().g -= dt * 3.0f;
            Window.get().b -= dt * 3.0f;
            Window.get().a = 1.0f;
        } else if (isChangingScene) {
            Window.changeScene(1);
        }
    }

}
