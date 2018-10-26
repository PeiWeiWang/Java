package Single;

public class LazySingle {
	private  static LazySingle single ;
	public LazySingle() {	
	}
	//在被调用是,判断single是否有对象,没有则创建,
	public synchronized static LazySingle getSingle() {
		if(single==null) {
			single = new LazySingle();
		}
		return single;
	}
}
