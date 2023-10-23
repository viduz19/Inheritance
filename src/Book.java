public class Book {

    int qty;
    public void printBooks(){
        int com =4000;
        int crt =7000;
        int prntqty = com+ crt;
        System.out.println("Printed :" + prntqty );
    }
}
class Press extends Book {
    public void display() {
        System.out.println("Books Printed qty :"+ qty);
    }
}
class TestI{
    public static void main(String[] args) {
        Press p = new Press();
        p.qty = 140000;
        p.display();
        p.printBooks();

    }
}