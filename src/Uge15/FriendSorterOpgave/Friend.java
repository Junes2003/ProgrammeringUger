package Uge15.FriendSorterOpgave;

public class Friend {
    private int id;
    private String name;
    private String phone;
    private String email;
    private transient String country;

    public Friend(int id, String name, String phone, String email, String country){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    private void genrateId(){
        id = (int)(Math.random() * 8999 + 1000);
    }
}
