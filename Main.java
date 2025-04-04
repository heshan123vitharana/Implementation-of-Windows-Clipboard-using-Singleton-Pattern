public class Main {
    public static void main(String[] args) {
        // Using Lazy Initialization with Double-Checked Locking
        WindowsClipboardLazy lazyClipboard = WindowsClipboardLazy.getInstance();
        lazyClipboard.setClipboardData("Hello from Lazy Clipboard!");
        System.out.println("Lazy Clipboard Data: " + lazyClipboard.getClipboardData());

        // Using Static Block Initialization
        WindowsClipboardStatic staticClipboard = WindowsClipboardStatic.getInstance();
        staticClipboard.setClipboardData("Hello from Static Clipboard!");
        System.out.println("Static Clipboard Data: " + staticClipboard.getClipboardData());
    }
}