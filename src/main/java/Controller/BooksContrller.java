package controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import model.Book;

@Path("/books")
public class BooksContrller {
	
	@GET
	@Produces()
	public List<Book> getAllBooks(){
		return null; //booksList;
	}
	
	@GET
	@Path("/books/{id}")
	public Book getBook(@PathParam(value = "id") String id) {
		return null;
	}
	
	@POST
	@Path("/books/add/{id}")
	public Boolean deletebook() {
		return null;
	}
	
	

}
