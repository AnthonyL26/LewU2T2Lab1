public class BoxRunner {
    public static void main(String[] args) {
        Box newBox = new Box(6, 10, 8);

        boolean x = newBox.anySideLongerThan(5); // C

        newBox.printDimensions(); // F}

        newBox.printVolume();
    }
}