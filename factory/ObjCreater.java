class ObjCreater {
    
    public Os create(String str){
        String s=str.toLowerCase();
        switch (s) {
            case "linex":
                return new Linux();
            case "mac":
                return new Mac();
        
            default:
                return new Window();
        }
    }
}
