public class Editor {
    
    String text;

    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
    public Memento save(){
        return new Memento(text);
    }
    public String restore(Memento memento){
        this.text=memento.getText();
        return text;
    }
}
