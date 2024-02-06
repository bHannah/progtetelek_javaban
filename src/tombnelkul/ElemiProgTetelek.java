package tombnelkul;

import java.util.Scanner;

public class ElemiProgTetelek {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    
    /*Összegzés Python kód*/    
    
    /*def tetel():
    n = int(input("N="))
    while n < 0:
        n = int(input("N="))
    ossz = 0
    for i in range(n+1):
        ossz += i
    print(f"Az első {n} db természetes szám összege: {ossz}")*/
    
    /*Összegzés Java kód*/
    
    int n = -1;
    while (n < 1){
        System.out.print("N= ");
        n = sc.nextInt(); 
    /*n = int(input("N= "))*/
    }
    int ossz = 0;
    for (int i = 0; i < n+1; i++) {
        ossz += i;
    }
    System.out.printf("Az első %d szám összege: %d\n", n, ossz);
    
    /*Megszamlalas Python kód*/
    
    /*db = 0
    for i in range(10,99):
        if i % 2 == 0:
            db += 1
    return db */
    
    /*Megszamlalas Java kód*/
    
    int db = 0;
    for (int i=10; i<=99; i++){
        if (i % 2 == 0){
            db++;
        }
    }
    System.out.printf("Kétjegyű páros számok mennyidége: %d\n" ,db);
    
    /*Szélsőértek Pyhon kód*/
    
    /*def minimum_kivalasztas():
    db = 0
    vege = 0
    min = 0
    szam = 1
    while szam != vege:
        szam = int(input('Szám: '))
        if szam < min:
            min = szam
        db += 1
    print(f'{db} számból a legkisebb: {min}')*/
    
    /*Szélsőérték Java kód*/
    
    int vege = 0;
    int darab = 0;
    int min = Integer.MAX_VALUE;
    int szam = 1;
    while (szam != vege){
        System.out.print("N= ");
        szam = sc.nextInt(); 
        if (szam < min){
            min = szam;
        }
        darab++;
    }
    System.out.printf("%d db számból a legkisebb szám: %d\n" ,darab ,min);
    
    /*Eldöntés Python kód*/
    
    /*def elso_otjegyu_prim():
    prim = False
    n = 9999
    while prim == False:
        n += 1
        i = 2
        while i <= n ** 0.5 and n % i != 0:
            i += 1
        prim = i > n**0.5
    return n*/
    
    /*Eldöntés Java kód*/
    boolean prim = False;
    n = 9999;
    while (prim == False){
        n += 1;
        i = 2;
        while (i <= n ** 0.5 and n % i != 0) {
            i += 1
        prim = i > n**0.5
        }
    }
    return n
    }
    
}
