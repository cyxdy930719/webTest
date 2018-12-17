package com.neuedu.dao;

import com.neuedu.pojo.Product;
import com.neuedu.untilTest.JdbcUntil;
import com.neuedu.untilTest.RowMap;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProductDaoImpl implements IProductDao {
    @Override
    public List<Product> getLists() {
        return JdbcUntil.executeQuery("select * from product", new RowMap<Product>() {
            @Override
            public Product RowMapping(ResultSet rs) {
                Product p = new Product();
                try {
                    p.setProduct_id(rs.getInt("product_id"));
                    p.setProduct_name(rs.getString("product_name"));
                    p.setPrice(rs.getDouble("price"));
                    p.setProduct_des(rs.getString("product_des"));
                    p.setUrl(rs.getString("url"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return p;
            }
        }, null);
    }

    @Override
    public int add(Product product) {
        return JdbcUntil.executeUpdate("insert into product(product_name,price,product_des,url) values(?,?,?,?)",product.getProduct_name(),product.getPrice(),product.getProduct_des(),product.getUrl());
    }

    @Override
    public int delete(int id) {
        return JdbcUntil.executeUpdate("delete from product where product_id=?",id);
    }

    @Override
    public Product getOne(int id) {
        return JdbcUntil.QueryOne("select * from product where product_id=?", new RowMap<Product>() {
            @Override
            public Product RowMapping(ResultSet rs) {
                Product p = new Product();
                try {
                    p.setProduct_name(rs.getString("product_name"));
                    p.setPrice(rs.getDouble("price"));
                    p.setProduct_des(rs.getString("product_des"));
                    p.setUrl(rs.getString("url"));
                    p.setProduct_id(id);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return p;
            }
        }, id);
    }

    @Override
    public int update(Product product) {
        return JdbcUntil.executeUpdate("update product set product_name=?,price=?,product_des=?,url=? where product_id=?",product.getProduct_name(),product.getPrice(),product.getProduct_des(),product.getUrl(),product.getProduct_id());
    }

}
