import java.util.ArrayList;

// �@�~3 11.8 TestProgram   ���T  �m�W:������ �Ǹ�:U10116048 
public class TestProgram118 {

	public static void main(String[] args) {
		Account ac=new Account(null,0,0);
		//Transaction my= new Transaction();
		ac.setAIR(0.15);//�]�w�~�Q�v
		ac.setId(1122);//�]�wid
		ac.setBalance(1000);//�]�w�l�B
		ac.name="George";//�Τ�W��
		ac.info();//�L�X�b�����		
		ac.deposit(30);//�s30�� ��������N�۰ʦC�X����
		ac.deposit(40);//�s40�� ��������N�۰ʦC�X����
		ac.deposit(50);//�s50�� ��������N�۰ʦC�X����
		ac.withDraw(5);//��X5�� ��������N�۰ʦC�X����
		ac.withDraw(4);//��X4�� ��������N�۰ʦC�X����
		ac.withDraw(2);//��X2�� ��������N�۰ʦC�X����
		
		
		
	}

}
