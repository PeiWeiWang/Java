package Single;

/***
 * 单列模式 需求:项目运行期间,Single类对象只能有一个 
 * 1.构造方法私有化,让类的外部无法创建新的对象
 * 2.自行实例化奔雷的对象(遵循封装原则,属性需要私有化) 
 * 3.对私有化的实例化本类对象只提供向外发布的接口,不提供修改接口
 * 4.为了在类的外部不创建对象也可以使用,必须使用static修饰
 */
public class Single {
	private Single() {}
	private final static Single single = new Single();
	public static Single getSingle() {
		return single;
	}
}
