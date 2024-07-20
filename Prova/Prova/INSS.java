package Prova;


public class INSS {
	    public static double calcular(double salarioBruto) {
	        if (salarioBruto <= 1212.00) {
	            return salarioBruto * 0.075;
	        } else if (salarioBruto <= 2427.35) {
	            return salarioBruto * 0.09;
	        } else if (salarioBruto <= 3641.03) {
	            return salarioBruto * 0.12;
	        } else if (salarioBruto <= 7087.22) {
	            return salarioBruto * 0.14;
	        } else {
	            return 0.14 * 7087.22; 
	        }
	    }
	    
	}


