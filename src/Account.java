//U10116048 ������ �@�~3 11.8 Account
import java.util.Date;
import java.util.Scanner;


public class Account {//�����Ȧ�
	String name=" ";//�Ȥ�W�l
	Scanner keyin=new Scanner(System.in);//�إߪ���:Scanner
	private int id=0;//�b��
	private double balance=0;//�l�B
	private double annualInterestRate=0.045;//�~�Q�� �D�ث��w
	private Date dateCreated;
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
	public void setId(){
		id=id+1;
	}
	
	//accessor method for balance
	public double getBalance(int id){
		return balance;
	}
	//mutator method for balance
	public void setBalance(int id){
			
	}
	//accesor method for create date
	public Date getDateCreated(){
		return dateCreated;
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
	public void withDraw(){
		int money=0;//�Ȧs��:�Ψө�J���ڪ��B
		System.out.println("�п�J���ڪ��B");
		money=keyin.nextInt();
		balance=balance-money;//�B��
		money=0;//�B�⧹�� �Ȧs���k�s
		System.out.println("�z�w����"+money+"�� �l�B:"+balance+"��");
	}
	/*�s��*/
	public void deposit(){
		int put=0;
		System.out.println("�п�J�s�ڪ��B");
		put=keyin.nextInt();
		balance=balance+put;
		put=0;
		System.out.println("�z�w�����s��"+put+"�� �l�B:"+balance+"��");
	}
		
}

