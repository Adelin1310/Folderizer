package main;
public class src {
    public static void main(String[] args) {
        
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                Window window = new Window();
                window.Window();
            }
        });
    }
}
