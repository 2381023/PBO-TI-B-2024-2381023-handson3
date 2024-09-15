package TugasKelas;

public class Tugas3DoWhile {
    public static void main(String[] args) {
        System.out.println("angka genap dari 1 sampai 20 adalah: ");
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
            i++;
        }while (i <= 20);

    }
}
