public class TesteCalculadora {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        int operando1 = 5, operando2 = 13;

        float f1 = 2.5f, f2 = 5.7F;
        String s1 = "2", s2 = "45";
        //isso é uma chamda (call) de método
        int res = calc.somar(operando1, operando2);
        System.out.println(res);

        //A sobrecarga é uso por apenas conveniencia ele não obrigatório
        float resfloat = calc.somar(f1, f2);
        System.out.println(resfloat);

        int resString = calc.somar(s1, s2);
        System.out.println(resString);

        int resTresInt = calc.somar(operando1, operando2, 5);
        System.out.println(resTresInt);

        int resultado = calc.somar(2, 3);
        System.out.println(resultado);

        float resultadoF = calc.somar(2, 3);
        System.out.println(resultadoF);
    }
}
