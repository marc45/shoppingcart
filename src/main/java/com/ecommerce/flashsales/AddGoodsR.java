package com.ecommerce.flashsales;
/***
 * 
 * @author wuwesley
 * the class for good inventory info
 */

public class AddGoodsR {
	public String sessionID;
	public String userID;
	public String goodsSKU;
	public int goodsQuantity;
	public boolean isAllowed = false;
	public boolean isThrottled = false;
	
	public String getSessionID() {
		return sessionID;
	}
	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getGoodsSKU() {
		return goodsSKU;
	}
	public void setGoodsSKU(String goodsSKU) {
		this.goodsSKU = goodsSKU;
	}
	public int getGoodsQuantity() {
		return goodsQuantity;
	}
	public void setGoodsQuantity(int goodsQuantity) {
		this.goodsQuantity = goodsQuantity;
	}
	public boolean getIsAllowed() {
		return isAllowed;
	}
	public void setIslowed(boolean isAllowed) {
		this.isAllowed = isAllowed;
	}
	public boolean getIsThrottled() {
		return isThrottled;
	}
	public void setIsThrottled(boolean isThrottled) {
		this.isThrottled = isThrottled;
	}
	@Override
	public String toString() {
		return "AddGoodsR [sessionID=" + sessionID + ", userID=" + userID + ", goodsSKU=" + goodsSKU
				+ ", goodsQuantity=" + goodsQuantity + ", isAllowed=" + isAllowed + ", isThrottled=" + isThrottled
				+ "]";
	}
	
}
