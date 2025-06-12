public class Q4 {
    static class thread extends Thread{
        public void run(){
            for(int i=0; i<=Integer.MAX_VALUE; i++){
                try {
                    Thread.sleep(500);
                } catch (Exception e) {}
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        thread t = new thread();
        t.start();
    }
}
