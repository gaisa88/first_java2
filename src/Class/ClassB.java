package Class;

public class ClassB extends ClassA{

    public ClassB(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }
}
