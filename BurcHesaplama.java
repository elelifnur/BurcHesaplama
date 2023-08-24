import java.util.Scanner;
public class BurcHesaplama {
    public static void main(String[] args){
        int g,ay;

        Scanner inp=new Scanner(System.in);

        System.out.print("Doğum gününüzü giriniz: ");
        g=inp.nextInt();

        System.out.print("doğum ayınızı giriniz: ");
        ay=inp.nextInt();
/*
        switch (ay){
            case 1:
                if((1 <= g) && (g <= 21)) {
                    System.out.println("Oğlak burcusunuz");
                }else if ((22 <= g) && (g <= 31)) {
                    System.out.println("Kova burcusunuz");
                }else {
                    System.out.println("Geçerli bir sayı giriniz.");
                }
                break;
            case 2:
                if ((1 <= g) && (g <= 19)) {
                    System.out.println("Kova burcusunuz");
                }else if ((20 <= g) && (g <= 29)) {
                    System.out.println("Balık burcusunuz");
                }else {
                    System.out.println("Geçerli bir sayı giriniz.");
                }
                break;
            case 3:
                if ((1 <= g) && (g <= 20)) {
                    System.out.println("Balık burcusunuz");
                }else if ((21 <= g) && (g <= 31)) {
                    System.out.println("Koç burcusunuz");
                }else {
                    System.out.println("Geçerli bir sayı giriniz.");
                }
                break;
            case 4:
                if ((1 <= g) && (g <= 21)) {
                    System.out.println("Koç burcusunuz");
                }else if ((22 <= g) && (g <= 30)) {
                    System.out.println("Boğa burcusunuz");
                }else {
                    System.out.println("Geçerli bir sayı giriniz.");
                }
                break;
            case 5:
                if ((1 <= g) && (g <= 21)) {
                    System.out.println("Boğa burcusunuz");
                }else if ((22 <= g) && (g <= 31)) {
                    System.out.println("ikizler burcusunuz");
                }else {
                    System.out.println("Geçerli bir sayı giriniz.");
                }
                break;
            case 6:
                if ((1 <= g) && (g <= 22)) {
                    System.out.println("İkizler burcusunuz");
                }else if ((23 <= g) && (g <= 30)) {
                    System.out.println("Yengeç burcusunuz");
                }else {
                    System.out.println("Geçerli bir sayı giriniz.");
                }
                break;
            case 7:
                if ((1 <= g) && (g <= 22)) {
                    System.out.println("Yengeç burcusunuz");
                }else if ((23 <= g) && (g <= 31)) {
                    System.out.println("Aslan burcusunuz");
                }else {
                    System.out.println("Geçerli bir sayı giriniz.");
                }
                break;
            case 8:
                if ((1 <= g) && (g <= 22)) {
                    System.out.println("Aslan burcusunuz");
                }else if ((23 <= g) && (g <= 31)) {
                    System.out.println("Başak burcusunuz");
                }else {
                    System.out.println("Geçerli bir sayı giriniz.");
                }
                break;
            case 9:
                if ((1 <= g) && (g <= 22)) {
                    System.out.println("Başak burcusunuz");
                }else if ((23 <= g) && (g <= 30)) {
                    System.out.println("Terazi burcusunuz");
                }else {
                    System.out.println("Geçerli bir sayı giriniz.");
                }
                break;
            case 10:
                if ((1 <= g) && (g <= 22)) {
                    System.out.println("Terazi burcusunuz");
                }else if ((23 <= g) && (g <= 31)) {
                    System.out.println("Akrep burcusunuz");
                }else {
                    System.out.println("Geçerli bir sayı giriniz.");
                }
                break;
            case 11:
                if ((1 <= g) && (g <= 21)) {
                    System.out.println("Akrep burcusunuz");
                }else if ((22 <= g) && (g <= 30)) {
                    System.out.println("Yay burcusunuz");
                }else {
                    System.out.println("Geçerli bir sayı giriniz.");
                }
                break;
            case 12:
                if ((1 <= g) && (g <= 21)) {
                    System.out.println("Yay burcusunuz");
                }else if ((22 <= g) && (g <= 31)) {
                    System.out.println("Oğlak burcusunuz");
                }else {
                    System.out.println("Geçerli bir sayı giriniz.");
                }
                break;

        }*/
        if(ay == 1){
            if((1 <= g) && (g <= 21)) {
                System.out.println("Oğlak burcusunuz");
            }else if ((22 <= g) && (g <= 31)) {
                System.out.println("Kova burcusunuz");
            }else {
                System.out.println("Geçerli bir sayı giriniz.");
            }
        }else if(ay == 2){
            if ((1 <= g) && (g <= 19)) {
                System.out.println("Kova burcusunuz");
            }else if ((20 <= g) && (g <= 29)) {
                System.out.println("Balık burcusunuz");
            }else {
                System.out.println("Geçerli bir sayı giriniz.");
            }
        }else if(ay == 3){
            if ((1 <= g) && (g <= 20)) {
                System.out.println("Balık burcusunuz");
            }else if ((21 <= g) && (g <= 31)) {
                System.out.println("Koç burcusunuz");
            }else {
                System.out.println("Geçerli bir sayı giriniz.");
            }
        }else if(ay == 4){
            if ((1 <= g) && (g <= 21)) {
                System.out.println("Koç burcusunuz");
            }else if ((22 <= g) && (g <= 30)) {
                System.out.println("Boğa burcusunuz");
            }else {
                System.out.println("Geçerli bir sayı giriniz.");
            }
        }else if(ay == 5){
            if ((1 <= g) && (g <= 21)) {
                System.out.println("Boğa burcusunuz");
            }else if ((22 <= g) && (g <= 31)) {
                System.out.println("ikizler burcusunuz");
            }else {
                System.out.println("Geçerli bir sayı giriniz.");
            }
        } else if (ay == 6) {
            if ((1 <= g) && (g <= 22)) {
                System.out.println("İkizler burcusunuz");
            }else if ((23 <= g) && (g <= 30)) {
                System.out.println("Yengeç burcusunuz");
            }else {
                System.out.println("Geçerli bir sayı giriniz.");
            }
        }else if (ay == 7){
            if ((1 <= g) && (g <= 22)) {
                System.out.println("Yengeç burcusunuz");
            }else if ((23 <= g) && (g <= 31)) {
                System.out.println("Aslan burcusunuz");
            }else {
                System.out.println("Geçerli bir sayı giriniz.");
            }
        }else if (ay == 8){
            if ((1 <= g) && (g <= 22)) {
                System.out.println("Aslan burcusunuz");
            }else if ((23 <= g) && (g <= 31)) {
                System.out.println("Başak burcusunuz");
            }else {
                System.out.println("Geçerli bir sayı giriniz.");
            }
        }else if (ay == 9){
            if ((1 <= g) && (g <= 22)) {
                System.out.println("Başak burcusunuz");
            }else if ((23 <= g) && (g <= 30)) {
                System.out.println("Terazi burcusunuz");
            }else {
                System.out.println("Geçerli bir sayı giriniz.");
            }
        }else if (ay == 10){
            if ((1 <= g) && (g <= 22)) {
                System.out.println("Terazi burcusunuz");
            }else if ((23 <= g) && (g <= 31)) {
                System.out.println("Akrep burcusunuz");
            }else {
                System.out.println("Geçerli bir sayı giriniz.");
            }
        }else if (ay == 11){
            if ((1 <= g) && (g <= 21)) {
                System.out.println("Akrep burcusunuz");
            }else if ((22 <= g) && (g <= 30)) {
                System.out.println("Yay burcusunuz");
            }else {
                System.out.println("Geçerli bir sayı giriniz.");
            }
        }else if (ay == 12){
            if ((1 <= g) && (g <= 21)) {
                System.out.println("Yay burcusunuz");
            }else if ((22 <= g) && (g <= 31)) {
                System.out.println("Oğlak burcusunuz");
            }else {
                System.out.println("Geçerli bir sayı giriniz.");
            }
        }else {
            System.out.println("geçerli bir sayı giriniz.");
        }
    }
}
