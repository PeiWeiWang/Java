package Single;

public class LazySingle {
	private  static LazySingle single ;
	public LazySingle() {	
	}
	//�ڱ�������,�ж�single�Ƿ��ж���,û���򴴽�,
	public synchronized static LazySingle getSingle() {
		if(single==null) {
			single = new LazySingle();
		}
		return single;
	}
}
