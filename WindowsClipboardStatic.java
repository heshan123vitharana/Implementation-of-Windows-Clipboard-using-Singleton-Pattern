public class WindowsClipboardStatic {
    private static final WindowsClipboardStatic instance;
    private String clipboardData;

    // Static block to initialize the instance
    static {
        instance = new WindowsClipboardStatic();
    }

    // Private constructor to prevent instantiation
    private WindowsClipboardStatic() {}

    // Public method to get the single instance
    public static WindowsClipboardStatic getInstance() {
        return instance;
    }

    // Method to set clipboard data
    public void setClipboardData(String data) {
        this.clipboardData = data;
    }

    // Method to get clipboard data
    public String getClipboardData() {
        return clipboardData;
    }
}