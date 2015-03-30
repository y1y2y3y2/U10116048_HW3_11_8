//U10116048 楊明璋 作業3 11.8 Account
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Account {//模擬銀行
	String name=" ";//客戶名子
	Scanner keyin=new Scanner(System.in);//建立物件:Scanner
	private int id=0;//帳號
	private double balance=0;//餘額
	private double annualInterestRate=0;//年利息
	private Date dateCreated;
	ArrayList transaction=new ArrayList();//用ArrayList
	
	
	Account(){//no-arg constructor
		//建立default Account
		id=1;
		balance=0;
		annualInterestRate=0;
	}
	/*新的contructor*/
	public Account(String name ,int id ,double balance){
		name="小明";
		id=1234;
		balance=10000000;
	}
	/**/
	
	//accessor method for id
	public int getid(){
		return id;
	}
	//mutator method for id
	public void setId(int idin){
		id=idin;
	}
	
	//accessor method for balance
	public double getBalance(){
		return balance;
	}
	//mutator method for balance
	public void setBalance(double in){
			balance=in;
	}
	//accesor method for create date
	public Date getDateCreated(){
		return dateCreated;
	}
	//mutator method create date
		public void setDateCreated(){
			//dateCreated=0;
		}
	//mutator method for 年利率
		public void setAIR(double in){
			annualInterestRate=in;
		}
	/*月利率*/
	public double getMonthlyInterestRate(){
		double MonthlyInterestRate=0;
		annualInterestRate=0.045;
		MonthlyInterestRate=annualInterestRate/12;//月利率=年利率/12
		return MonthlyInterestRate;
	}
	/*月利息*/
	public double getMonthlyInterest(){
		double MonthlyInterest=0;
		annualInterestRate=0.045;
		MonthlyInterest=balance+(balance*(annualInterestRate/12));//月息=餘額*(1+月利率)
		return MonthlyInterest;
	}
	
	
	/*領錢*/
	public void withDraw(int out){
		Transaction output=new Transaction('W',out,balance,"領錢");
		transaction.add(output);//存到ArrayList
		balance=balance-out;//計算餘額
		output.detail(balance);//完成交易後印出明細
	}
	/*存錢*/
	public void deposit(int in){
		
		Transaction input=new Transaction('D',in,balance,"存錢");
		transaction.add(input);//存到ArrayList
		balance=balance+in;//計算餘額
		input.detail(balance);//完成交易後印出明細
	}
	public void info(){
		System.out.println("您好"+name);
		System.out.println("用戶ID:"+id);
		System.out.println("年利率:"+annualInterestRate);
		System.out.println("餘額:"+balance);
		
	}
		
}
/*Transaction class 交易*/
class Transaction{
	
	private java.util.Date date;//java .util.Date
	private char type;
	private double amount;
	private double balance;//交易後的餘額
	private String description;
	public Transaction(char type1,double amount1,double balance1,String description1){
		type=type1;
		amount=amount1;
		balance=balance+balance1;//餘額
		description=description1;
	}
	//get method for date
	public Date getDate(){
		return date;
	}
	//get method for type
	public char getType(){
		return type;
	}
	//get method for amount
	public double amount(){
		return amount;
	}
	//get method for balance
	public double balance(){
		return balance;
	}
	//get method for description
	public String description(){
		return description;
	}
	//印出交易明細
	public void detail(double l){
		balance=l;//放入回傳的餘額
		System.out.println("*********************");
		System.out.println("交易明細:");
		System.out.println("交易種類代碼:"+type);
		System.out.println("交易描述:"+description);
		System.out.println("交易金額:"+amount);
		System.out.println("交易後餘額:"+balance);
		System.out.println("*********************");
	}
}

