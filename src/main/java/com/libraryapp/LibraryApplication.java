package com.libraryapp;
import java.time.LocalDate; 
import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.libraryapp.entities.Book;
import com.libraryapp.entities.User;
import com.libraryapp.services.BookService;
import com.libraryapp.services.NotificationService;
import com.libraryapp.services.UserService;
import com.libraryapp.utils.MidnightApplicationRefresh;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

	@Autowired
	BookService bookService;
	
	@Autowired
	UserService usService;
	
	@Autowired
	NotificationService notifService;
	
	@Autowired
	BCryptPasswordEncoder pwEncoder;
	
	@Autowired
	MidnightApplicationRefresh midAppRef;
	
	@Bean
	CommandLineRunner runner() {
		return args -> {

			Date dateofbirth = new Date(1800,12,12);
			String category = "";
			User user1 = new User("admin", pwEncoder.encode("test"), "libadmin@mail.com", "Simon", "Lyndse", "Huizumerlaan 158", "06-11433823", "Amsterdam", dateofbirth);
			user1.setRole("ROLE_ADMIN");

			User user2 = new User("employee", pwEncoder.encode("test"), "cyrille.jones@gamail.com", "Cyrille", "Jones", "Hugo de Grootstraat 174", "06-87054875", "Sliedrecht", dateofbirth);
			user2.setRole("ROLE_EMPLOYEE");

			User user3 = new User("user", pwEncoder.encode("test"), "kevin.leijnse@gmail.com", "Kevin", "Leijnse", "Leidijk 97", "06-18756892", "Groningen", dateofbirth);
			user3.setRole("ROLE_USER");
			User user4 = new User("aniemies", pwEncoder.encode("test"), "annemie.schuurbiers@gmail.com", "Annemie", "Schuurbiers", "Duinerlaan 173", "06-83472443", "Eelde", dateofbirth);
			User user5 = new User("seppe", pwEncoder.encode("test"), "seppe.bruinink@gmail.com", "Seppe", "Bruinink", "Gangboord 90", "06-13644621", "Oosterhout", dateofbirth);
			User user6 = new User("beukenplein", pwEncoder.encode("test"), "m.snel@gmail.com", "Mikael", "Snel", "Onderkampstraat 30", "06-90982738", "Susteren", dateofbirth);
			User user7 = new User("bookwurm", pwEncoder.encode("test"), "bookwurm@gmail.com", "Martina", "Jansen", "Nieuweweg 200", "06-00492182", "Burgum", dateofbirth);
			User user8 = new User("daniela45", pwEncoder.encode("test"), "d.peerdeman@gmail.com", "Daniela", "Peerdeman", "Beukenkamp 84", "06-88720394", "Hoogezand", dateofbirth);
			User user9 = new User("blackandyellow", pwEncoder.encode("test"), "simons@gmail.com", "Gert", "Simons", "Het Kanaal 170", "06-18392031", "Heerlen", dateofbirth);
			User user10 = new User("superman123", pwEncoder.encode("test"), "edo.vandeijck@gmail.com", "Edo", "van Deijck", "Itersonstraat 195", "06-98374821", "Assen", dateofbirth);
			
			usService.save(user1);
			usService.save(user2);
			usService.save(user3);
			usService.save(user4);
			usService.save(user5);
			usService.save(user6);
			usService.save(user7);
			usService.save(user8);
			usService.save(user9);
			usService.save(user10);
			
			Book book1 = new Book("The Pragmatic Programmer", "David Thomas, Andrew Hunt", 2006, 1, category);
			Book book2 = new Book("Clean Code", "Robert C. Martin", 2020, 2, category);
			Book book3 = new Book("Code Complete", "Steve McConnell", 2012, 1, category);
			Book book4 = new Book("Refactoring", "Martin Fowler", 2017, 4, category);
			Book book5 = new Book("Head First Design Patterns", "Eric Freeman, Bert Bates, Kathy Sierra, Elisabeth Robson", 2019, 5, category);
			Book book6 = new Book("The Mythical Man-Month", "Frederick P. Brooks Jr", 1999, 1, category);
			Book book7 = new Book("The Clean Coder", "Robert Martin", 2021, 3, category);
			Book book8 = new Book("Working Effectively with Legacy Code", "Micheal Feathers", 2015, 1, category);
			Book book9 = new Book("Design Patterns", "Erich Gamma, Richard Helm. Ralph Johnson, John Vlissides", 2019, 2, category);
			Book book10 = new Book("Cracking the Coding Interview", "Gayle Laakmann McDowell", 2018, 3, category);
			Book book11 = new Book("Rework", "Jason Fried, David Heinemeier Hansson", 2011, 1, category);
			Book book12 = new Book("Don't Make Me Think", "Steve Krug", 2005, 1, category);
			Book book13 = new Book("Code", "Charles Petzold", 2017, 1, category);
			Book book14 = new Book("Peopleware", "Tom DeMarco, Tim Lister", 2013, 3, category);
			Book book15 = new Book("Introduction to Algorithms", "Thomas H. Cormen", 2020, 2, category);
			Book book16 = new Book("Programming Pearls", "Jon Bently", 1998, 1, category);
			Book book17 = new Book("Patterns of Enterprice Application Architecture", "Martin Fowler", 2020, 2, category);
			Book book18 = new Book("Structure and Interpretation of Computer Programs", "Harold Abelson, Gerald Jay Sussman, Julie Sussman", 2013, 1, category);
			Book book19 = new Book("The Art of Computer Programming", "Donald E. Knuth", 2014, 4, category);
			Book book20 = new Book("Domain-Driven Design", "Eric Evans", 2010, 2, category);
			Book book21 = new Book("Coders at Work", "Peter Seibel", 2009, 1, category);
			Book book22 = new Book("Rapid Development", "Steve McConnell", 1995, 6, category);
			Book book23 = new Book("The Self-Taught Programmer", "Cory Althoff", 2021, 1, category);
			Book book24 = new Book("Algorithms", "Robert Sedgewick, Kevin Wayne", 2000, 3, category);
			Book book25 = new Book("Continuous Delivery", "Jez Humble, David Farley", 2003, 1, category);
			
			bookService.save(book1);
			bookService.save(book2);
			bookService.save(book3);
			bookService.save(book4);
			bookService.save(book5);
			bookService.save(book6);
			bookService.save(book7);
			bookService.save(book8);
			bookService.save(book9);
			bookService.save(book10);
			bookService.save(book11);
			bookService.save(book12);
			bookService.save(book13);
			bookService.save(book14);
			bookService.save(book15);
			bookService.save(book16);
			bookService.save(book17);
			bookService.save(book18);
			bookService.save(book19);
			bookService.save(book20);
			bookService.save(book21);
			bookService.save(book22);
			bookService.save(book23);
			bookService.save(book24);
			bookService.save(book25);
			
			book10.setTheUser(user3);
			book10.setReturnDate(LocalDate.of(2021, 5, 23));
			
			book1.setTheUser(user3);
			book1.setReturnDate(LocalDate.of(2021, 5, 05));
			
			user3.setBooks(Arrays.asList(book10, book1));
			
			bookService.save(book1);
			bookService.save(book10);
			usService.save(user3);
						
			midAppRef.midnightApplicationRefresher();	
		};
	}
}
