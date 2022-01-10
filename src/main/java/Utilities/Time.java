package Utilities;

public class Time {

    // Time when game actually started
    private static float applicationStartTime = System.nanoTime();

    public static float getTime() {
        // Convert nanoseconds to seconds, therefore multiplying by a factor of 1E-9
        return (float) ((System.nanoTime() - applicationStartTime) * 1E-9);
    }
}
