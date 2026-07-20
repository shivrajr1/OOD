public abstract class Food {
    public final void prepareTemplateMethod(){
        step1();
        step2();
        step3();
        customStep1();
        customStep2();
    }
    public void step1(){
        System.out.println("step 1 start..");
    }
    public void step2(){
        System.out.println("step 2 start..");
    }
    public void step3(){
        System.out.println("step 3 start..");
    }
    public abstract void customStep1();
    public abstract void customStep2();
}
