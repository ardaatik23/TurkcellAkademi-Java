import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner sınıfını kullanarak kullanıcıdan girdi alabilmek için Scanner nesnesini oluşturduk.

        System.out.print("Kaç tane sınav notu girelim? ");
        int sinavSayisi = scanner.nextInt();

        int toplamNot = 0;
        for (int i = 1; i <= sinavSayisi; i++) { //toplamNot değişkenini başlangıçta sıfır olarak ayarladık.
            // Daha sonra döngü içinde her bir sınav notunu kullanıcıdan aldık ve toplamNot değerine ekledik.
            System.out.print("Sınav notu " + i + ": ");
            int not = scanner.nextInt();
            toplamNot += not;
        }

        double ortalama = (double) toplamNot / sinavSayisi;
        System.out.println("Ortalama: " + ortalama);

        if (ortalama > 80) {
            System.out.println("Yüksek Puan");
        }

        scanner.close();
    }
}
