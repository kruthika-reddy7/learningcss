interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rec implements Resizable {
    int width = 5, height = 10;

    public void resizeWidth(int width) {
        this.width = width;
    }

    public void resizeHeight(int height) {
        this.height = height;
    }

    void display() {
        System.out.println("New Width: " + width + ", New Height: " + height);
    }

    public static void main(String[] args) {
        Rec r = new Rec();
        r.resizeWidth(15);
        r.resizeHeight(20);
        r.display();
    }
}