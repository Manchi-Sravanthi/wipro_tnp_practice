package miniproject2;

import java.util.Scanner;

public class VideoRentalSystem {

    // Video Class
    static class Video {

        private String videoName;
        private boolean checkout;
        private int rating;

        public Video(String name) {
            videoName = name;
            checkout = false;
            rating = 0;
        }

        public String getName() {
            return videoName;
        }

        public void doCheckout() {
            checkout = true;
        }

        public void doReturn() {
            checkout = false;
        }

        public void receiveRating(int rating) {
            this.rating = rating;
        }

        public int getRating() {
            return rating;
        }

        public boolean getCheckout() {
            return checkout;
        }
    }

    // VideoStore Class
    static class VideoStore {

        Video[] store = new Video[100];
        int count = 0;

        public void addVideo(String name) {
            store[count] = new Video(name);
            count++;
            System.out.println("Video \"" + name + "\" added successfully.");
        }

        public void doCheckout(String name) {

            for (int i = 0; i < count; i++) {

                if (store[i].getName().equalsIgnoreCase(name)) {

                    store[i].doCheckout();

                    System.out.println("Video \"" + name + "\" checked out successfully.");
                    return;
                }
            }

            System.out.println("Video not found.");
        }

        public void doReturn(String name) {

            for (int i = 0; i < count; i++) {

                if (store[i].getName().equalsIgnoreCase(name)) {

                    store[i].doReturn();

                    System.out.println("Video \"" + name + "\" returned successfully.");
                    return;
                }
            }

            System.out.println("Video not found.");
        }

        public void receiveRating(String name, int rating) {

            for (int i = 0; i < count; i++) {

                if (store[i].getName().equalsIgnoreCase(name)) {

                    store[i].receiveRating(rating);

                    System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");

                    return;
                }
            }

            System.out.println("Video not found.");
        }

        public void listInventory() {

            System.out.println("\n----------------------------------------------");
            System.out.printf("%-20s %-20s %-10s\n", "Video Name", "Checkout", "Rating");
            System.out.println("----------------------------------------------");

            for (int i = 0; i < count; i++) {

                System.out.printf("%-20s %-20s %-10d\n",
                        store[i].getName(),
                        store[i].getCheckout(),
                        store[i].getRating());
            }

            System.out.println("----------------------------------------------");
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        VideoStore store = new VideoStore();

        int choice;

        do {

            System.out.println("\n===== VIDEO RENTAL INVENTORY SYSTEM =====");
            System.out.println("1. Add Video");
            System.out.println("2. Check Out Video");
            System.out.println("3. Return Video");
            System.out.println("4. Receive Rating");
            System.out.println("5. List Inventory");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

            case 1:
                System.out.print("Enter Video Name: ");
                String add = sc.nextLine();
                store.addVideo(add);
                break;

            case 2:
                System.out.print("Enter Video Name: ");
                String check = sc.nextLine();
                store.doCheckout(check);
                break;

            case 3:
                System.out.print("Enter Video Name: ");
                String ret = sc.nextLine();
                store.doReturn(ret);
                break;

            case 4:
                System.out.print("Enter Video Name: ");
                String rate = sc.nextLine();

                System.out.print("Enter Rating: ");
                int rating = sc.nextInt();

                store.receiveRating(rate, rating);
                break;

            case 5:
                store.listInventory();
                break;

            case 6:
                System.out.println("Thank You!");
                break;

            default:
                System.out.println("Invalid Choice");
            }

        } while (choice != 6);

        sc.close();
    }
}