package allocation;



import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class WhAllocatedAmountManager {
	static final Integer allocationAmount = 300;
	/**
	 * BigDecimal a = BigDecimal.valueOf(10); 
	 * BigDecimal b = BigDecimal.valueOf(20);
	 * BigDecimal mul = a.multiply(b); 
	 * BigDecimal div = a.divide(b); 
	 * BigDecimal add = a.add(b); 
	 * BigDecimal sub = a.subtract(b); 
	 * 
	 * Rounding
	 * a.setScale(10, RoundingMode.HALF_UP);
	 */
	
    public static void main(String[] args) {

    	final List<Store> data = getItems();
    }

    public static List<Store> getItems() {
        return Arrays.asList(
            new Store(1L, null, 18L, 40L, Boolean.TRUE),
                new Store(2L, null, 19L, 20L, Boolean.TRUE),
                new Store(3L, null, 21L, 17L, Boolean.TRUE),
                new Store(4L, null, 14L, 31L, Boolean.TRUE),
                new Store(5L, null, 14L, 10L, Boolean.TRUE),
                new Store(6L, null, 15L, 30L, Boolean.TRUE),
                new Store(7L, 2L, 15L, null, Boolean.TRUE),
                new Store(8L, null, 12L, 19L, Boolean.TRUE),
                new Store(9L, null, 17L,26L, Boolean.TRUE),
                new Store(10L, 7L, 18L, null, Boolean.TRUE),
                new Store(11L, null, 22L, null, Boolean.FALSE)
        );
    }

    public static BigDecimal bd(long value) {
        return BigDecimal.valueOf(value);
    }

    /**
     * Do Allocation.
     * 
     * Key: storeId with Long type
     * Value: storeAllocatedAmount after calculation with 4 steps
     * @return map of storeId, storeAllocatedAmount
     */
    private Map<Long, Integer> doAllocation(List<Store> data) {
        return null;
    }


}

