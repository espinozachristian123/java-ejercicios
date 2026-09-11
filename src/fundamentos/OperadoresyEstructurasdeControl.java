package fundamentos;

public class OperadoresyEstructurasdeControl {
    public void main(String[] args){
        int numero1, numero2, bit1, bit2;
        boolean condicion1, condicion2;
        String palabra = "Christian";
        String palabra2 = "ppepe";
        condicion1 =true;
        condicion2=false;
        numero1 = 1;
        numero2 = 2;
        bit1= 5;
        bit2=3;
        System.out.println("La suma es: "+ numero1+"+"+numero2+"="+(numero1+numero2)+"\n");
        System.out.println("La resta es: "+ numero1+"-"+numero2+"="+(numero1-numero2)+"\n");
        System.out.println("La multiplicacion es: "+ numero1+"x"+numero2+"="+(numero1*numero2)+"\n");
        System.out.println("La division es: "+ numero1+"/"+numero2+"="+(numero1/numero2)+"\n");
        System.out.println("El resto es: "+ numero1+"%"+numero2+"="+(numero1%numero2));

        System.out.println("El numero1 es igual al numero2? "+numero1+"=="+numero2+ "="+ (numero1==numero2));
        System.out.println("El numero1 es diferente de numero2? "+numero1+"!="+numero2+ "="+ (numero1!=numero2));
        System.out.println("El numero1 es mayor de numero2? "+numero1+">"+numero2+ "="+ (numero1>numero2));
        System.out.println("El numero1 es menor de numero2? "+numero1+"<"+numero2+ "="+ (numero1<numero2));
        System.out.println("El numero1 es mayor o igual de numero2? "+numero1+">="+numero2+ "="+ (numero1>=numero2));
        System.out.println("El numero1 es menor o igual de numero2? "+numero1+"<="+numero2+ "="+ (numero1<=numero2));

        System.out.println("Vamos a probar esto &&: "+ (condicion1&&condicion2));
        System.out.println("Vamos a probar esto ||: "+ (condicion1||condicion2));
        System.out.println("Vamos a probar esto !: "+ (!condicion1));
        System.out.println("Vamos a probar esto !: "+ (!condicion2));

        numero1+=5;
        System.out.println("Utilizamos += para sumar directamente 5: " + numero1);
        numero1-=3;
        System.out.println("Ahora Utilizamos -= para restar directamente 3: "+ numero1);
        numero1 *= 4;
        System.out.println("Ahora Utilizamos *= para multiplicar directamente 4: "+ numero1);
        numero1 /= 2;
        System.out.println("Ahora Utilizamos /= para dividir directamente 2: "+ numero1);
        numero1 %= 3;
        System.out.println("Ahora Utilizamos %= para calcular residuo directamente 3: "+ numero1);
        System.out.println("Comprobando nombres: "+palabra.equals(palabra2));
        System.out.println("Comprobando objetos: "+(palabra==palabra2));

        System.out.println("Operacion AND bit a bit con &: "+ (bit1&bit2));
        System.out.println("Operacion OR bit a bit con |: "+ (bit1|bit2));
        System.out.println("Operacion XOR bit a bit con ^: "+ (bit1^bit2));
        System.out.println("Vamos a mover bits a la izquierda con <<: "+ (bit1<<bit2));
        System.out.println("Vamos a mover bits a la derecha con >>: "+ (bit1>>bit2));
       // System.out.println("Vamos a mover bits con &: "+ (bit1&bit2));
    }
}
