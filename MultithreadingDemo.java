//There are 4 states of a thread: new,runnable,non-runnable and terminated.
public class MultithreadingDemo extends Thread {// if you want instances to be executed by a thread then implement
                                                // Runnable. You'll
    // then have to create objects of the Thread class and pass the object in the
    // constructor.
    public void run() {
        try {
            Thread.sleep(100);//int-nanoseconds long miliseconds
        } catch (Exception e) {} 
        System.out.println("The thread is running.");
    }
  public static void main(String[] args) {
    MultithreadingDemo t1=new MultithreadingDemo();
    MultithreadingDemo t2=new MultithreadingDemo();
    MultithreadingDemo t3=new MultithreadingDemo();
    t1.start();//start creates a thread and moves it from new to runnable state
    //the thread then executes whenever it gets a chance to do so.
    //running the run() directly will cause it to execute like a normal method
    //calling the start() twice will cause an IllegalStateException.
    System.out.println(t1.getName());
    t1.setName("First-Thread");
    System.out.println(t1.getId());
    try{
        t1.join();
    }catch(Exception e){
        System.out.println(e);
    }
    t2.start();
    t3.start();
    //Daemon threads provide services to the user thread.
    //The Daemon thread gets terminated when all user threads die. They have very low priority.
  }
}