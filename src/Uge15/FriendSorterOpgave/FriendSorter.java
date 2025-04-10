package Uge15.FriendSorterOpgave;

import java.util.ArrayList;

public class FriendSorter {
    public static void main(String[] args) {
        ArrayList<Friend> friends = FriendCreator.createFriends();

        System.out.println("🎯 Original liste:");
        printList(friends);

        friends.sort(new FriendComparators.SortByName());
        System.out.println("\n🔤 Sorteret efter navn:");
        printList(friends);

        friends.sort(new FriendComparators.SortByEmail());
        System.out.println("\n📧 Sorteret efter email:");
        printList(friends);

        friends.sort(new FriendComparators.SortByPhone());
        System.out.println("\n📞 Sorteret efter telefon:");
        printList(friends);

        friends.sort(new FriendComparators.SortByCountry());
        System.out.println("\n🌍 Sorteret efter land:");
        printList(friends);

        friends.sort(new FriendComparators.SortByContinent());
        System.out.println("\n🌐 Sorteret efter kontinent:");
        printList(friends);

        friends.sort(new FriendComparators.SortById());
        System.out.println("\n🆔 Sorteret efter ID:");
        printList(friends);
    }

    private static void printList(ArrayList<Friend> friends) {
        for (Friend f : friends) {
            System.out.println(f);
        }
    }
}
