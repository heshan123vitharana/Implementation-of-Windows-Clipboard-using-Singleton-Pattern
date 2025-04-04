public class WindowsClipboardLazy {
    private static volatile WindowsClipboardLazy instance;
    private String clipboardData;

    // Private constructor to prevent instantiation
    private WindowsClipboardLazy() {}

    // Public method to get the single instance with double-checked locking
    public static WindowsClipboardLazy getInstance() {
        if (instance == null) {
            synchronized (WindowsClipboardLazy.class) {
                if (instance == null) {
                    instance = new WindowsClipboardLazy();
                }
            }
        }
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