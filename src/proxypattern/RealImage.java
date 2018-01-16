package proxypattern;

// On System A
public class RealImage implements Image{
    private String filename = null;

    /**
     * Constructor
     * @param filename
     */
    public RealImage(final String filename){
        this.filename = filename;
        loadImageFromDisk();
    }

    /**
     * Loads the image from the disk
     */
    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }

    /**
     * Displays the image
     */
    @Override
    public void displayImage() {
        System.out.println("Displaying " + filename);
    }
}
