/**
 * 
 */
package jp.co.axa.apidemo.configs;

import java.io.ObjectInputFilter.Config;

import org.hibernate.internal.util.collections.BoundedConcurrentHashMap.EvictionPolicy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hazelcast.config.MapConfig;

/**
 * @author Lakshita
 *
 */
@Configuration
public class HazelcastCacheConfiguration {
	final String CACHE_NAME = "employees";
	final String INSTANCE_NAME = "employee-hazelcast-instance";

	/**
	 *
	 * @return - a Hazelcast config for setting up the cache and a caching manager
	 *         internally.
	 */

    @Bean
    public com.hazelcast.config.Config getHazelcastConfig() {

        return new com.hazelcast.config.Config().setInstanceName(INSTANCE_NAME)
                .addMapConfig(
                        new MapConfig()
                                .setName(CACHE_NAME)
//                                .setEvictionPolicy(EvictionPolicy.LRU)  //facing error
                                .setTimeToLiveSeconds(60)
                                .setMaxIdleSeconds(40));
    }
}
