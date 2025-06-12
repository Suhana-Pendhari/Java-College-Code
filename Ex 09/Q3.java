// Q3) Create 3 threads one will print table of 4, second will print 
// table of 8 and third will print table of 12

public class Q3 {
    static class threadA extends Thread{
        public void run(){
            for(int i=1; i<=10; i++){
                System.out.println(i*4 + " A");
            }
        }
    }
    static class threadB extends Thread{
        public void run(){
            for(int i=1; i<=10; i++){
                System.out.println(i*8 + " B");
            }
        }
    }
    static class threadC extends Thread{
        public void run(){
            for(int i=1; i<=10; i++){
                System.out.println(i*12 + " C");
            }
        }
    }
    public static void main(String[] args) {
        threadA t1 = new threadA();
        threadB t2 = new threadB();
        threadC t3 = new threadC();
        t1.start();
        t2.start();
        t3.start();
    }
}
