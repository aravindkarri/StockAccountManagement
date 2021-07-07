package com.bridgelabz.stockaccountmanagement;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Date;
import java.util.Queue;
import java.text.SimpleDateFormat;

public class StocksManagementServiceImpl implements StocksManagementService
{

	LinkedList<Stocks> stocksList = new LinkedList<Stocks>();
	Stack<String> stackList = new Stack<String>();

	//Method to add stocks to linked list
	@Override
	public void addStocks(Stocks stock)
	{

		if(stocksList.contains(stock))
		{
			System.out.println("Stock is already exist");
		}
		else
		{
			stocksList.add(stock);
		}

	}

	//Method to get all stocks details 
	@Override
	public void getStocksDetails() 
	{

		for(Stocks stocks: stocksList)
		{
			System.out.println(stocks);
		}

	}

	//Method to get details of stocks by name
	@Override
	public void getStockDetailsByName(String stockName)
	{

		for(Stocks stock : stocksList)
		{
			if(stock.getStockNames().equals(stockName))
			{
				System.out.println(stock);
			}
		}

	}

	//Method to calculate value of each stocks
	@Override
	public void calculateEachStockValue() 
	{

		for(Stocks stock : stocksList)
		{
			double stockValue = stock.getNumOfShares()*stock.getPriceOfShares();
			System.out.println("Value of the stock "+stock.getStockNames()+" is "+stockValue);
		}

	}

	//Method to get total value of stocks
	@Override
	public void totalValueOfStocks() 
	{

		double totalStockValue=0.0;
		for(Stocks stock: stocksList)
		{
			totalStockValue += stock.getNumOfShares()*stock.getPriceOfShares();
		}
		System.out.println("Value of the total stocks is "+totalStockValue);

	}

	//Method to buy stocks
	@Override
	public void buyStocks(int numOfShares, String symbolOfStock)
	{
		for(Stocks stock: stocksList)
		{
			if(stock.getSymbolOfStock().equals(symbolOfStock))
			{
				int shareCount = stock.getNumOfShares() + numOfShares;
				stock.setNumOfShares(shareCount);
				String record = "Person purchased "+numOfShares+ "shares ,currently he is having "+stock.getNumOfShares();
				stackList.push(record);
				System.out.println("purchased successfully");
			}
		}
	}

	//Method to sell stocks 
	public void sellStocks(int numOfShares,String symbolOfStock)
	{
		for(Stocks stock : stocksList)
		{
			if(stock.getNumOfShares() > numOfShares)
			{
				int shareCount = stock.getNumOfShares() - numOfShares;
				stock.setNumOfShares(shareCount);
				String record = "Person sold "+numOfShares +"shares, currentl he is having "+stock.getNumOfShares();
				stackList.push(record);
				System.out.println("Sold successfully");
			}
		}
	}
	//Method to get current time
	public void getTime()
	{
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		System.out.println(formatter.format(date)); 
	}
}
