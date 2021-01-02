package allocation;


import java.math.BigDecimal;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ComparatorClass {
	private Integer differenceAmoAndDem;
	private Integer demand;
	private BigDecimal interpolatedExpectedSales;
	private Long storeId;
	
	public ComparatorClass(Integer differenceAmoAndDem, Integer demand, BigDecimal interpolatedExpectedSales, Long storeId) {
		this.differenceAmoAndDem = differenceAmoAndDem;
		this.demand = demand;
		this.interpolatedExpectedSales = interpolatedExpectedSales;
		this.storeId = storeId;
	}

	public Integer getDifferenceAmoAndDem() {
		return differenceAmoAndDem;
	}

	public void setDifferenceAmoAndDem(Integer differenceAmoAndDem) {
		this.differenceAmoAndDem = differenceAmoAndDem;
	}

	public Integer getDemand() {
		return demand;
	}

	public void setDemand(Integer demand) {
		this.demand = demand;
	}

	public BigDecimal getInterpolatedExpectedSales() {
		return interpolatedExpectedSales;
	}

	public void setInterpolatedExpectedSales(BigDecimal interpolatedExpectedSales) {
		this.interpolatedExpectedSales = interpolatedExpectedSales;
	}

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this)
                .append("differenceAmoAndDem", differenceAmoAndDem)
                .append("demand", demand)
                .append("interpolatedExpectedSales", interpolatedExpectedSales)
                .append("storeId", storeId)
                .toString();
	}
	
}

