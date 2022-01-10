package JadeEngine;

public class LevelScene extends Scene {

    public LevelScene() {
        System.out.println("Inside Scene...");
        Window.get().r = 0.6f;
        Window.get().g = 0.3f;
        Window.get().b = 0.9f;
        Window.get().a = 1.0f;
    }

    @Override
    public void update(float dt) {

    }

}
