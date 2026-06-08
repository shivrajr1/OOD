public class Main {
    public static void main(String[] args) {
        Product ram=new Component("ram", 2000);
        Product hhd=new Component("hhd",3000);
        Composite computer=new Composite("computer");
        ram.showPrice();
        hhd.showPrice();
        computer.addComponent(hhd);
        computer.addComponent(ram);
        computer.showPrice();
        computer.removeComponent(hhd);
        computer.showPrice();
    }
}
