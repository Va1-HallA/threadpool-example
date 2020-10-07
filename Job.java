public class Job implement Runnable{
    private int JobNum;
    Job(int JobNum){this.JobNum = JobNum;}
    
    public void run(){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){}
        
        System.out.println("Job" + JobNum + "is ending in thread" + Thread.currentThread().getName());
    }
}
