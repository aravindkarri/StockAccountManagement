package com.bridgelabz.stockaccountmanagement;

public class Stocks
{
	//Properties
	private String symbolOfStock;
	private String stockNames;
	private int numOfShares;
	private double priceOfShares;

	//Generating setters and getters
	public String getSymbolOfStock()
	{
		return symbolOfStock;
	}
	public void setSymbolOfStock(String symbolOfStock)
	{
		this.symbolOfStock = symbolOfStock;
	}
	public String getStockNames() 
	{
		return stockNames;
	}
	public void setStockNames(String stockNames)
	{
		this.stockNames = stockNames;
	}
	public int getNumOfShares()
	{
		return numOfShares;
	}
	public void setNumOfShares(int numOfShares)
	{
		if(numOfShares < 0)
		{
			System.err.println("Shares can't be less than or equal to zero");
		}
		else
		{			
			this.numOfShares = numOfShares;
		}
	}
	public double getPriceOfShares() 
	{
		return priceOfShares;
	}
	public void setPriceOfShares(double priceOfShares)
	{
		if(priceOfShares < 0.0)
		{
			System.err.println("Price can't be less than or equal to zero");
		}
		else
		{
			this.priceOfShares = priceOfShares;
		}
	}
	/**
	 * Method to returns string representation  of the object
	 */
	@Override
	public String toString()
	{
		return "Stocks [symbolOfStock= " + symbolOfStock + ", stockNames=" + stockNames + ", numOfShares=" + numOfShares + ", priceOfShares=" + priceOfShares
				+ "]";
	}
}
