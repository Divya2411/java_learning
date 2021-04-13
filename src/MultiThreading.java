

public class MultiThreading {
    public static void main(String[] args) throws Exception {
        Ba obj = new Ba();
        obj.start();


      Runnable r = new Runnable() {

          public void run() {
              for (int i = 1; i <= 5; i++) {
                  System.out.println("hii");
                  try {
                      Thread.sleep(1000);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }

          }
      };
        Thread t = new Thread(r );
        t.start();


    }
}

class Ba extends Thread{
    public void show(){
        for (int i = 1; i<=5; i++){
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

  public void run(){
    show();

        }
}


