//U10116048 ������ �@�~3 11.8 Account
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Account {//�����Ȧ�
	String name=" ";//�Ȥ�W�l
	Scanner keyin=new Scanner(System.in);//�إߪ���:Scanner
	private int id=0;//�b��
	private double balance=0;//�l�B
	private double annualInterestRate=0;//�~�Q��
	private Date dateCreated;
	ArrayList transaction=new ArrayList();//��ArrayList
	
	
	Account(){//no-arg constructor
		//�إ�default Account
		id=1;
		balance=0;
		annualInterestRate=0;
	}
	/*�s��contructor*/
	public Account(String name ,int id ,double balance){
		name="�p��";
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
	//mutator method for �~�Q�v
		public void setAIR(double in){
			annualInterestRate=in;
		}
	/*��Q�v*/
	public double getMonthlyInterestRate(){
		double MonthlyInterestRate=0;
		annualInterestRate=0.045;
		MonthlyInterestRate=annualInterestRate/12;//��Q�v=�~�Q�v/12
		return MonthlyInterestRate;
	}
	/*��Q��*/
	public double getMonthlyInterest(){
		double MonthlyInterest=0;
		annualInterestRate=0.045;
		MonthlyInterest=balance+(balance*(annualInterestRate/12));//�뮧=�l�B*(1+��Q�v)
		return MonthlyInterest;
	}
	
	
	/*���*/
	public void withDraw(int out){
		Transaction output=new Transaction('W',out,balance,"���");
		transaction.add(output);//�s��ArrayList
		balance=balance-out;//�p��l�B
		output.detail(balance);//���������L�X����
	}
	/*�s��*/
	public void deposit(int in){
		
		Transaction input=new Transaction('D',in,balance,"�s��");
		transaction.add(input);//�s��ArrayList
		balance=balance+in;//�p��l�B
		input.detail(balance);//���������L�X����
	}
	public void info(){
		System.out.println("�z�n"+name);
		System.out.println("�Τ�ID:"+id);
		System.out.println("�~�Q�v:"+annualInterestRate);
		System.out.println("�l�B:"+balance);
		
	}
		
}
/*Transaction class ���*/
class Transaction{
	
	private java.util.Date date;//java .util.Date
	private char type;
	private double amount;
	private double balance;//����᪺�l�B
	private String description;
	public Transaction(char type1,double amount1,double balance1,String description1){
		type=type1;
		amount=amount1;
		balance=balance+balance1;//�l�B
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
	//�L�X�������
	public void detail(double l){
		balance=l;//��J�^�Ǫ��l�B
		System.out.println("*********************");
		System.out.println("�������:");
		System.out.println("��������N�X:"+type);
		System.out.println("����y�z:"+description);
		System.out.println("������B:"+amount);
		System.out.println("�����l�B:"+balance);
		System.out.println("*********************");
	}
}

