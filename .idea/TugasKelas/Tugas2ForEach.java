package TugasKelas;

public class Tugas2ForEach {
    public static void main(String[] args) {
        System.out.println("angka genap dari 1 sampai 20 adalah: ");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        // Menggunakan for-each untuk menampilkan bilangan genap
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
