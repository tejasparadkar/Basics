class Product
{
	long productId;
	String productName;
	String productBrand;
	double productPrice;
	Product(long productId, String productName, String productBrand, double productPrice)
	{
		this.productId=productId;
		this.productName=productName;
		this.productBrand=productBrand;
		this.productPrice=productPrice;
	}
	public void productDetails()
	{
		System.out.println("Product ID: "+productId);
		System.out.println("Product Name: "+productName);
		System.out.println("Product Brand: "+productBrand);
		System.out.println("Product Price: "+productPrice);
		System.out.println("=========================");
	}
	public static void main(String[] args) 
	{
		Product p1=new Product(12345,"XC90","Volvo",567889);
		p1.productDetails();
		Product p2=new Product(6789,"GLA","Mercedes",543534);
		p2.productDetails();
		Product p3=new Product(123789,"X1","BMW",243567);
		p3.productDetails();
		
	}
}
