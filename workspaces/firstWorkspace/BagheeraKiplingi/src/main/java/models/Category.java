package models;

public class Category {
	
	private int categoryId;
	private String categoryName;

	public int getCategoryId() {
		return categoryId;
	}

	public Category setCategoryId(int categoryId) {
		this.categoryId = categoryId;
		return this;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public Category setCategoryName(String categoryName) {
		this.categoryName = categoryName;
		return this;
	}

}