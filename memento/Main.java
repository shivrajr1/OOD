public class Main {
    public static void main(String[] args) {
        Editor editor=new Editor();
        History history=new History();
        editor.setText("hello");
        System.out.println(editor.getText());
        history.save(editor.save());
        editor.setText("world");
        System.out.println(editor.getText());
        history.save(editor.save());
        editor.restore(history.redo());
        System.out.println(editor.getText());
        editor.restore(history.redo());
        System.out.println(editor.getText());
    }
}
