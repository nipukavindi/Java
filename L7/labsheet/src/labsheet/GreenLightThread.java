package labsheet;
public class GreenLightThread extends Thread
{
   
    public void run(){
        try{
            Thread.sleep(10000);
            System.out.println("Green Light");
        }
    
        catch(InterruptedException e)
        {
            System.out.println("Not Interrupt"); 
        }
    }
}
