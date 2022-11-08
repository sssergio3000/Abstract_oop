package abstractHandler;

public class DOCHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("---Open DOC---");
    }

    @Override
    void create() {
        System.out.println("---Create DOC---");
    }

    @Override
    void change() {
        System.out.println("---Change DOC---");
    }

    @Override
    void save() {
        System.out.println("---Save DOC---");
    }
}
