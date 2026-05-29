public class Main {
    public static void main(String[] args) {
        Logger logger=new Print(new Debug(new Error(null)));
        logger.log(Logger.print, "this should be print");
        logger.log(Logger.debug, "this should be debug");
        logger.log(Logger.err, "this should be error");
    }
}
