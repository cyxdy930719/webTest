package service;


import dao.IProductDao;
import dao.ProductDaoImpl;
import pojo.Product;
import untilTest.JdbcUntil;

import java.util.List;

public class ProductServiceImpl implements IProductService {
    private IProductDao dao = new ProductDaoImpl();

    @Override
    public List<Product> getLists() {
        return dao.getLists();
    }

    @Override
    public int add(Product product) {
        return dao.add(product);
    }

    @Override
    public int delete(int id) {
        return dao.delete(id);
    }

    @Override
    public Product getOne(int id) {
        return dao.getOne(id);
    }
}
