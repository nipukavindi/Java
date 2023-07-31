package labsheet;
public class YellowLightThread extends Thread
{
    
    public void run(){
        try{
            Thread.sleep(2000);
            System.out.println("Yellow Light");
        }
    
        catch(InterruptedException e)
        {
            System.out.println("Not Interrupt"); 
        }
}
}
