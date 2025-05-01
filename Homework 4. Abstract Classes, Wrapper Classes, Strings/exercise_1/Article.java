package exercise_1;

public abstract class Article {
	int discountThreshold;
	int householdLimit;

	public abstract int getBulkDiscount();

	public abstract boolean showWarning();

}

abstract class GroceryItem extends Article {
	boolean isPopular;
}

abstract class PopularGrocery extends GroceryItem {
	int popularityLevel, quantity;

	PopularGrocery(int popularityLevel) {
		this.isPopular = true;
		this.popularityLevel = popularityLevel;
	}

	@Override // abstrakte Methode gewesen
	public boolean showWarning() {
		if (this.quantity > this.householdLimit) {
			return true;
		}
		return false;
	}

	void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}

class Milk extends PopularGrocery {
	Milk(int quantity, int discountThreshold, int popularityLevel) {
		super(popularityLevel);
		this.discountThreshold = discountThreshold;
		this.quantity = quantity;
		this.householdLimit = 20;
	}

	@Override // war abstrakte Methode
	public int getBulkDiscount() {
		if (this.quantity >= this.discountThreshold) {
			return 12;
		} else {
			return 0;
		}
	}

}

class Flour extends PopularGrocery {
	Flour(int quantity, int discountThreshold, int popularityLevel) {
		super(popularityLevel);
		this.quantity = quantity;
		this.discountThreshold = discountThreshold;
		this.householdLimit = 15;
	}

	@Override // ""
	public int getBulkDiscount() {
		if (quantity >= discountThreshold) {
			return 5;
		} else {
			return 0;
		}
	}
}
