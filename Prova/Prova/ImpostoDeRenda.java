package Prova;

class ImpostoDeRenda {
    public static double calcular(double salarioBruto, double inss) {
        double salarioBase = salarioBruto - inss;

        if (salarioBase <= 1903.98) {
            return 0;
        } else if (salarioBase <= 2826.65) {
            return salarioBase * 0.075;
        } else if (salarioBase <= 3751.05) {
            return salarioBase * 0.15;
        } else if (salarioBase <= 4664.68) {
            return salarioBase * 0.225;
        } else {
            return salarioBase * 0.275;
        }
    }
}
