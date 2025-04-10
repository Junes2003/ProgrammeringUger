package Uge15.FriendSorterOpgave;

public class Friend {
    private static int nextId = 1000;
    private int id;
    private String name;
    private String phone;
    private String email;
    private transient String country;

    public Friend(String name, String phone, String email) {
        generateId();
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.country = determineCountry(phone);
    }

    private void generateId() {
        this.id = nextId++;
    }

    private String determineCountry(String phone) {
        if (phone == null || phone.isEmpty()) return "Unknown";
        if (phone.startsWith("+1")) return "USA";
        if (phone.startsWith("+45")) return "Denmark";
        if (phone.startsWith("+46")) return "Sweden";
        if (phone.startsWith("+32")) return "Belgium";
        if (phone.startsWith("+44")) return "UK";
        return "Unknown";
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public String getCountry() { return country; }

    public String getContinent() {
        switch (country) {
            case "USA":
                return "North America";
            case "Denmark":
            case "Sweden":
            case "Belgium":
            case "UK":
                return "Europe";
            default:
                return "Unknown";
        }
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Navn: %-20s | Tlf: %-14s | Email: %-25s | Land: %-10s | Kontinent: %s",
                id, name, phone, email, country, getContinent());
    }
}
