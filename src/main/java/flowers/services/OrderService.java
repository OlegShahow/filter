package flowers.services;

import flowers.entities.Order;

import java.util.List;

public interface OrderService {

    public Order findById(long id);

    public List<Order> findAll();

    public void save(Order order);

    public void delete(Order order);
}
