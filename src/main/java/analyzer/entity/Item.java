package analyzer.entity;

public class Item {
	private String id;
	
	private String itemName;
	
	/*
	 * 批号
	 */
	private String num;
	
	/**
	 * 有效期
	 */
	private String validDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getValidDate() {
		return validDate;
	}

	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}
	
	
	
}
