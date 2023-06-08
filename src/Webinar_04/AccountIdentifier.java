package Webinar_04;

public class AccountIdentifier {
    private int id;
    private String add;

    public int getId() {
        return id;
    }

    public AccountIdentifier(int id, String add) {
        this.id = id;
        this.add = add;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
}
