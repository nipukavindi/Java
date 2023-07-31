package labsheet;
public class RedLightThread extends Thread
{
    public void run(){
        try{
            Thread.sleep(5000);
            System.out.println("Red Light");
        }
    
        catch(InterruptedException e)
        {
            System.out.println("Not Interrupt"); 
        }
}
}