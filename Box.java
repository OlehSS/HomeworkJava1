package Hw.Homeworks;

public class Box {

    public int width;

    public int height;

    public int length;

    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;

        int volume = width * height * length;
        System.out.println(volume);
    }
}
