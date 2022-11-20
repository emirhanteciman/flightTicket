import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
        Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
    Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
    Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
    Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
    Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/
        int distance, age, ticketType;
        double ticketPrice, studentTicket, youngTicket, oldTicket;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter distance: ");
        distance = input.nextInt();
        ticketPrice = distance * 0.10;
        System.out.println("Please enter your age: ");
        age = input.nextInt();
        System.out.println("Please choose your ticket type (1-2) : ");
        ticketType = input.nextInt();
        studentTicket = (ticketPrice) * 0.50;
        youngTicket = (ticketPrice) * 0.90;
        oldTicket = (ticketPrice) * 0.70;
        if (ticketType == 1 || ticketType == 2 || age >= 0 || distance > 0) {
            System.out.println("");
        } else {
            System.out.println("İnvalid login. Try again");
        }
        if (age < 12 && ticketType == 1) {
            System.out.println("The ticket price : " + studentTicket);
        }
        if (age < 12 && ticketType == 2) {
            System.out.println("The ticket price : " + (studentTicket) * 80 / 100);
        }
        if (age >= 12 && age<=24 && ticketType == 1) {
            System.out.println("The ticket price : " + youngTicket);
        }
        if (age >= 12 && age <=24 && ticketType == 2) {
            System.out.println("The ticket price : " + (youngTicket) * 80 / 100);
        }
        if (age >=25 && age<=65 && ticketType == 1 ){
            System.out.println("The ticket price :" + oldTicket);
        }
        if (age >=25 && age <=65 && ticketType == 2){
            System.out.println("The ticket price : " + (oldTicket) *80/100);
        }
    }
}