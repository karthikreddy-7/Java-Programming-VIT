import java.util.*;

public class booksinterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of intial books available: ");
        int n = sc.nextInt();
        books b = new books(n);
        System.out.println("press 1 for issue");
        System.out.println("press 0 for receive");
        int op = sc.nextInt();
        if (op == 1) {
            int issue = b.issue();
            if (issue == 0) {
                System.out.println("No books availble to issue.");
            } else if (issue == 1) {
                System.out.println("Book issued successfully");
            }
        } else {
            int receive = b.receive();
            System.out.println("book received successfully");
        }
        sc.close();
    }
}

interface iisc {
    int issue();

    int receive();

}

class books implements iisc {
    int books;

    public books(int books) {
        this.books = books;
    }

    public int issue() {
        if (books > 0) {
            books--;
            return 1;
        } else {
            return 0;
        }
    }

    public int receive() {
        books++;
        return 1;
    }
}