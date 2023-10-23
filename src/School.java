public class School {
    void oldLearning() {
        System.out.println("Using Galpuwaruwa");
    }
}
class newLearning extends School {
    void newLearning() {
        System.out.println("Using Books");
    }
}
class modernLearning extends School {
    void modernLearning() {
        System.out.println("Using Tabs");
    }
}
class Test {
    public static void main(String[] args) {
        modernLearning ms = new modernLearning();
        ms.oldLearning();
        ms.modernLearning();
    }
}