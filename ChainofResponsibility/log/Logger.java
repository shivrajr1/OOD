abstract class Logger {
    static final int err=1;
    static final int print=2;
    static final int debug=3;
    Logger logger;
    Logger(Logger logger){
        this.logger=logger;
    }
    public void log(int type, String message){
        if(logger==null)return;
        logger.log(type, message);
    }
}