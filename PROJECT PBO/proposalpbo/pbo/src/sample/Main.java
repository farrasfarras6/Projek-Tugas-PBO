package sample;

import java.util.Scanner;
public class Main  {

    public static void main(String[] args) {

        int menu;
        Scanner input=new Scanner(System.in);
        LinkedList LL=new LinkedList();

        do{
            System.out.println("\tPilih menu : ");
            System.out.println("\t1. Pengambilan nomor antri");
            System.out.println("\t2. Pemanggilan nomor antri");
            System.out.println("\t3. Lihat data antrian");
            System.out.println("\t4. Keluar");
            System.out.print("\t     Pilihan Anda : ");
            menu=input.nextInt();
            if(menu==1){
                LL.enqueue();
            }else if(menu==2){
                LL.dequeue();
            }else if(menu==3){
                LL.view();
            }else if(menu==4){
                System.out.println("\n\tTerimakasih");
            }else{
                System.out.println("\n\tPerhatikan data anda");
            }
        }while(menu!=4);
    }
}
