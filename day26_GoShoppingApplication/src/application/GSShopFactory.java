package application;

import framework.*;

public class GSShopFactory extends ShopFactory{
	
	
	public GSPrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges,boolean isPrime) {
		GSPrimeAcc p=new GSPrimeAcc(accNo,accNm,charges,isPrime);
		return p;
	}

	
	public GSNormalAcc getNewNormalAcc(int accNo, String accNm, float charges,float deliveryCharges) {
		GSNormalAcc n=new GSNormalAcc(accNo,accNm,charges,deliveryCharges);
		return n;
	}


	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float delivaryCharges, boolean b) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float delivaryCharges, float charges) {
		// TODO Auto-generated method stub
		return null;
	}



}