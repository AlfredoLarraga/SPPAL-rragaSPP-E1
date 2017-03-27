/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2ej1;
import java.util.Scanner;
/**
 *
 * @author AALS
 */
public class Proyecto2ej1 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Calculadora de Matrices");
        System.out.println("¿Qué operación va a realizar?");
        System.out.println("1. Suma de matrices");
        System.out.println("2. Resta de matrices");
        System.out.println("3. Multiplicacion de matrices");
        System.out.println("4. Ninguna, salir");
        Scanner kb = new Scanner(System.in);
        
        
        int opEntrada;
        opEntrada = kb.nextInt();
        
        
       
        int tamano=solicitaTamano();
        int[][] a = arreglo("A", tamano);
        int[][] b = arreglo("B",tamano);
        
        switch(opEntrada){
            case 1:
                sumaMatriz(a,b);
                break;
            case 2:
                restaMatriz(a,b);
                break;
            case 3:
                multiplicacionMatriz(a,b);
                break;
            default:
                System.out.println("¡Vuelve pronto!");
        }
        
    }
    public static int solicitaTamano(){
        Scanner key;
        key = new Scanner (System.in);
        boolean flag;
        int a = 0;
        do{
            try{
                System.out.println("Introduce el tamaño del arreglo: ");
                a = key.nextInt();
                flag = false;
            }
            catch (Exception e){
                System.out.println("Error");
                key.next();
                flag = true;
            }
        }
        while (flag);
        return a;
        }
    public static int solicitaEntero(){
        Scanner kb= new Scanner (System.in);
        boolean flag;
        int n=0;
        do{
            System.out.println("Introduce un número entero");
            try{
                n=kb.nextInt();
                flag=false;
                
            }
            catch(Exception er){
                System.out.println("Lo que introdujo no es un entero, prueba otra vez");
                flag=true;
                kb.nextLine();
            }
        }while (flag);
        
        return n;
        }
    
    public static int [][] arreglo (String a, int tamaño){
        int [][]arreglo = new int [tamaño][tamaño];
        System.out.println("Arreglo: " + a);
        for (int[] arreglo1 : arreglo) {
            for (int j = 0; j < arreglo1.length; j++) {
                arreglo1[j] = solicitaEntero();
            }
        }
        return arreglo;
        }
    public static int [][] sumaMatriz(int[][] a, int[][]b){
        int[][] resultado =new int [a.length] [a.length];
        System.out.println("Suma: ");
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                resultado[i][j]= a[i][j] + b[i][j];
                System.out.println("["+resultado[i][j]+")");
            }
        }System.out.println("");
        return resultado;
    } 
            public static int [][] restaMatriz (int [][]a, int[][]b){
        int [][] resultado = new int [a.length] [a.length];
        System.out.println("Resta: ");
        for (int i = 0; i < a.length; i++){
        for (int j = 0; j < a[i].length; j++){
        resultado[i][j] = a[i][j] - b[i][j];
        System.out.println("["+resultado[i][j]+"]");   
        }
        System.out.println("");   
        }
        return resultado; 
        }
        
        public static int [][] multiplicacionMatriz (int [][]a, int[][]b){
        int [][] resultado = new int [a.length] [a.length];
        System.out.println("Multiplicación: ");
        for (int i = 0; i < a.length; i++){
        for (int j = 0; j < a[i].length; j++){
        resultado[i][j] = a[i][j] * b[i][j];
        System.out.println("["+resultado[i][j]+"]");   
        }
        System.out.println("");   
        }
        return resultado; 
        }
    
}
    
