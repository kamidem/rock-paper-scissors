
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