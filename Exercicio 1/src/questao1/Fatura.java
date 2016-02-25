package questao1;

public class Fatura {
	private String number;
	private String descricao;
	private int quant;
	private double price;
	
	public Fatura(String number,String descricao,int quant,double price){
	this.descricao=descricao;
	this.number=number;
	this.price=price;
	this.quant=quant;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
    public double getValorFatura(int quant,double price){
    	if((quant<0)||(price<0)){
    		return 0.0;
    	}else
    	return quant*price;
    }	
public String toString() {
	return "Descricao : "+this.descricao+"| Numero : "+this.number+"| Quantidade : "+this.quant+"| Preço : "+this.price+"| Valor da fatura : "+getValorFatura(this.quant,this.price);
}
}
