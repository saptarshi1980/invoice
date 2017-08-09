SELECT DISTINCT CONCAT(a.seller_code,'(',b.seller_name,')') FROM purchase_master a,seller_master b WHERE a.seller_code=b.seller_code

SELECT seller_invoice_no FROM purchase_master WHERE TRIM(seller_code)=''

SELECT seller_invoice_date,UPPER(item_description) FROM purchase_master  WHERE TRIM(seller_invoice_no)='TEST INVOICE2'

SELECT quantity,IFNULL(unit,' '),unit_purchase_price,tax_percent,item_code,discount_percent,unit_selling_price FROM purchase_master WHERE seller_invoice_no= AND UPPER(item_description)=

SELECT DATE_FORMAT(seller_invoice_date,'%d-%m-%Y'),UPPER(item_description) FROM purchase_master  WHERE UPPER(TRIM(seller_invoice_no))='TEST INVOICE2'

SELECT CONCAT(item_code,'(',item_description,')') FROM item_master WHERE segment = 