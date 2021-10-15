package scope.more;

public class StoreDirectory {
	private Bookstore bookstore;
	private Market market;
	public StoreDirectory(String custId){
		bookstore = new Bookstore(custId);
		market = new Market();
	}

	public int getNumberOfBooks() {
		return bookstore.getNumBooks();
	}

	public int getNumberOfBookstoreEmployees() {
		//implement ###### DONE ######

		return bookstore.getNumEmployees();
	}
	public boolean addNewEmployee(String employeeId){
		//implement ###### DONE ######
		return bookstore.addNewEmployee(employeeId);
	}
	public boolean bookIsInStock(String bookId){
		//implement ###### DONE ######
		return bookstore.bookIsInStock(bookId);
	}
	public boolean addNewBook(String bookId){
		//implement ###### DONE ######
		return bookstore.addNewBook2(bookId);
	}
	public boolean marketCarriesFoodItem(String foodItem){
		//implement ###### DONE ######
		return market.carriesFoodItem(foodItem);
	}
}
