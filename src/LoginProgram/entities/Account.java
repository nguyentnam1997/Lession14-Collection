package LoginProgram.entities;

public class Account {
    private static int autoId;
    private int id;
    private String name;
    private String password;

    public Account(String name, String password) {
        this.id = ++autoId;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
