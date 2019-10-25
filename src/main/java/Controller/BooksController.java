package controller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Book;

@Path("/books")
public class BooksController {
	
	@GET
	@Path("/books/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Book> getAllBooks(){
		return null; //booksList;
	}
	
	@GET
	@Path("/books/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Book getBook(@PathParam(value = "id") Integer id) {
		return null;
	}
	
	@POST
	@Path("/books/add/{id}")
	public Boolean deletebook(@PathParam(value = "id") Integer id) {
		return null;
	}
	
	@PUT
	@Path("/books/update/{id}")
	public Boolean updateBook(@PathParam(value = "id") Integer id) {
		return null;
	}
	
	@DELETE
	@Path("/books/delete/{id}")
	public Boolean deleteBook(@PathParam(value = "id") Integer id) {
		return null;
	}
	
}