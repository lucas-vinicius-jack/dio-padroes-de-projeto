package dio.digital.gof;

import dio.digital.gof.Singleton.SingletonEager;
import dio.digital.gof.Singleton.SingletonLazy;
import dio.digital.gof.Singleton.SingletonLazyHolder;

public class TesteSingleton {

	public static void main(String[] args) {
		
		// Testes com padroes de projeto Singleton
		SingletonLazy lazy = SingletonLazy.getIntancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getIntancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getIntancia();
		System.out.println(eager);
		eager = SingletonEager.getIntancia();
		System.out.println(eager); 
		
		SingletonLazyHolder holder = SingletonLazyHolder.getIntancia();
		System.out.println(holder);
		holder = SingletonLazyHolder.getIntancia();
		System.out.println(holder); 
	}
}
