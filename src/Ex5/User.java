package Ex5;

public class User implements Observer{

    private int ID;
    private String name;

    User(int ID) {
        this.ID = ID;
    }

    User(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update() {

    }
}
