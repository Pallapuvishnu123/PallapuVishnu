public class Threaddemo {
    public static void main(String[] args)
    {
        test t = new test();
        t.start();
        for (int i=0;i<=10;i++)
        {
            System.out.println("main");
        }
    }
}
class test extends Thread
{
    public void run()
    {
        for (int i =0;i<=10;i++)
        {
            System.out.println("child");
        }
    }
}
