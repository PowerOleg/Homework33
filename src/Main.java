public class Main {
    public static void main(String[] args) {
       Randoms random = new Randoms(-90, 100);
//        System.out.println(randoms);
        for (int i : random/*new Randoms(90, 100)*/) {
            System.out.println("Случайное число: " + i);
            if (i == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}
