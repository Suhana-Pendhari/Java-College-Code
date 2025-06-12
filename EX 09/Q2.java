// Q2) Create 2 threads in which one will print even numbers and second will print odd numbers

public class Q2 {
    static class threadA extends Thread{
        public void run(){
            for(int i=1; i<=10; i++){
                if(i%2 == 0){
                    System.out.println(i + " A");
                }
            }
        }
    }
    static class threadB extends Thread{
        public void run(){
            for(int i=1; i<=10; i++){
                if(i%2 != 0){
                    System.out.println(i + " B");
                }
            }
        }
    }
    public static void main(String[] args) {
        threadA t1 = new threadA();
        threadB t2 = new threadB();
        t1.start();
        t2.start();
    }
}
