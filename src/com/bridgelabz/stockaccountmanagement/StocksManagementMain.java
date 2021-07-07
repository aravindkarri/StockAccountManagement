package com.bridgelabz.stockaccountmanagement;

import java.util.Scanner;

public class StocksManagementMain 
{
	public static void main(String[] args)
	{
		StocksManagementService stocksService = new StocksManagementServiceImpl();

		while(true)
		{

			System.out.println("Welcome to Stock Account Management");
			Scanner scanner = new Scanner(System.in);
			System.out.println("1) Add Stocks"
					+ "\n \t 2) Get Stocks details"
					+ "\n \t 3) Get stock details by name"
					+ "\n \t 4) Calculate value of each stock"
					+ "\n \t 5) Calculate total stock value"
					+ "\n \t 6) Buy stocks"
					+ "\n \t 7) sell stocks"
					+ "\n \t 8) quit");
			System.out.println("choose an option: ");
			int chooseOption = scanner.nextInt();
			switch(chooseOption)
			{
			case 1:

				System.out.println("Enter number of stocks do you want to add: ");
				int numOfStocks = scanner.nextInt();

				for(int index=0;index<numOfStocks;index++)
				{
					Stocks stocksObj = new Stocks();
					System.out.println("Enter stock name: ");
					stocksObj.setStockNames(scanner.next());
					System.out.println("Enter symbol of stock");
					stocksObj.setSymbolOfStock(scanner.next());
					System.out.println("Enter number of shares :");
					stocksObj.setNumOfShares(scanner.nextInt());
					System.out.println("Enter price of stock : ");
					stocksObj.setPriceOfShares(scanner.nextDouble());
					stocksService.addStocks(stocksObj);

				}
				break;

			case 2:
				stocksService.getStocksDetails();
				break;

			case 3:
				System.out.println("Enter a stockName to get its details : ");
				String stockName = scanner.next();
				stocksService.getStockDetailsByName(stockName);
				break;

			case 4:
				stocksService.calculateEachStockValue();
				break;

			case 5:
				stocksService.totalValueOfStocks();
				break;

			case 6:
				System.out.println("Enter stock sybmol of company: ");
				String symbolOfStock = scanner.next();
				System.out.println("How many shares do you want to buy? ");
				int numOfShares = scanner.nextInt();
				stocksService.buyStocks(numOfShares, symbolOfStock);
				break;

			case 7:
				System.out.println("Enter stock symbol of company do you want to sell ");
				String symbolOfStocks = scanner.next();
				System.out.println("How many shares do you want to sell? ");
				int numOfShare = scanner.nextInt();
				stocksService.sellStocks(numOfShare, symbolOfStocks);
				break;
			default:
				System.out.println("Choose correct option");
			}
		}
	}
}
