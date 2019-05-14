package ro.msg.learning.shop.configurations;
import org.springframework.beans.factory.annotation.Autowired;
import ro.msg.learning.shop.entities.Location;
import ro.msg.learning.shop.repositories.OrderRepository;


public class ShippingRouteCreator implements ShippingRouteCreatorInterface
{
    @Autowired
    private OrderRepository orderRepository;


    public void getOrderLocation(Integer orderId)
    {
        orderRepository.findById(orderId).ifPresent(orders -> orders.getAddress());
    }


}
