import entidade.Calcular;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer numero01;
        Integer resultado;
        String op;
        Calcular calc = new Calcular();
        Scanner input = new Scanner(System.in);
        System.out.println("Exercício Calculadora!");
        System.out.print("Digitar um numero: ");
        resultado = input.nextInt();

        do {
            System.out.print("Digitar operacão (+ - * / =) ");
            op = input.next();
            if(op.equalsIgnoreCase("=")) {
                break;
            }else{
                System.out.print("Digitar um numero: ");
                numero01 = input.nextInt();
                if(op.equalsIgnoreCase("+")){
                    resultado = calc.somar(resultado,numero01);
                }else if(op.equals("-")){
                    resultado = calc.subitrair(resultado,numero01);
                }else if(op.equals("*")){
                    resultado = calc.multiplicar(resultado,numero01);
                }else if(op.equals("/")){
                    resultado = calc.dividir(resultado,numero01);
                }else {
                    System.out.println("Opção inválida");
                }
            }

        }while (!op.equalsIgnoreCase("="));
        System.out.println("O resurtado é : "+ resultado);
        input.close();
    }
}