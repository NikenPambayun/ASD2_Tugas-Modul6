package Tugas6;
public class No1App {
    public static void main (String[] args){
        No1 tumpukan = new No1(10);
        tumpukan.push(50);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(100);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.pop();
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(60);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(80);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.pop();
        tumpukan.baca();
        System.out.println(" ");
        long nilai3 = tumpukan.peek();
        System.out.println("nilai Top = "+ nilai3);
        System.out.println(" ");
        tumpukan.baca();
        
        System.out.println();
        System.out.println("RR. Niken Pambayun Dyah Setyawati");
    }
}
