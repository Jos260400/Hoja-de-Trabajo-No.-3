// Fernando Jose Garavito Ovando    18071
// Maria Jose Castro 181202
// Hoja de trabajo No. 3
// Main.java

import java.io.*;
import java.util.Scanner;
//Importamos Random para generar los números enteros aleatorios
import java.util.Random;

public class Main {
	private static Scanner input;
    public static void main(String[] args) {
    Random random = new Random();
     
      int opcion;
      int cant;
      Comparar[] ListNum = new Comparar [cant];
	  Comparar[] ListStre = new Comparar [cant];

       Scanner S = new Scanner(System.in);
       Merge myMerge = new Merge();
       
       
            	  System.out.println("Ingrese cant de numeros a ordenar: ");
            	  cant = S.nextInt();
            	  
            		  if (cant <=3000&&cant>=10) {
            			 WriteFile ("doc.txt", cant);
            			 ReadFile("/.doc.txt", cant);
            			  for (int i =0; i<= ListNum.length; i++) {
            				  System.out.println(ListNum[i].getNum());
            			  }
            		  }
            		  else {
        				  System.out.println("Ingrese cant mayor a 10");
        			  }
            	  System.out.println("Menú de Sorts");
                  System.out.println("1. Merge");
                  System.out.println("2. Quick");
                  System.out.println("3. Insertion");
                  System.out.println("4. Radix");
                  System.out.println("5. Gnome");
                  System.out.println("6. Salir");
                  System.out.println("Elije una de las opciones: ");
                  opcion = S.nextInt();
              
            	  while(opcion>6);


              switch(opcion){
                  case 1:
                      System.out.println("Merge");
                      ListStre = myMerge.MergeSort(ListNum,0, ListNum.length-1);
                     // WriteSortFile("./SortDoc.txt", ListStre);
                      for(Comparar i: ListStre) {
                    	  System.out.println(i.getNum());
                      }
                             
              //Ciclo para crear los números
              for (int i=0; i<cant; i++){
                  //Imprime los 3000 números enteros aleatorios
                  System.out.println(random.nextInt(3001));
              }

                      break;
                  case 2:
                      System.out.println("Quick");
                      ListStre = myMerge.MergeSort(ListNum,0, ListNum.length-1);
                      // WriteSortFile("./SortDoc.txt", ListStre);
                       for(Comparar i: ListStre) {
                     	  System.out.println(i.getNum());
                       }
                  
               
                      break;
                  case 3:
                      System.out.println("Insertion");
                      ListStre = myMerge.MergeSort(ListNum,0, ListNum.length-1);
                      // WriteSortFile("./SortDoc.txt", ListStre);
                       for(Comparar i: ListStre) {
                     	  System.out.println(i.getNum());
                       }
                
                      break;
                  case 4:
                      System.out.println("Radix");
                      ListStre = myMerge.MergeSort(ListNum,0, ListNum.length-1);
                      // WriteSortFile("./SortDoc.txt", ListStre);
                       for(Comparar i: ListStre) {
                     	  System.out.println(i.getNum());
                       }
                      
                      
                      
                      break;
                  case 5:
                      System.out.println("Gnome");
                      ListStre = myMerge.MergeSort(ListNum,0, ListNum.length-1);
                      // WriteSortFile("./SortDoc.txt", ListStre);
                       for(Comparar i: ListStre) {
                     	  System.out.println(i.getNum());
                       }
               
                      
                      break;
                  case 6:
                      System.out.println("Usted ha salido del programa");
                
                      
                      break;
              }

            		  }
            	  
          }

