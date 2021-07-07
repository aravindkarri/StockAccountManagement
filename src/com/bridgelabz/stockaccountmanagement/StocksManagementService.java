package com.bridgelabz.stockaccountmanagement;

public interface StocksManagementService
{
	public void addStocks(Stocks stock);
	public void getStocksDetails();
	public void getStockDetailsByName(String stockName);
	public void calculateEachStockValue();
	public void totalValueOfStocks();
	public void buyStocks(int numOfShares,String symbolOfStock);
	public void sellStocks(int numOfShares,String symbolOfStock);
	public void getTime();
}
