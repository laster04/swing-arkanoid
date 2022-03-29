public class Main {
    public static void main(String[] args) throws InterruptedException {
        MainPanel mp = new MainPanel();
        while(true) {
            mp.getGamePanel().run();
        }
    }
}
