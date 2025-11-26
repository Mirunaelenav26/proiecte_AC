import java.util.Scanner;

public class Calculator
{
    public static int cmmdc(operand1,operand2)
    {
        while(operand2!0)
                {
                    int aux=0;
                    operand2=operand1%operand2;
                    operand1=aux;
                }
        return operand1;
    }
    
    
    
    
    public static void main(Strings [] args)
    {
        Scanner sc=new Scanner(System.out);
        char operator;
        double operand1,operand2,rezultat;
        System.out.println("Alege operatia dorita:");
        System.out.println("Adunare: +");//aritmetice
        System.out.println("Scadere: -");
        System.out.println("Inmultire: *");
        System.out.println("Impartire: /");//aritmetice
        System.out.println("Putere : ^");
        System.out.println("Minimul dintre cele 2 numere: min");
        System.out.println("Maximul dintre cele 2 numere: max");
        System.out.println("Calcul cmmdc: d");
        System.out.println("Calcul cmmmc: m");
        System.out.println("Transformare din baza 10 in baza 2: b");// daca se alege asta se alege apoi si o operatie aritmetica
        System.out.println("Transformare din baza 10 in baza 8: o");//la fel si aici
        System.out.println("Transformare din baza 10 in baza 16: h");//x3
        //merge si logaritm in baza op1 din operand2
        //poate un while ca sa faca mai multe calcule si sa se opreaza cand introduce un cuvant cheie 
        //daca nr au mai mult de 2 cifre sa se inlocuiasca prima cifra a primului cu ultima cifra a celui d al doilea si tot asa de la i+1 pana la n-1 
        
        
        operator=sc.nextLine();
        
        System.out.println("Introdu primul numar: ");
        operand1=sc.nextDouble();
        
        System.out.println("Introdu al doilea numar: ");
        operand2=sc.nextDouble();
        
        switch(operator)
        {
            case "+":
                rezultat=operand1+operand2;
                System.out.println(operand1+ "+"+operand2+"="+rezultat);
            break;
            
            case "-":
                if(operand2>operand1)
                {
                    rezultat=operand1-operand2; //daca operand2>operand1;
                    System.out.println(operand1+"-"+operand2+"="+rezultat);
                }
            break;
            
            case "*":
                rezultat=operand1*operand2;
                System.out.println(operand1+"*"+operand2+"="+rezultat);
            break;
            
            case "/":
                rezultat=operand1/operand2;
                System.out.println(operand1+"/"+operand2+"="+rezultat);
            break;
            
            case "^":
                rezultat=Math.pow(operand1.operand2);
                System.out.println(operand1+"^"+operand2+"="+rezultat);
            break;
            
            case "min":
                if(operand1<operand2) System.out.println("Minimul dintre cele doua numere este: "+operand1);
                else if(operand1>operand2) System.out.println("Minimul dintre cele doua numere este:  "+operand2);
            break;
            
            case "max":
                if(operand1>operand2) System.out.println("Maximul dintre cele doua numere este: "+operand1);
                else if(operand1<operand2) System.out.println("Maximul dintre cele doua numere este:  "+operand2);
            break;
            
            case "d":
                System.out.println("Cel mai mare divizor comun al celor doua numere este: "+cmmdc(operand1.operand2));
            break;
            
            case "m":
                System.out.println("Cel mai mic multiplu comun al celor doua numere este: "+(operand1*operand2)/cmmdc(operand1,operand2));
            break;
            
            case "b":
                System.out.println("Primul numar, transformat din baza 10 in baza 2 este:"+ Integer.toBinaryString(operand1,2));
                System.out.println("Al doilea  numar, transformat din baza 10 in baza 2 este:"+ Integer.toBinaryString(operand2,2));
            break;
            
            case "o":
                System.out.println("Primul numar, transformat din baza 10 in baza 8 este:"+ Integer.toString(operand1,8)));
                System.out.println("Al doilea  numar, transformat din baza 10 in baza 8 este:"+ Integer.toString(operand2,8));
            break;
            
            case "h":
                System.out.println("Primul numar, transformat din baza 10 in baza 16 este:"+ Integer.toString(operand1,16)));
                System.out.println("Al doilea  numar, transformat din baza 10 in baza 16 este:"+ Integer.toString(operand2,16));
            break;
            
            
        
            
            
                
                
            
            
            
            
            
            
        }
        
        
        
        
        
        
        //la sf sa fac o matrice speciala plecand de la cele 2 numere!
        Sl. dr. ing. Oana Flangea 
        drd. ing. Olteanu Gabriela
        
    }
}