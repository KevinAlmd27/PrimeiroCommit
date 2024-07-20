package Prova;


class Salario {
	
    private double salarioBruto;

    public Salario(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double calcularSalarioLiquido() {
        double inss = INSS.calcular(salarioBruto);
        double ir = ImpostoDeRenda.calcular(salarioBruto, inss);
        return salarioBruto - inss - ir;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public double getINSS() {
        return INSS.calcular(salarioBruto);
    }

    public double getIR() {
        return ImpostoDeRenda.calcular(salarioBruto, getINSS());
    }
}