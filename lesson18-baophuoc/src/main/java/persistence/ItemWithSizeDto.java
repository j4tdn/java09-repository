package persistence;

public class ItemWithSizeDto {
	
	public static final String IG_ID="igId";
	public static final String IG_NAME="igName";
	public static final String IT_ID="itId";
	public static final String IT_NAME="itName";
	public static final String SALE="SalePrice";
	public static final String BUY="BuyPrice";
	public static final String NOF="nof";


	
	
	private Integer igId;
	private String igName;
	private Integer itId;
	private String itName;
	private Double SalePrice;
	private Double BuyPrice;
	private Integer Nof;
	
	public ItemWithSizeDto() {
	}

	public ItemWithSizeDto(Integer igId, String igName, Integer itId, String itName, Double salePrice, Double buyPrice,
			Integer nof) {
		super();
		this.igId = igId;
		this.igName = igName;
		this.itId = itId;
		this.itName = itName;
		this.SalePrice = salePrice;
		this.BuyPrice = buyPrice;
		this.Nof = nof;
	}

	public Integer getIgId() {
		return igId;
	}

	public void setIgId(Integer igId) {
		this.igId = igId;
	}

	public String getIgName() {
		return igName;
	}

	public void setIgName(String igName) {
		this.igName = igName;
	}

	public Integer getItId() {
		return itId;
	}

	public void setItId(Integer itId) {
		this.itId = itId;
	}

	public String getItName() {
		return itName;
	}

	public void setItName(String itName) {
		this.itName = itName;
	}

	public Double getSalePrice() {
		return SalePrice;
	}

	public void setSalePrice(Double salePrice) {
		SalePrice = salePrice;
	}

	public Double getBuyPrice() {
		return BuyPrice;
	}

	public void setBuyPrice(Double buyPrice) {
		BuyPrice = buyPrice;
	}

	public Integer getNof() {
		return Nof;
	}

	public void setNof(Integer nof) {
		Nof = nof;
	}

	@Override
	public String toString() {
		return "ItemWithSizeDto [igId=" + igId + ", igName=" + igName + ", itId=" + itId + ", itName=" + itName
				+ ", SalePrice=" + SalePrice + ", BuyPrice=" + BuyPrice + ", Nof=" + Nof + "]";
	}

	
	
}

