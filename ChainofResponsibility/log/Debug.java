public class Debug extends Logger{
    Debug(Logger logger){
        super(logger);
    }
    public void log(int type, String message){
        if (type==debug) {
            System.out.println(message);
            return;
        }
        logger.log(type, message);
    }
}
