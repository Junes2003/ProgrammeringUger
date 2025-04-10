package Uge15.FriendSorterOpgave;

import java.util.Comparator;

public class FriendComparators {
    public static class SortByName implements Comparator<Friend> {
        public int compare(Friend f1, Friend f2) {
            return f1.getName().compareToIgnoreCase(f2.getName());
        }
    }

    public static class SortByEmail implements Comparator<Friend> {
        public int compare(Friend f1, Friend f2) {
            return f1.getEmail().compareToIgnoreCase(f2.getEmail());
        }
    }

    public static class SortByPhone implements Comparator<Friend> {
        public int compare(Friend f1, Friend f2) {
            return f1.getPhone().compareTo(f2.getPhone());
        }
    }

    public static class SortByCountry implements Comparator<Friend> {
        public int compare(Friend f1, Friend f2) {
            return f1.getCountry().compareToIgnoreCase(f2.getCountry());
        }
    }

    public static class SortByContinent implements Comparator<Friend> {
        public int compare(Friend f1, Friend f2) {
            return f1.getContinent().compareToIgnoreCase(f2.getContinent());
        }
    }

    public static class SortById implements Comparator<Friend> {
        public int compare(Friend f1, Friend f2) {
            return Integer.compare(f1.getId(), f2.getId());
        }
    }
}
