package Single;

/***
 * ����ģʽ ����:��Ŀ�����ڼ�,Single�����ֻ����һ�� 
 * 1.���췽��˽�л�,������ⲿ�޷������µĶ���
 * 2.����ʵ�������׵Ķ���(��ѭ��װԭ��,������Ҫ˽�л�) 
 * 3.��˽�л���ʵ�����������ֻ�ṩ���ⷢ���Ľӿ�,���ṩ�޸Ľӿ�
 * 4.Ϊ��������ⲿ����������Ҳ����ʹ��,����ʹ��static����
 */
public class Single {
	private Single() {}
	private final static Single single = new Single();
	public static Single getSingle() {
		return single;
	}
}
