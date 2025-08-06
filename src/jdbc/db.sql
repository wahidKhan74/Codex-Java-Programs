CREATE TABLE products (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    price DOUBLE,
    stock INT,
    description TEXT
);


 DELIMITER //
 CREATE PROCEDURE FindSaveAndDeletedProduct(
 IN p_id INT
 )
 BEGIN
  DECLARE p_name VARCHAR(150);

  -- Get product name before deletion
  SELECT name INTO p_name FROM products WHERE id = p_id;

   -- Save to product before deleted product
   INSERT INTO deleted_product(`product_name`,`product_id`) VALUES (p_name, p_id);

    -- Delete from products
   DELETE FROM products where id = p_id;

END //
DELIMITER ;

-------------------------------------------------------

DELIMITER //

CREATE PROCEDURE GetProductSummary (
    OUT totalProductCount INT,
    OUT totalPrice DECIMAL(15,2),
    OUT totalStock INT
)
BEGIN
    SELECT
        COUNT(*),
        SUM(price),
        SUM(stock)
    INTO totalProductCount, totalPrice, totalStock
    FROM products;
END //

DELIMITER ;
