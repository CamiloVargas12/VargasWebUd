package modeloCDT;

public class CDTDAO {

	private static final double ANIO = 365;

	public static void calcular(CDT cdt) {

		double ganancia =
			cdt.getInversion() *
			(cdt.getInteres() * (cdt.getPlazo() / ANIO));

		double impuesto = ganancia * 0.04;

		double valorFuturo =
			cdt.getInversion() + ganancia;

		cdt.setGanancia(ganancia);
		cdt.setImpuesto(impuesto);
		cdt.setValorFuturo(valorFuturo);
	}
}