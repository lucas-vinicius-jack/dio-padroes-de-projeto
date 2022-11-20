package dio.digital.gof.Singleton;

public class SingletonLazyHolder {

	public static class InstanceHolder{
		private static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
		
	private SingletonLazyHolder() {
		super();
	}
	
	
	public static SingletonLazyHolder getIntancia() {
		return InstanceHolder.instancia;
	}
	
}
