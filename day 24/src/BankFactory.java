abstract class BankAcc {

private int accNo;
private String accNm;
private float accBal;


public void setNo(int i) {       // getter and setter methods for private variable
accNo = i;
}

public int getNo( ) {
return accNo;
}

public void setNm(String j) {
accNm = j;
}

public String getNm( ) {
return accNm;
}

public void setch(float k) {
accBal = k;
}

public float getch( ) {
return accBal;
}                                  // getter and setter end;


abstract public void withdraw();


public void items()
{

}


abstract public String toString();

}



abstract class SavingAcc extends BankAcc {

private boolean isSalaried;
private float MINBAL;


public void setPr(boolean l) {       // getter and setter methods for private variable
isSalaried = l;
}

public boolean getPr( ) {
return isSalaried;
}


public void setd(float m) {      
MINBAL = m;
}

public float getd( ) {
return MINBAL;
}                                  // getter and setter methods end;


abstract public void withdraw();


abstract public String toString();

}



abstract class currentAcc extends BankAcc {

private float MINBAL;

    abstract public void withdraw();
    abstract public String toString();

}



class MMSavingACC extends SavingAcc {

static private float MINBAL;

public void withdraw() {

}


public String toString() {
String demo = "demo";
return demo;
}


}



class MMcurrentAcc extends CurrentAcc {

public void withdraw() {

}


public String toString() {
String demo2 = "demo_2";
return demo2;
}

}



class MMBankFactory extends BankFactory  {

	public getNewSavingAcc() {
		return null;

}    

	
	public  getNewCurrentAcc() {
		return null;

}



}



abstract public class BankFactory {

abstract public SavingAcc getNewPrimeAcc();


abstract public CurrentAcc getNewNormalAcc();

}
class MMSavingAcc extends SavingAcc{
	
	public MMSavingAcc(int AccNo, String AccNm, float AccBal, boolean MINBAL) {
		super(AccNo, AccNm, AccBal, MINBAL);
	}

	private static final float AccBal = 5;

	
	public void withdraw() {
	}
	
	
	public String toString() {
		return null;
	}
public class MMCurrentAcc extends CurrentAcc {

		public MMCurrentAcc(int AccNo, String AccNm, float AccBal, float MINBAL) {
			super(AccNo, AccNm, AccBal, MINBAL);		
		}
		
		public void withdraw() {
			
		}

		
		public String toString() {
		    String demo ="demo";
		    return demo;
		
		}
		
	}



public static void main(String[] args) {
// TODO Auto-generated method stub

}

}