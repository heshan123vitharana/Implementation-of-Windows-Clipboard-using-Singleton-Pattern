# 🖇️ Windows Clipboard Example

This repository contains an implementation of the **Windows Clipboard** using the Singleton Design Pattern. The clipboard ensures that only one instance exists at any given time, allowing multiple applications or instances to share data seamlessly. 🖥️

## 🚀 Features
- **Lazy Initialization with Double-Checked Locking**: Ensures thread-safe, on-demand instance creation.
- **Static Block Initialization**: Provides a pre-initialized instance at class loading time.
- Example usage included to demonstrate both approaches.

## 📂 Files
- `WindowsClipboardLazy.java`: Implements lazy initialization with double-checked locking.
- `WindowsClipboardStatic.java`: Implements static block initialization.
- `Main.java`: Demonstrates how to use both implementations.

## 🛠️ How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/<heshan123vitharana>/WindowsClipboardExample.git
