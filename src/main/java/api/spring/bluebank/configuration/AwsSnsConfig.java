package api.spring.bluebank.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;

@Configuration
public class AwsSnsConfig {
	public static final String SECRET_KEY = "";
	public static final String ACCESS_KEY = "AKIA";

	// @Primary annotation gives a higher preference to a bean (when there are
	// multiple beans of the same type).
	@Primary
	// @Bean annotation tells that a method produces a bean that is to be managed by
	// the spring container.
	@Bean
	public AmazonSNSClient getSnsClient() {
		return (AmazonSNSClient) AmazonSNSClientBuilder.standard().withRegion(Regions.US_EAST_1)
				.withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(ACCESS_KEY, SECRET_KEY)))
				.build();
	}
}
