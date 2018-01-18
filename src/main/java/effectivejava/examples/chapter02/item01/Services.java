// Service provider framework sketch

// Noninstantiable class for service registration and access - Pages 8-9
package effectivejava.examples.chapter02.item01;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author effectivejava 2rd
 * @since 2018/1/13
 */
public class Services {
	private Services() {
	} // Prevents instantiation (Item 4)

	/**Maps service names to services*/
	private static final Map<String, Provider> PROVIDERS = new ConcurrentHashMap<>();
	private static final String DEFAULT_PROVIDER_NAME = "<def>";

	/**Provider registration API*/
	public static void registerDefaultProvider(Provider p) {
		registerProvider(DEFAULT_PROVIDER_NAME, p);
	}

	public static void registerProvider(String name, Provider p) {
		PROVIDERS.put(name, p);
	}

	/** Service access API*/
	public static Service newInstance() {
		return newInstance(DEFAULT_PROVIDER_NAME);
	}

	public static Service newInstance(String name) {
		Provider p = PROVIDERS.get(name);
		if (p == null){
			throw new IllegalArgumentException(
					"No provider registered with name: " + name);
		}
		return p.newService();
	}
}
