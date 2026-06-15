public class Main {
    public static void main(String[] args) {

        long start=System.currentTimeMillis();


        Bot bot=new Bot("bot1",100,50);
        bot.getList().add(30);
        // Bot bot1=new Bot("bot1",100,50);
        // Bot bot2=new Bot("bot1",100,50);
        // Bot bot3=new Bot("bot1",100,50);
        // Bot bot4=new Bot("bot1",100,50);

        Bot copy1Bot=bot.clone();
        copy1Bot.setName("bot2");
        copy1Bot.print();
        Bot copy2Bot=bot.clone();
        copy2Bot.setName("bot3");
        copy2Bot.print();
        Bot copy3Bot=bot.clone();
        copy3Bot.setName("bot4");
        copy3Bot.getList().add(4);
        copy3Bot.print();


        long end=System.currentTimeMillis();
        System.out.println("time taken : "+((end-start)/1000)+" s");
    }
}
