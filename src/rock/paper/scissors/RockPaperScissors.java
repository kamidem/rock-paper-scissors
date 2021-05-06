
package rock.paper.scissors;

import java.util.Scanner;

public class RockPaperScissors {

//    Akmuo - popierius - zirkles
//
//    Programa leidzia vartotojui pasirinkti:
//
//    1. Akmuo
//    2. Popierius
//    3. Zirkles
//    0. Pabaiga
//
//    Jei ne pabaiga:
//    Kompiuteris atsitiktinai pasirenka
//    palyginam ir parasom kas laimejo
//
//    ir vel spausdinam meniu
//    jei vartotojas pasirinko ne 0..3 - pavadinikit vartotjoa mulkiu ir vel meniu
//

    
//    PIRMAS ZAIDIMO VARIANTAS 
//    --------------------------------------------------------------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean zaidziama = true;
        
        while(zaidziama){
            System.out.println("Pasirinkimai:");
            System.out.println("1. Akmuo");
            System.out.println("2. Popierius");
            System.out.println("3. Zirkles");
            System.out.println("0. Pabaiga");
            System.out.println();
            System.out.println("Iveskite savo pasirinkimo skaiciu:");

            int pasirinkimas = sc.nextInt();


            if(pasirinkimas == 0){
                System.out.println("Zaidimas Baigiamas...");
                zaidziama = false;
            } else if(pasirinkimas > 0 && pasirinkimas < 4){

                int kompPasirinkimas = (int)(Math.random() * 3) + 1 ;
                System.out.println("kompiuteris pasirinko: " + kompPasirinkimas);
                
                System.out.println();
                System.out.print("*** ");
                if(pasirinkimas == 1){
                    if(kompPasirinkimas == 1){
                        System.out.print("lygiosios");
                    }
                    if(kompPasirinkimas == 2){
                        System.out.print("kompiuteris laimejo");
                    }
                    if(kompPasirinkimas == 3){
                        System.out.print("jus laimejote!");
                    }
                }

                if(pasirinkimas == 2){
                    if(kompPasirinkimas == 1){
                        System.out.print("jus laimejote!");
                    }
                    if(kompPasirinkimas == 2){
                        System.out.print("lygiosios");
                    }
                    if(kompPasirinkimas == 3){
                        System.out.print("kompiuteris laimejo");
                    }
                }

                if(pasirinkimas == 3){
                    if(kompPasirinkimas == 1){
                        System.out.print("kompiuteris laimejo");
                    }
                    if(kompPasirinkimas == 2){
                        System.out.print("jus laimejote!");
                    }
                    if(kompPasirinkimas == 3){
                        System.out.print("lygiosios");
                    }
                }
                System.out.println(" ***");
                System.out.println();
                System.out.println("-----------------");
                
            } else {
                System.out.println("pasirinkite viena is DUOTU skaiciu");
                System.out.println();
                    System.out.println("-----------------");
                    System.out.println();
            }
        }
        
        
        
                  
    }
   
    
    
//    ****
//    Programa paklausia kiek kartu reikia suzaist
//
//    Kompiuteris zaidzia su savim
//
//    Pabaigoj atsapausdinti statistika:
//
//    comp1 laimejo: XXXX
//    comp2 laimejo: XXXX
//    lygiosios: XXXX
//
//    comp1:
//    pasirino akmeni: XX
//    pasirinko popieriu: XX
//    pasirinko zirkles: XX
//
//    comp2:
//    pasirino akmeni: XX
//    pasirinko popieriu: XX
//    pasirinko zirkles: XX
    
//    ANTRAS ZAIDIMO VARIANTAS 
//    --------------------------------------------------------------------------    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("Kiek kartu reikia suzaisti?");
//
//        int zaidimuSk = sc.nextInt();
//        int comp1Laimejo = 0;
//        int comp2Laimejo = 0;
//        int lygiosios = 0;
//
////        comp1:
//        int comp1_1 = 0; //        pasirino akmeni: XX
//        int comp1_2 = 0; //        pasirinko popieriu: XX
//        int comp1_3 = 0; //        pasirinko zirkles: XX
////
////        comp2:
//        int comp2_1 = 0; //        pasirino akmeni: XX
//        int comp2_2 = 0; //        pasirinko popieriu: XX
//        int comp2_3 = 0; //        pasirinko zirkles: XX
//        
//        while(zaidimuSk > 0){
//            int comp1Pasirinkimas = (int)(Math.random() * 3) + 1 ;
////            System.out.println("kompiuteris #1 pasirinko: " + comp1Pasirinkimas);
//            
//            int comp2Pasirinkimas = (int)(Math.random() * 3) + 1 ;
////            System.out.println("kompiuteris #2 pasirinko: " + comp2Pasirinkimas);
//            
//            if(comp1Pasirinkimas == 1){
//                    comp1_1++;
//                    if(comp2Pasirinkimas == 1){
//                        lygiosios++;
//                        comp2_1++;
//                    }
//                    if(comp2Pasirinkimas == 2){
//                        comp2Laimejo++;
//                        comp2_2++;
//                    }
//                    if(comp2Pasirinkimas == 3){
//                        comp1Laimejo++;
//                        comp2_3++;
//                    }
//                }
//
//                if(comp1Pasirinkimas == 2){
//                    comp1_2++;
//                    if(comp2Pasirinkimas == 1){
//                        comp1Laimejo++;
//                        comp2_1++;
//                    }
//                    if(comp2Pasirinkimas == 2){
//                        lygiosios++;
//                        comp2_2++;
//                    }
//                    if(comp2Pasirinkimas == 3){
//                        comp2Laimejo++;
//                        comp2_3++;
//                    }
//                }
//
//                if(comp1Pasirinkimas == 3){
//                    comp1_3++;
//                    if(comp2Pasirinkimas == 1){
//                        comp2Laimejo++;
//                        comp2_1++;
//                    }
//                    if(comp2Pasirinkimas == 2){
//                        comp1Laimejo++;
//                        comp2_2++;
//                    }
//                    if(comp2Pasirinkimas == 3){
//                        lygiosios++;
//                        comp2_3++;
//                    }
//                }
//            
//            zaidimuSk--;
//        }
//        
//        System.out.println();
//        System.out.println("ZAIDIMO STATISTIKA");
//        System.out.println("comp1 laimejo: " + comp1Laimejo);
//        System.out.println("comp2 laimejo: " + comp2Laimejo);
//        System.out.println("lygiosios: " + lygiosios);
//        System.out.println();
//        
//        System.out.println("COMP1 STATISTIKA");
//        System.out.println("pasirinko akmeni: " + comp1_1);
//        System.out.println("pasirinko popieriu: " + comp1_2);
//        System.out.println("pasirinko zirkles: " + comp1_3);
//        System.out.println();
//        
//        System.out.println("COMP2 STATISTIKA");
//        System.out.println("pasirinko akmeni: " + comp2_1);
//        System.out.println("pasirinko popieriu: " + comp2_2);
//        System.out.println("pasirinko zirkles: " + comp2_3);
//        System.out.println();
//        
//        
//        
//        
//        
//                  
//    }
//
//    
}
//    comp1 laimejo: XXXX
//    comp2 laimejo: XXXX
//    lygiosios: XXXX
//
//    comp1:
//    pasirino akmeni: XX
//    pasirinko popieriu: XX
//    pasirinko zirkles: XX
//
//    comp2:
//    pasirino akmeni: XX
//    pasirinko popieriu: XX
//    pasirinko zirkles: XX


// DESTYTOJO
//
//Scanner sc = new Scanner(System.in);
// 
//        int pasirinkimas;
//        do {
//            System.out.println("1. Akmuo");
//            System.out.println("2. Popierius");
//            System.out.println("3. Zirkles");
//            System.out.println("0. Pabaiga");
//            pasirinkimas = sc.nextInt();
//            if (pasirinkimas < 0 || pasirinkimas > 3) {
//                System.out.println("Idiote, ismok naudotis klaviatura !!!");
//            } else if (pasirinkimas > 0) {
//                int kp = (int) (Math.random() * 3 + 1);
//                switch (kp) {
//                    case 1:
//                        System.out.println("Kompiterio pasirinkimas: Akmuo");
//                        break;
//                    case 2:
//                        System.out.println("Kompiterio pasirinkimas: Popierius");
//                        break;
//                    case 3:
//                        System.out.println("Kompiterio pasirinkimas: Zirkles");
//                        break;
//                }
//                if (pasirinkimas == kp) {
//                    System.out.println("Lygiosios");
//                } else if (pasirinkimas == 1) {
//                    if (kp == 2) {
//                        System.out.println("Laimejo kompiuteris");
//                    } else {
//                        System.out.println("Laimejo zaidejas");
//                    }
//                } else if (pasirinkimas == 2) {
//                    if (kp == 3) {
//                        System.out.println("Laimejo kompiuteris");
//                    } else {
//                        System.out.println("Laimejo zaidejas");
//                    }
//                } else {
//                    if (kp == 1) {
//                        System.out.println("Laimejo kompiuteris");
//                    } else {
//                        System.out.println("Laimejo zaidejas");
//                    }
//                }
//            }
//        } while (pasirinkimas != 0);


//DESTYTOJO 2
//
//public static int kauliukoMetimas() {
//        return (int) (Math.random() * 6 + 1);
//    }
// 
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int zt = 0;
//        int kt = 0;
// 
//        do {
//            int zmt = 0;
//            int zm;
//            do {
//                zm = kauliukoMetimas();
//                System.out.println(zm);
//                if (zm != 1) {
//                    zmt += zm;
//                    System.out.println(zmt);
//                    if (zt + zmt < 100) {
//                        System.out.println("Metam dar karta? 1/0 ");
//                        int darKarta = sc.nextInt();
//                        if (darKarta == 0) {
//                            zt += zmt;
//                            zm = 1;
//                        }
//                    } else {
//                        zt += zmt;
//                        zm = 1;
//                    }
//                }
//            } while (zm != 1);
//            System.out.println(zt);
//            if (zt < 100) {
//                int km;
//                int kmt = 0;
//                int kmk = 0;
//                do {
//                    km = kauliukoMetimas();
//                    System.out.print(km);
//                    System.out.print(" ");
//                    if (km != 1) {
//                        kmt += km;
//                    }
//                } while (km != 1 && ++kmk < 5 && kmt + kt < 100);
//                if (km != 1) {
//                    kt += kmt;
//                }
//                System.out.println(kt);
//            }
//        } while (zt < 100 && kt < 100);
//        if (zt > kt) {
//            System.out.println("Laimejo zaidejas");
//        } else {
//            System.out.println("Laimejo kompiuteris");
//        }
//    }


////DESTYTOJO 2.2
//public static int kauliukoMetimas() {
//        return (int) (Math.random() * 6 + 1);
//    }
// 
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int zt = 0;
//        int kt = 0;
// 
//        do {
//            int zmt = 0;
//            int zm;
//            do {
//                zm = kauliukoMetimas();
//                System.out.println(zm);
//                if (zm != 1) {
//                    zmt += zm;
//                    System.out.println(zmt);
//                    if (zt + zmt < 100) {
//                        System.out.println("Metam dar karta? 1/0 ");
//                        int darKarta = sc.nextInt();
//                        if (darKarta == 0) {
//                            zt += zmt;
//                            zm = 1;
//                        }
//                    } else {
//                        zt += zmt;
//                        zm = 1;
//                    }
//                }
//            } while (zm != 1);
//            System.out.println(zt);
//            if (zt < 100) {
//                int km;
//                int kmt = 0;
//                do {
//                    km = kauliukoMetimas();
//                    System.out.print(km);
//                    System.out.print(" ");
//                    if (km != 1) {
//                        kmt += km;
//                    }
//                } while (km != 1 && kmt < 18 && kmt + kt < 100);
//                if (km != 1) {
//                    kt += kmt;
//                }
//                System.out.println(kt);
////                int km;
////                int kmt = 0;
////                int kmk = 0;
////                do {
////                    km = kauliukoMetimas();
////                    System.out.print(km);
////                    System.out.print(" ");
////                    if (km != 1) {
////                        kmt += km;
////                    }
////                } while (km != 1 && ++kmk < 5 && kmt + kt < 100);
////                if (km != 1) {
////                    kt += kmt;
////                }
////                System.out.println(kt);
//            }
//        } while (zt < 100 && kt < 100);
//        if (zt > kt) {
//            System.out.println("Laimejo zaidejas");
//        } else {
//            System.out.println("Laimejo kompiuteris");
//        }
//    }



//// DESTYTOJO 3
//public static int kauliukoMetimas() {
//        return (int) (Math.random() * 6 + 1);
//    }
// 
//    public static void main(String[] args) {
//        int k1t = 0;
//        int k2t = 0;
// 
//        do {
//            int k1m;
//            int k1mt = 0;
//            int k1mk = 0;
//            System.out.print("Comp1: ");
//            do {
//                k1m = kauliukoMetimas();
//                System.out.print(k1m);
//                System.out.print(" ");
//                if (k1m != 1) {
//                    k1mt += k1m;
//                }
//            } while (k1m != 1 && ++k1mk < 5 && k1mt + k1t < 100);
//            if (k1m != 1) {
//                k1t += k1mt;
//            }
//            System.out.println(k1t);
//            if (k1t < 100) {
//                int k2m;
//                int k2mt = 0;
//                System.out.print("Comp2: ");
//                do {
//                    k2m = kauliukoMetimas();
//                    System.out.print(k2m);
//                    System.out.print(" ");
//                    if (k2m != 1) {
//                        k2mt += k2m;
//                    }
//                } while (k2m != 1 && k2mt < 18 && k2mt + k2t < 100);
//                if (k2m != 1) {
//                    k2t += k2mt;
//                }
//                System.out.println(k2t);
//            }
//        } while (k1t < 100 && k2t < 100);
//        if (k1t > k2t) {
//            System.out.println("Laimejo 1-as kompiuteris");
//        } else {
//            System.out.println("Laimejo 2-as kompiuteris");
//        }
//    }