package ro.msg.learning.shop.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StrategyConfiguration{

    @Value("shipping-strategy")
    private String shippingStrategy;

    @Bean
    public ShippingRouteCreatorInterface createInstanceOfShippingRouteCreator() {
//        return switch (shippingStrategy) {
//            case ("SINGLE_LOCATION"):
//                //return new SingleLocationRouteCreator();
//            case ("MOST_ABUNDANT"):
//                return new  MostAbundantRouteCreator();
//                default: new ShippingRouteCreator();
//        };
        return null;
    }
}
