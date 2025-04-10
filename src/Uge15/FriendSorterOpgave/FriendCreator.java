package Uge15.FriendSorterOpgave;

import java.util.ArrayList;

public abstract class FriendCreator {
    public static ArrayList<Friend> createFriends() {
        ArrayList<Friend> friends = new ArrayList<>();
        friends.add(new Friend("Anders And", "+45 12312312", "aa@and.dk"));
        friends.add(new Friend("Andersine And", "+45 23623624", "andine@and.dk"));
        friends.add(new Friend("Joakim von And", "+46 19191219", "jva@and.dk"));
        friends.add(new Friend("Anderbilt von And", "+1 98999899", "avand@anderbilt.dk"));
        friends.add(new Friend("Georg Gearlos", "+32 534526524", "gg@g.com"));
        friends.add(new Friend("Rip And", "", "rip@and.dk"));
        friends.add(new Friend("Rap And", "", "rap@and.dk"));
        friends.add(new Friend("Rup And", "", "rup@and.dk"));
        friends.add(new Friend("Bedstemor And", "+45 123", ""));
        friends.add(new Friend("Fatter Guf", "+45 123", ""));
        return friends;
    }
}
