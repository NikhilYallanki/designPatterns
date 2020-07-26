package behaviourPattern.observerPattern;
public class CurrencyConvert {
	
	double rupee;
	Yuan yuan;
	Dollar dollar;
	
	public CurrencyConvert(Yuan yuan, Dollar dollar) {
		this.yuan=yuan;
		this.dollar=dollar;
	}
	
	public void convertCurrency(double rupee) {
		this.rupee=rupee;
		yuan.convert(rupee);
		dollar.convert(rupee);
	}
}
