package labsheet;
public class Labsheet {
    public static void main(String[] args) 
    {
        RedLightThread r= new RedLightThread();
        GreenLightThread g=new GreenLightThread();
        YellowLightThread y=new YellowLightThread();
        r.run();
        g.run();
        y.run();
    }
    
}
