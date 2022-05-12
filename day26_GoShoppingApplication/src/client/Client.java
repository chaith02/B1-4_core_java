package client;

import application.GSNormalAcc;
import application.GSPrimeAcc;
import application.GSShopFactory;
import framework.NormalAcc;
import framework.PrimeAcc;
import framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopFactory s=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(123,"Vinat T N",250,true);
		NormalAcc n=new GSNormalAcc(124,"Tharun",300,10);
		System.out.println("Prime account ");
		p.bookProduct(p.getCharge());
		System.out.println("Normal account");
		n.bookProduct(n.getCharges());
		System.out.println(s.getNewPrimeAccount(1, "Sathwik", 1236, true));
		System.out.println(s.getNewNormalAccount(800, "Darshan", 1000, 50));
		
		System.out.println(p);
		System.out.println(n);
		}

	}