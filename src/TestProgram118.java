import java.util.ArrayList;

// 作業3 11.8 TestProgram   資科三  姓名:楊明璋 學號:U10116048 
public class TestProgram118 {

	public static void main(String[] args) {
		Account ac=new Account(null,0,0);
		//Transaction my= new Transaction();
		ac.setAIR(0.15);//設定年利率
		ac.setId(1122);//設定id
		ac.setBalance(1000);//設定餘額
		ac.name="George";//用戶名稱
		ac.info();//印出帳戶明細		
		ac.deposit(30);//存30元 完成交易將自動列出明細
		ac.deposit(40);//存40元 完成交易將自動列出明細
		ac.deposit(50);//存50元 完成交易將自動列出明細
		ac.withDraw(5);//領出5元 完成交易將自動列出明細
		ac.withDraw(4);//領出4元 完成交易將自動列出明細
		ac.withDraw(2);//領出2元 完成交易將自動列出明細
		
		
		
	}

}
